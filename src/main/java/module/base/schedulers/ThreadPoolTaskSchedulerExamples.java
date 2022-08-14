package module.base.schedulers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class ThreadPoolTaskSchedulerExamples {

	@Autowired
	private ThreadPoolTaskScheduler scheduler;
	
	public ThreadPoolTaskSchedulerExamples() {
		
		if(null!=scheduler) {
			
			scheduler.schedule(new RunnableTask("Specific time, 3 Seconds from now"), 
					new Date(System.currentTimeMillis() + 3000));
		}
	}
	
	public void scheduleTask() {
		
		if(null!=scheduler) {
			
			scheduler.schedule(new RunnableTask("Specific time, 3 Seconds from now"), 
					new Date(System.currentTimeMillis() + 3000));
		}		
	}
}
