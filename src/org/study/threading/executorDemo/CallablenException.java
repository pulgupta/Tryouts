package org.study.threading.executorDemo;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * What we learn from this example is that we can throw a checked exception from
 * a Callable. This is not the case with a runnable.
 * When we will do a Future.get at that moment we will get back the exception.
 * Else if we are not doing a Future.get there will be no sigh of exception in our code.
 * @author pulgupta
 *
 */
class CallableExceptionTest implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		throw new IOException();
		//return 0;
	}
	
}

public class CallablenException {

	public static void main(String[] args)  {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> future = executor.submit(new CallableExceptionTest());
		while(true) {
			if(future.isDone())
				break;
		}
		try {
			Integer i = future.get();
			System.out.println("Value of i is " + i);
		} 
		catch (Exception e) {
			System.out.println("ExecutionException " + e.getCause());
			//e.printStackTrace();
		}
		finally{
			//This will make sure the executor is shutdown so that we cannot submit
			//more tasks to it
			executor.shutdown();
		}
	}
}
