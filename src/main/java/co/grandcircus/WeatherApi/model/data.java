package co.grandcircus.WeatherApi.model;
/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
import java.util.List;

public class data {
	
	private List<String> text;


	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

	@Override
	public String toString() {
//		return "Weather [text=" + text + "]";
		
		
		return String.format("%-5s", getText().toString().replace("[", "").replace("]", ""));
	}
	
	
}
