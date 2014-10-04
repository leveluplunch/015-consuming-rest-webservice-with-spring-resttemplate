package demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SparkStreamWrapper {

	@JsonProperty("_doc")
	private DocWrapper docWrapper;

	public DocWrapper getDocWrapper() {
		return docWrapper;
	}

	public void setDocWrapper(DocWrapper docWrapper) {
		this.docWrapper = docWrapper;
	}
	
	
}
