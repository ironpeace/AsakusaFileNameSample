package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.SampleModel;
import java.io.IOException;
/**
 * <code>sample_model</code>をTSVなどのレコード形式で出力する。
 */
public final class SampleModelOutput implements ModelOutput<SampleModel> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public SampleModelOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(SampleModel model) throws IOException {
        emitter.emit(model.getFileNameOption());
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getData01Option());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}