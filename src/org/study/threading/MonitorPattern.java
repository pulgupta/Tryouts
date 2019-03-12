package org.study.threading;

/**
 * The aim of this snippet is to show why it is beneficial to use a separate mutex for locking and 
 * why we should avoid instance and class level locks.
 * @author pulgupta
 */
class Task {

	private final Object Mutex = new Object();
	private static int counter = 0;

	// This is an instance method and so it is locked on the this instance
	synchronized public void incrementCounterSafely() {
		System.out.println("Using this instance as the lock");
		for (int i = 0; i < 10; i++)
			System.out.print(counter++ + " ");
	}

	// This is locked on the mutex which we have created above
	public void incrementCounterSafelyUsingMutex() {
		System.out.println("Using the mutex for locking");
		synchronized (Mutex) {
			for (int i = 0; i < 10; i++)
				System.out.print(counter++ + " ");

		}
	}
}

public class MonitorPattern {
	
	// We have created our own method outside the task class which is using the task instance to lock the method.
	// As we are using task instance variable this will compete for lock with the incrementCounterSafely() method
	public static void letsLeakLock(Task task) throws InterruptedException {
		synchronized (task) {
			Thread.sleep(10000);
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		Task task = new Task();
		// Both the methods are using different locks and so printing will be random
		Thread thread1 = new Thread(() -> task.incrementCounterSafely());
		Thread thread2 = new Thread(() -> task.incrementCounterSafelyUsingMutex());
		Thread thread3 = new Thread(() -> {
			try {
				letsLeakLock(task);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		// The below behavior can also be random but in most of the cases it will be like this only
		// Thread 3 will start and will lock task instance
		thread3.start();
		// Thread one will start but this will not be able to execute as thread 3 has already locked task instance
		thread1.start();
		// This will be printed first(Mutex one) as no other method can get a lock on mutex outside of the task class
		thread2.start();
	}
}
