package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractExSampleModelCsvOutputDescription;


public class SampleModelToCsv extends AbstractExSampleModelCsvOutputDescription {

	@Override
	public String getBasePath() {
		return "fns/output";
	}

	@Override
	public String getResourcePattern() {
		return "sample-data.csv";
	}

}
