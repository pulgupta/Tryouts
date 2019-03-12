package org.study.threading.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * This is a very simple example where I have shown how can we make sure that a thread is waiting for other threads to complete
 * using countdownlatch
 * @author pulgupta
 *
 */
public class CountDownLatchExample {

	private static CountDownLatch latch = new CountDownLatch(4);

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("T1");
			latch.countDown();
			System.out.println("latch decremented in T1");
		});
		Thread t2 = new Thread(() -> {
			System.out.println("T2");
			latch.countDown();
			System.out.println("latch decremented in T2");
		});
		Thread t3 = new Thread(() -> {
			System.out.println("T3");
			latch.countDown();
			System.out.println("latch decremented in T3");
		});
		Thread t4 = new Thread(() -> {
			System.out.println("T4");
			latch.countDown();
			System.out.println("latch decremented in T4");
		});
		Thread t5 = new Thread(() -> {
			System.out.println("T5");
			try {
				latch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Now latch is open");
		});
		t5.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
