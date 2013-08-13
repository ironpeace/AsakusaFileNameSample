package ironpeace.batchapp.fnsBatch.sampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputValue;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.ExSampleModelCsvFormat;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
/**
 */
public final class ShuffleValue extends AbstractDirectOutputValue {
    /**
     * Creates a new instance.
     */
    public ShuffleValue() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(ExSampleModel.class, "fns/output", ExSampleModelCsvFormat.
                    class, Naming0001.class, Ordering0001.class)});
    }
}