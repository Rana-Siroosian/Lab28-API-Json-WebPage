package co.grandcircus.WeatherApi.model;

/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

	@JsonProperty("latitude")
	private String latitudes;
	@JsonProperty("longitude")
	private String longitudes;

	public String getLatitudes() {
		return latitudes;
	}

	public void setLatitudes(String latitudes) {
		this.latitudes = latitudes;
	}

	public String getLongitudes() {
		return longitudes;
	}

	public void setLongitudes(String longitudes) {
		this.longitudes = longitudes;
	}

	@Override
	public String toString() {
//		return "Location [latitudes=" + latitudes + ", longitudes=" + longitudes + "]";

		return String.format("%-5s%-10s%-10s%-10s%-10s", "Location: ", "Latitude: ", getLatitudes(), "Longitude: ",
				getLongitudes());
	}

}
