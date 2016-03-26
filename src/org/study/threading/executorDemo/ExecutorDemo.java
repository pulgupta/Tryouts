package org.study.threading.executorDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * In this class we will see 3 major concepts
 * 1. ThreadPool(using ExecutorService)
 * 2. Callable Interface implementations
 * 3. Future interface
 * 4. Future Task
 * @version 1.0 2016-03-26
 * @author pulgupta
 *
 */
public class ExecutorDemo {

	public static void main(String[] args) {
		
		//Create a thread pool
		ExecutorService pool = Executors.newFixedThreadPool(10);
		//Creating a callable implementation interface
		Callable<Integer> pt = new PerformTask();
		//When we will submit this to the thread pool we will get a future object
		Future<Integer> result = pool.submit(pt);
		
		System.out.println("Doing the same thing using the Future task method");

		Callable<Integer> pt2 = new PerformTask();
		//In this approach we will convert the callable into a futureTask
		//We will then submit this to thread pool and will use the same to get the result.
		FutureTask<Integer> ft = new FutureTask<>(pt2);
		pool.submit(ft);
		
		try {
			System.out.println(result.get());
			System.out.println(ft.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.shutdown();
		
		
	}
}
