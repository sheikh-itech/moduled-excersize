package module.base.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import module.base.config.ReferenceProperties;
import module.base.services.InjectionDemoService;

@RestController
@RequestMapping("/injection")
//@RestController("/injection") -> This won't work
public class InjectionController {

	@Autowired
	private InjectionDemoService service;
	
	@Autowired
	private ApplicationArguments args;//To get supplied arguments
	@Autowired
	private ReferenceProperties config;
	
	@RequestMapping("/constructor")
	void constructorInjection() {
		  service.isInjected();
		  for(String a:args.getSourceArgs())
			  System.out.println(a);
	}
}
