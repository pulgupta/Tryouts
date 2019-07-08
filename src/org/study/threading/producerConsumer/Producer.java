package org.study.threading.producerConsumer;

import java.util.Queue;

public class Producer implements Runnable {

	private final Queue<Integer> queue;
	private final int MAX_CAPACITY = 10;
	private static int message = 0;

	public Producer(Queue<Integer> queue) {
		this.queue = queue;
	}

	private void produce() {
		synchronized (queue) {
			while (queue.size() > MAX_CAPACITY) {
				try {
					System.out.println("Locking queue");
					queue.wait(); // This will release the lock so that the consumer can acquire the lock
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			
			int newMessage = message++;
			queue.add(newMessage);
			System.out.println("Added a new message " + newMessage);
			queue.notify();
		}
	}

	public void run() {
		while (true) {
			produce();
		}	
	}

}
