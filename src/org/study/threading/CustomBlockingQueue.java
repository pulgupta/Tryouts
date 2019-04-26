package org.study.threading;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBlockingQueue<T> {
	
	private Object mutex;
	Queue<T> queue;
	
	public CustomBlockingQueue() {
		mutex = new Object();
		queue = new LinkedList<>();
	}
	
	public T poll() {
		synchronized (mutex) {
			while(queue.isEmpty()) {
				try {
					System.out.println(Thread.currentThread().getName() + " is waiting");
					mutex.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			return queue.poll();
		}
	}
	
	public void add(T data) {
		synchronized (mutex) {
			queue.add(data);
			mutex.notify();
		}
	}

	public static void main(String[] args) {
		CustomBlockingQueue<Integer> queue = new CustomBlockingQueue<>();
		Thread t1 = new Thread(() -> System.out.println(queue.poll()), "T1");
		Thread t2 = new Thread(() -> queue.add(1), "T2");
		t1.start();
		t2.start();
	}
}


