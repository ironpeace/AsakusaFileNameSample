package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.model.ExSampleModel;
import ironpeace.modelgen.dmdl.model.SampleModel;
import ironpeace.operator.SampleOperatorFactory;
import ironpeace.operator.SampleOperatorFactory.Updated;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Extend;

@JobFlow(name="SampleJobFlow")
public class SampleJobFlow extends FlowDescription {
	
	final In<SampleModel> sm;
	final Out<ExSampleModel> ex;
	
	public SampleJobFlow(
			@Import(name="samplemodel", description=SampleModelFromCsv.class)
			In<SampleModel> sm,
			@Export(name="exsamplemodel", description=SampleModelToCsv.class)
			Out<ExSampleModel> ex
			){
		this.sm = sm;
		this.ex = ex;
	}
	

	@Override
	protected void describe() {
		CoreOperatorFactory cp = new CoreOperatorFactory();
		SampleOperatorFactory op = new SampleOperatorFactory();
		
		Extend<ExSampleModel> extended = cp.extend(sm, ExSampleModel.class);
		Updated updated = op.updated(extended.out);
		this.ex.add(updated.out);
	}

}
