package org.study.threading;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBlockingQueue<T> {
	
	private Object mutex;
	Queue<T> queue;
	int size;
	
	public CustomBlockingQueue(int size) {
		mutex = new Object();
		queue = new LinkedList<>();
		this.size = size;
	}
	
	public T poll() {
		synchronized (mutex) {
			while(queue.isEmpty()) {
				try {
					System.out.println(Thread.currentThread().getName() + " is waiting to poll");
					mutex.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			T data = queue.poll();
			mutex.notify();
			return data;
			
		}
	}
	
	public void add(T data) {
		synchronized (mutex) {
			while(queue.size() >= size) {
				try {
					System.out.println(Thread.currentThread().getName() + " is waiting to add");
					mutex.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			queue.add(data);
			mutex.notify();
		}
	}

	public static void main(String[] args) {
		CustomBlockingQueue<Integer> queue = new CustomBlockingQueue<>(1);
		Thread t1 = new Thread(() -> System.out.println(queue.poll()), "T1");
		Thread t2 = new Thread(() -> queue.add(1), "T2");
		Thread t3 = new Thread(() -> queue.add(2), "T3");
		Thread t4 = new Thread(() -> queue.add(3), "T4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		CustomBlockingQueue<Integer> queue1 = new CustomBlockingQueue<>(2);
		queue1.add(10);
		queue1.add(20);
		System.out.println(queue1.poll());
		queue1.add(40);
		System.out.println(queue1.poll());
		
	}
}


