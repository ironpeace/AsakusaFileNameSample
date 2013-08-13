package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import ironpeace.modelgen.dmdl.model.SampleModel;
import java.io.IOException;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>sample_model</code>を読み出す
 */
public final class SampleModelInput implements ModelInput<SampleModel> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public SampleModelInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(SampleModel model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getFileNameOption());
        parser.fill(model.getKeycodeOption());
        parser.fill(model.getData01Option());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}