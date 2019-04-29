package org.study.threading.custom.executor.framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * We know how to interrupt a simple thread.
 * Things get a little tricky when we are working with executor framework.
 * @author pulgupta
 *
 */

class MyCallable implements Callable<Integer> {

	int data;
	
	public MyCallable(int data) {
		this.data = data;
	}
	
	@Override
	public Integer call() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("**INTERRUPT WARNING**");
			}
			if(Thread.currentThread().isInterrupted())
				return -1;
		}
	}
	
}
public class InterruptWithExecutorFramework {

	ExecutorService pool;
	
	public InterruptWithExecutorFramework() {
		pool = Executors.newFixedThreadPool(10);
	}
	
	public static void main(String[] args) {
		InterruptWithExecutorFramework obj = new InterruptWithExecutorFramework();
		Callable<Integer> task1 = new MyCallable(1);
		Callable<Integer> task2 = new MyCallable(2);
		Callable<Integer> task3 = new MyCallable(3);
		Callable<Integer> task4 = new MyCallable(4);
		
		Future<Integer> future1 = obj.pool.submit(task1);
		Future<Integer> future2 = obj.pool.submit(task2);
		Future<Integer> future3 = obj.pool.submit(task3);
		Future<Integer> future4 = obj.pool.submit(task4);
		
		try {
			System.out.println(future2.cancel(true));
			System.out.println(future1.get());
			System.out.println(future3.get());
			System.out.println(future4.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}
	
}
