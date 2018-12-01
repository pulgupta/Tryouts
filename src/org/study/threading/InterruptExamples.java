package org.study.threading;

/**
 * In this class we are showing the way to handle interrupts in Java threads.
 * We have to option to handle the exception and keep the thread running to execute 
 * the remaining instructions or else we can propagate the exception and can stop
 * the thread from executing.
 * 
 * There is one more important thing which we can observe here is that if one thread
 * fails and throws exception then also other threads will be insulated to it.
 * @author pulgupta
 */
public class InterruptExamples extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Approach 2 propagating exception");
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]) throws InterruptedException {
		InterruptExamples t1 = new InterruptExamples();
		t1.start();
		t1.interrupt();
		System.out.println("This is in main method");
		t1.join();
		Thread.sleep(5000);
		System.out.println("To see if the main is still executing");
	}
}