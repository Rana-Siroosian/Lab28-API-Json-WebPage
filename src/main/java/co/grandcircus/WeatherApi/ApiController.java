package co.grandcircus.WeatherApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.WeatherApi.model.WeatherResponse;

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
			@RequestParam("longitude") String lon) {
		
		
		WeatherResponse res = apiServ.findLocation(lat, lon);
		
//		if(res == null) {
//			return new ModelAndView ("redirect:/");
//		}
				ModelAndView mav = new ModelAndView ("weather");

		System.out.println(res);
		mav.addObject("weather", res);
		
		return mav;
	}
}
