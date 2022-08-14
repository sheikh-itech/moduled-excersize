package module.base;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootConfiguration(proxyBeanMethods = false)
//@EnableAutoConfiguration
//@Import({ SomeConfiguration.class, AnotherConfiguration.class })

//Same as @SpringBootConfiguration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
@EnableScheduling
public class MainApp 
{
    public static void main( String[] args )
    {
    	SpringApplication app = new SpringApplication(MainApp.class);
    	app.setBannerMode(Banner.Mode.OFF);
    	args = new String[]{"TestData1", "TestData2"};
    	//app.setAdditionalProfiles("dev");
    	//Application Startup tracking
    	//Provide for recording-> -XX:StartFlightRecording:filename=recording.jfr,duration=10s
    	//ApplicationStartup applicationStartup = new BufferingApplicationStartup(2048);
    	//app.setApplicationStartup(applicationStartup);
    	
    	app.run(args);
    }
}

/**			@SpringBootApplication
 * 
 * 	This annotation tells Spring Boot to “guess” how you want to configure Spring,
 * 	based on the jar dependencies added
 * 	
 * 	Since spring-boot-starter-web adds Tomcat and Spring MVC, the auto-configuration
 * 	Or @SpringBootApplication assumes that you are developing a web application
 * 	and sets up Spring accordingly
 * 
 * 			Starters and Auto-configuration
 * 
 * 	Auto-configuration is designed to work well with “Starters”,
 * 	but the two concepts are not directly tied.
 * 	You are free to pick and choose jar dependencies outside of the starters.
 * 	SpringBoot still does its best to auto-configure your application
 * 
 * 			SpringApplication.run()
 * 
 * 	SpringApplication bootstraps our application, starting Spring,
 * 	which, in turn, starts the auto-configured Tomcat web server
 * 
 * 	We need to pass MyApplication.class as an argument to the run method
 * 	to tell SpringApplication which is the primary Spring component
 * 
 *  			*****Starters*****
 *  
 *  The starters contain a lot of the dependencies that you need to get a project up and
 *  running quickly and with a consistent, supported set of managed transitive dependencies
 */
