package module.base.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;
	
	public Student() {
		name = "Student";
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
