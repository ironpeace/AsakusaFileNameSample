package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
/**
 * An abstract implementation of {@link ExSampleModel} importer description using Direct I/O CSV.
 */
public abstract class AbstractExSampleModelCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends ExSampleModel> getModelType() {
        return ExSampleModel.class;
    }
    @Override public Class<ExSampleModelCsvFormat> getFormat() {
        return ExSampleModelCsvFormat.class;
    }
}