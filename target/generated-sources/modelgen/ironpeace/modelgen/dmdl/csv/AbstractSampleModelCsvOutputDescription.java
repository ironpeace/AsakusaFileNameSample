package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.SampleModel;
/**
 * An abstract implementation of {@link SampleModel} exporter description using Direct I/O CSV.
 */
public abstract class AbstractSampleModelCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends SampleModel> getModelType() {
        return SampleModel.class;
    }
    @Override public Class<SampleModelCsvFormat> getFormat() {
        return SampleModelCsvFormat.class;
    }
}