package ironpeace.batchapp.fnsBatch.sampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
/**
 * A naming output "exsamplemodel" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "sample-data.csv"));
    }
    @Override public void set(Object rawObject) {
        ExSampleModel object = (ExSampleModel) rawObject;
    }
}