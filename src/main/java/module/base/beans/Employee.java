package module.base.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	
	public Employee() {
		name = "Employee";
	}
	
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
