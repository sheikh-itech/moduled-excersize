package module.base.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration(proxyBeanMethods = false)
@Profile("dev")
public class DevConfiguration {

	private long input;
	private String user;
	
	public DevConfiguration() {
		
	}

	public long getInput() {
		return input;
	}

	public void setInput(long input) {
		this.input = input;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
