package demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Class represents the entire JSON response
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SparkResponseWrapper {

	private SparkStreamWrapper stream;

	public SparkStreamWrapper getStream() {
		return stream;
	}

	public void setStream(SparkStreamWrapper stream) {
		this.stream = stream;
	}
	
	
}
