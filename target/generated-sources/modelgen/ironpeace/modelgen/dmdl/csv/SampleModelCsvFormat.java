package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.runtime.directio.BinaryStreamFormat;
import com.asakusafw.runtime.directio.util.DelimiterRangeInputStream;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.csv.CsvConfiguration;
import com.asakusafw.runtime.io.csv.CsvEmitter;
import com.asakusafw.runtime.io.csv.CsvParser;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.model.SampleModel;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/**
 * CSV format for {@link SampleModel}.
 */
public final class SampleModelCsvFormat extends BinaryStreamFormat<SampleModel> {
    /**
     * Returns this CSV format configuration.
     * @param head whether configure for head of file or not
     * @return CSV format configuration
     */
    protected CsvConfiguration getConfiguration(boolean head) {
        List<String> headers = new ArrayList<String>();
        if(head) {
            headers.add("keycode");
            headers.add("data01");
        }
        CsvConfiguration config = new CsvConfiguration(Charset.forName("UTF-8"), headers, "true", "false", "yyyy-MM-dd", 
                "yyyy-MM-dd HH:mm:ss");
        config.setLineBreakInValue(false);
        return config;
    }
    @Override public Class<SampleModel> getSupportedType() {
        return SampleModel.class;
    }
    @Override public long getPreferredFragmentSize() {
        return -1L;
    }
    @Override public long getMinimumFragmentSize() {
        return Long.MAX_VALUE;
    }
    @Override public ModelInput<SampleModel> createInput(Class<? extends SampleModel> dataType, String path, InputStream 
            stream, long offset, long fragmentSize) throws IOException {
        if(dataType == null) {
            throw new IllegalArgumentException("dataType must not be null");
        }
        if(path == null) {
            throw new IllegalArgumentException("path must not be null");
        }
        if(stream == null) {
            throw new IllegalArgumentException("stream must not be null");
        }
        InputStream fragmentInput;
        fragmentInput = new DelimiterRangeInputStream(stream, '\n', fragmentSize, offset > 0L);
        CsvParser parser = new CsvParser(fragmentInput, path, this.getConfiguration(offset == 0L));
        return new Reader(parser);
    }
    @Override public ModelOutput<SampleModel> createOutput(Class<? extends SampleModel> dataType, String path, 
            OutputStream stream) throws IOException {
        if(path == null) {
            throw new IllegalArgumentException("path must not be null");
        }
        if(stream == null) {
            throw new IllegalArgumentException("stream must not be null");
        }
        CsvEmitter emitter = new CsvEmitter(stream, path, this.getConfiguration(true));
        return new Writer(emitter);
    }
    private static final class Reader implements ModelInput<SampleModel> {
        private final CsvParser parser;
        private final StringOption pathText;
        Reader(CsvParser parser) {
            this.parser = parser;
            pathText = new StringOption(parser.getPath());
        }
        @Override public boolean readTo(SampleModel object) throws IOException {
            if(parser.next() == false) {
                return false;
            }
            object.setFileNameOption(pathText);
            parser.fill(object.getKeycodeOption());
            parser.fill(object.getData01Option());
            parser.endRecord();
            return true;
        }
        @Override public void close() throws IOException {
            parser.close();
        }
    }
    private static final class Writer implements ModelOutput<SampleModel> {
        private final CsvEmitter emitter;
        Writer(CsvEmitter emitter) {
            this.emitter = emitter;
        }
        @Override public void write(SampleModel object) throws IOException {
            emitter.emit(object.getKeycodeOption());
            emitter.emit(object.getData01Option());
            emitter.endRecord();
        }
        @Override public void close() throws IOException {
            emitter.close();
        }
    }
}