package ironpeace.batchapp.fnsBatch.sampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
import ironpeace.modelgen.dmdl.model.SampleModel;
import ironpeace.operator.SampleOperatorImpl;
/**
 * {@code [in->extend(operator#1864311781)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<SampleModel> {
    private final Result<ExSampleModel> out;
    private ExSampleModel cache = new ExSampleModel();
    private SampleOperatorImpl op = new SampleOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param out {@code SampleOperator.updated#out}への出力
     */
    public MapFragment1(Result<ExSampleModel> out) {
        this.out = out;
    }
    @Override public void add(SampleModel result) {
        this.cache.reset();
        this.cache.setData01Option(result.getData01Option());
        this.cache.setKeycodeOption(result.getKeycodeOption());
        this.cache.setFileNameOption(result.getFileNameOption());
        this.op.updated(this.cache);
        this.out.add(this.cache);
    }
}