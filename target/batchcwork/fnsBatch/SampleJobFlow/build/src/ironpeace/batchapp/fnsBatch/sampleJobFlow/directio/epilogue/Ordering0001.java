package ironpeace.batchapp.fnsBatch.sampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
/**
 * An ordering output "exsamplemodel" class for "directio".
 */
public final class Ordering0001 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0001() {
        super();
    }
    @Override public void set(Object rawObject) {
        ExSampleModel object = (ExSampleModel) rawObject;
    }
}