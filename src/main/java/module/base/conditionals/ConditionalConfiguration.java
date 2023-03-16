package module.base.conditionals;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@AutoConfiguration
public class ConditionalConfiguration {

	
	@Configuration(proxyBeanMethods = false)
	@ConditionalOnClass(SomeService.class)
	public static class SomeServiceConfiguration {
		
		@Bean
		@ConditionalOnMissingBean
		public SomeService someService() {
			return new SomeService();
		}
	}
}
