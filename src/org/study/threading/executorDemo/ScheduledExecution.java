package org.study.threading.executorDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * To schedule commands in java we can use the ScheduledExecutorService interface.
 * newScheduledThreadPool method of Executors class will give us the object of the 
 * ScheduledExecutorService which we can then use to schedule tasks based on 
 * initial and periodic delays.
 * @author pulgupta
 * OPENPOINT : The scheduler will only take runnable as a command hence we will have
 * to find a way to convert a runnable into a callable and vice versa. 
 */
class ScheduledExecutionTest implements Runnable {

	@Override
	public void run()  {
		// TODO Auto-generated method stub
		System.out.println("inside the call method");
		
	}
	
}
public class ScheduledExecution {
	public static void main(String[] args) {
		//Future<Integer> f = new ScheduledExecutionTest();
		ScheduledExecutorService sec = Executors.newScheduledThreadPool(10);
		sec.scheduleAtFixedRate(new ScheduledExecutionTest(), 5, 2, TimeUnit.SECONDS);
	}
}
