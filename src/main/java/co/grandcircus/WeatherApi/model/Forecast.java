package co.grandcircus.WeatherApi.model;

public class Forecast {

	private String day;
	private String weatherStatus;

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getWeatherStatus() {
		return weatherStatus;
	}

	public void setWeatherStatus(String weatherStatus) {
		this.weatherStatus = weatherStatus;
	}

	@Override
	public String toString() {
		return "Forecast [day=" + day + ", weatherStatus=" + weatherStatus + "]";
	}

	public Forecast(String day, String weatherStatus) {
		super();
		this.day = day;
		this.weatherStatus = weatherStatus;
	}

}
