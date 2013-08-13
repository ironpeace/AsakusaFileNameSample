package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
import java.io.IOException;
/**
 * <code>ex_sample_model</code>をTSVなどのレコード形式で出力する。
 */
public final class ExSampleModelOutput implements ModelOutput<ExSampleModel> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public ExSampleModelOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(ExSampleModel model) throws IOException {
        emitter.emit(model.getFileNameOption());
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getData01Option());
        emitter.emit(model.getTermOption());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}