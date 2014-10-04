package demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocWrapper {
	
	@JsonProperty("location")
	WimpWeatherLocationWrapper location;

	public WimpWeatherLocationWrapper getLocation() {
		return location;
	}

	public void setLocation(WimpWeatherLocationWrapper location) {
		this.location = location;
	}

}
