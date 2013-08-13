package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
import java.io.IOException;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>ex_sample_model</code>を読み出す
 */
public final class ExSampleModelInput implements ModelInput<ExSampleModel> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public ExSampleModelInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(ExSampleModel model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getFileNameOption());
        parser.fill(model.getKeycodeOption());
        parser.fill(model.getData01Option());
        parser.fill(model.getTermOption());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}