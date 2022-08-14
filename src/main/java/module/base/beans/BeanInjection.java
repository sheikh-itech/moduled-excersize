package module.base.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BeanInjection {

	private String injectionType;
	@Value("${my.secret}")
	private String secrete;
	@Value("${reference.subjects}")
	private List<String> subjects;
	
	public BeanInjection() {
		this.injectionType = "Constructor";
	}
	
	@EventListener
	public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
		
	  switch (event.getState()) {
	  
	  	case ACCEPTING_TRAFFIC:
	  		System.out.println("Healthy");
	  		// create file /tmp/healthy
	  		break;
	  	case REFUSING_TRAFFIC:
	  		System.out.println("Refusing Traffic");
	  		// remove file /tmp/healthy
	  		break;
	  }
	}

	public String getInjectionType() {
		return injectionType;
	}

	public void setInjectionType(String injectionType) {
		this.injectionType = injectionType;
	}

	public String getSecrete() {
		return secrete;
	}

	public void setSecrete(String secrete) {
		this.secrete = secrete;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
}
