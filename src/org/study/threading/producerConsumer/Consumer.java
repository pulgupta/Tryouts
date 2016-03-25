package org.study.threading.producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable {

	private final Queue<Integer> queue;

	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}

	private void consume() {
		synchronized (queue) {

			while (queue.size() == 0) {
				try {
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
