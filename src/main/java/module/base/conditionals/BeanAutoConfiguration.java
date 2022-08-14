package module.base.conditionals;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 *	You can use the value attribute to specify beans by type or name to specify beans by name
 *  The search attribute lets you limit the ApplicationContext hierarchy that should be
 *  considered when searching for beans
 *  
 *  The someService bean is going to be created if no bean of type SomeService
 *  is already contained in the ApplicationContext
 */

@AutoConfiguration
public class BeanAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public SomeService someService() {
		return new SomeService();
	}
}
