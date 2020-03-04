package co.grandcircus.WeatherApi;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.WeatherApi.model.WeatherResponse;
/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
@Component
public class ApiService {
	
	private RestTemplate rt;

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "ooeeee!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public WeatherResponse findLocation (String lat, String lon){
		
		String url = "https://forecast.weather.gov/MapClick.php?lat="+lat+"&lon="+lon+"&FcstType=json";
	
		WeatherResponse response = rt.getForObject(url, WeatherResponse.class);;
//		try {
//			response = rt.getForObject(url, WeatherResponse.class);
//		}catch(RestClientException r) {
//			System.out.println("URL not found!");
//		}
	
		return response;
	}
	
	
}
