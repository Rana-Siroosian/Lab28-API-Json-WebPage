package co.grandcircus.WeatherApi.model;

/**
 * 
 * @author >>RanaSiroosian<<
 *
 */

public class WeatherResponse {

	public data data;
	private Location location;
	public Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public data getData() {
		return data;
	}

	public void setData(data data) {
		this.data = data;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "WeatherResponse [data=" + data + ", location=" + location + ", time=" + time + "]";
	}

}
