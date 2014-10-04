package demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WimpWeatherLocationWrapper {
	
	private String longValue;
	
	private String city;
	private String state;
	private String country;
	private String lat;
	private String lng;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLongValue() {
		return longValue;
	}
	public void setLongValue(String longValue) {
		this.longValue = longValue;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "WimpWeatherLocationWrapper [longValue=" + longValue + ", city="
				+ city + ", state=" + state + ", country=" + country + ", lat="
				+ lat + ", lng=" + lng + "]";
	}

}
