package module.base.rest_template;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class UsingRestTemplateBuilder {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	 
	return builder
		.setConnectTimeout(Duration.ofMillis(3000))
		.setReadTimeout(Duration.ofMillis(3000))
		.build();
	}
}
