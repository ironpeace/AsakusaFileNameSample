package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.ExSampleModel;

import com.asakusafw.vocabulary.operator.Update;

public abstract class SampleOperator {
	
	@Update
	public void updated(ExSampleModel ex){
		System.out.println("filename : " + ex.getFileNameAsString());
		String paths[] = ex.getFileNameAsString().split("/");
		String filename = paths[paths.length - 1];
		ex.setTermAsString(filename.substring(11,15));
	}

}
