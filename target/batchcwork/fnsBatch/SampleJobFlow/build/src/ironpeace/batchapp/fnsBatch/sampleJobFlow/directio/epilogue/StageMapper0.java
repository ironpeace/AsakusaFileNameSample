package ironpeace.batchapp.fnsBatch.sampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
/**
 */
public final class StageMapper0 extends AbstractDirectOutputMapper<ExSampleModel> {
    /**
     * Creates a new instance.
     */
    public StageMapper0() {
        super(0, ShuffleKey.class, ShuffleValue.class);
    }
}