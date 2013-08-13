package ironpeace.batchapp.fnsBatch.sampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import com.asakusafw.runtime.stage.output.StageOutputDriver;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
import ironpeace.modelgen.dmdl.model.SampleModel;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;
/**
 * {@code [in->extend(operator#1864311781){owner=FlowBlock&#64;648734830}]}の処理を担当するマッププログラム。
 */
@SuppressWarnings("deprecation") public final class StageMapper1 extends Mapper<NullWritable, SampleModel, NullWritable, 
        NullWritable> {
    private SampleModel cache = new SampleModel();
    private RuntimeResourceManager runtimeResourceManager;
    private StageOutputDriver outputs;
    private MapFragment1 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        this.outputs = new StageOutputDriver(context);
        final Result<ExSampleModel> output = outputs.getResultSink("result0");
        this.line = new MapFragment1(output);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.outputs.close();
        this.outputs = null;
        this.line = null;
    }
    @Override public void run(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
        }
        this.cleanup(context);
    }
}