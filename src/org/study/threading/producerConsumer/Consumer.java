package org.study.threading.producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable {

	private final Queue<Integer> queue;

	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}

	private void consume() {
		synchronized (queue) { // When we are locking queue we can only call wait/notify on this locked object
			while (queue.size() == 0) {
				try {
					// Remember when wait is called it releases the lock which means that queue can be locked by other
					// If this was not true then the producer will never be able to lock queue again while
					// producer is producing.
					queue.wait();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}

			System.out.println("removed the message " + queue.remove());
			queue.notify();
		}
	}

	public void run() {
		while (true) {
			consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
