package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractSampleModelCsvInputDescription;

public class SampleModelFromCsv extends AbstractSampleModelCsvInputDescription {

	@Override
	public String getBasePath() {
		return "fns/input";
	}

	@Override
	public String getResourcePattern() {
		return "sample-data*.csv";
	}

}
