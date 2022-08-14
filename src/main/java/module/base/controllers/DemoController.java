package module.base.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import module.base.beans.Employee;
import module.base.beans.Student;

@RestController
@RequestMapping("demo")
public class DemoController {

	@Autowired
	private Student s;
	@Autowired
	private Employee e;
	
	@RequestMapping(value="1")
	public List<Object> demo() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(s);
		lst.add(e);
		
		return lst;
	}
}
