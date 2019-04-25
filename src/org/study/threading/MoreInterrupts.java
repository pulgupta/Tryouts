package org.study.threading;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		while(true) {
			// Assume we are doing something important here
			if(Thread.currentThread().isInterrupted()) {
				System.out.println("We have to stop as someone has interrupted");
				break;
			}
			System.out.println("Thread is working very hard");
		}
	}
	
}

public class MoreInterrupts {

	public static void main(String args[]) {
		Thread t = new Thread(new MyRunnable());
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.interrupt();
	}
}
