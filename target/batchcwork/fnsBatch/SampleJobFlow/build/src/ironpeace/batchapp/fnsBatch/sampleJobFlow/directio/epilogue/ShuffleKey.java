package ironpeace.batchapp.fnsBatch.sampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.ExSampleModelCsvFormat;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
/**
 */
public final class ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(ExSampleModel.class, "fns/output", ExSampleModelCsvFormat.
                    class, Naming0001.class, Ordering0001.class)});
    }
}