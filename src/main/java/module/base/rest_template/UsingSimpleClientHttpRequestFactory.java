package module.base.rest_template;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class UsingSimpleClientHttpRequestFactory {

	@Bean
	public RestTemplate restTemplate() {
	 
		//var factory = new SimpleClientHttpRequestFactory();
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setConnectTimeout(3000);
		factory.setReadTimeout(3000);
		return new RestTemplate(factory);
	}
}
