package org.study.threading;

class OddPrint implements Runnable {
	 
	static boolean flag = true;
	private Object lock = null;
 
	public OddPrint(Object lock) {
		this.lock = lock;
	}
 
	public void run() {
 
		for (int i = 1; i <= 99; i = i + 2) {
			synchronized (lock) {
				while (!flag) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("Error in Thread 1: "
								+ e.getMessage());
					}
				}
				System.out.println("Thread 1: " + i);
				flag = false;
				lock.notifyAll();
			}
 
		}
	}
}
 
class EvenPrint implements Runnable {
 
	private Object lock = null;
 
	public EvenPrint(Object lock) {
		this.lock = lock;
	}
 
	public void run() {
 
		for (int i = 2; i <= 100; i = i + 2) {
			synchronized (lock) {
				while (OddPrint.flag) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("Error in Thread 2: "
								+ e.getMessage());
					}
				}
				System.out.println("Thread 2: " + i);
				OddPrint.flag = true;
				lock.notifyAll();
			}
 
		}
	}
 
}
 
public class SequentialUsingThreads {
 
	private static Object lock = new Object();
 
	public static void main(String[] args) {
		new Thread(new OddPrint(lock)).start();
		new Thread(new EvenPrint(lock)).start();
	}
}
