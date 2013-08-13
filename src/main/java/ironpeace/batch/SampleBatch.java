package ironpeace.batch;

import ironpeace.jobflow.SampleJobFlow;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="fnsBatch")
public class SampleBatch extends BatchDescription {

	@Override
	protected void describe() {
		
		run(SampleJobFlow.class).soon();

	}

}
