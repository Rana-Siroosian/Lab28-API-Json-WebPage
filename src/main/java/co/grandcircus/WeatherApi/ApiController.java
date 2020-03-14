package co.grandcircus.WeatherApi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.WeatherApi.model.Forecast;
import co.grandcircus.WeatherApi.model.Time;
import co.grandcircus.WeatherApi.model.WeatherResponse;
/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
@Controller
public class ApiController {
	
	@Autowired 
	private ApiService apiServ;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("request");
	}
	
	@RequestMapping("/weather")
	public ModelAndView showWeather(@RequestParam("latitude") String lat,
			@RequestParam("longitude") String lon,Time time) {
		WeatherResponse res = apiServ.findLocation(lat, lon);
		List<Forecast> forecast= new ArrayList<>();
		int len = res.data.text.length;
		for (int i=0; i<len;i++) {
			forecast.add(new Forecast (res.time.startPeriodName[i], res.data.text[i]));
		}
		ModelAndView mav = new ModelAndView ("weather");

		System.out.println("forecast"+forecast);
		mav.addObject("weather", forecast);
		mav.addObject("location",res.getLocation());
		return mav;
	}
}
