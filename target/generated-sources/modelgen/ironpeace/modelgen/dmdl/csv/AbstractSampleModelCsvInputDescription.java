package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.SampleModel;
/**
 * An abstract implementation of {@link SampleModel} importer description using Direct I/O CSV.
 */
public abstract class AbstractSampleModelCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends SampleModel> getModelType() {
        return SampleModel.class;
    }
    @Override public Class<SampleModelCsvFormat> getFormat() {
        return SampleModelCsvFormat.class;
    }
}