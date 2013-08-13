package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
/**
 * An abstract implementation of {@link ExSampleModel} exporter description using Direct I/O CSV.
 */
public abstract class AbstractExSampleModelCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends ExSampleModel> getModelType() {
        return ExSampleModel.class;
    }
    @Override public Class<ExSampleModelCsvFormat> getFormat() {
        return ExSampleModelCsvFormat.class;
    }
}