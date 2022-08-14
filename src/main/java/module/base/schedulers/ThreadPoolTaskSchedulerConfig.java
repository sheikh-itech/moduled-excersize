package module.base.schedulers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**	
 * Specify whether proxyBeanMethods methods should get proxied in order to enforce
 * bean lifecycle behavior, e.g. to return shared singleton bean instances even
 * in case of direct 'proxyBeanMethods' method calls in user code.
 */ 

@Configuration(proxyBeanMethods=false)
@ComponentScan(
		  basePackages="module.base.schedulers",
		  basePackageClasses={ThreadPoolTaskSchedulerExamples.class})
public class ThreadPoolTaskSchedulerConfig {

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        ThreadPoolTaskScheduler threadPoolTaskScheduler
          = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(5);
        threadPoolTaskScheduler.setThreadNamePrefix(
          "ThreadPoolTaskScheduler");
        return threadPoolTaskScheduler;
    }
}
