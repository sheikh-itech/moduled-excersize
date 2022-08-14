package custom.runners.application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	
    public static void main( String[] args )
    {
    	SpringApplication app = new SpringApplication(App.class);
    	app.setBannerMode(Banner.Mode.OFF);
    	args = new String[]{"TestData1", "TestData2"};
    	app.run(args);
    	
    }
}
