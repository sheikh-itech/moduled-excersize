package module.base.config;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

/**		Type-safe Configuration Properties
 * 
 * 	SpringBoot allows to read prefixed values from properties file
 * 	
 * 	@Value("${property}") sometime cumbersome (may create issue) if properties in Hierarchical Nature
 * 
 * 	alternate is => Beans govern and validate the configuration of your application
 */

@Configuration
@ConfigurationProperties("reference")
@Validated
public class ReferenceProperties {

	private long input;
	@NotNull
	private String user;
	private List<String> subjects;
	@Valid
	private Security security = new Security();
	
	
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
	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public class Security {
		
		private String username;
		private String password;
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
}
