package module.base.services;

import org.springframework.stereotype.Service;

import module.base.beans.BeanInjection;

@Service
public class InjectionDemoService {

	private BeanInjection bean;
	
	public InjectionDemoService(BeanInjection bean) {
		this.bean = bean;
	}
	
	public void isInjected () {
		
		System.out.println("Constructor injection done: "+(null!=bean));
	}
}
