package org.study.threading;

import java.util.concurrent.TimeUnit;

public class DeadLockLamda {
	static class Resource {
		final String name;
		
		public Resource(String name) {
			this.name = name;
		}
		
		synchronized void print() {
			System.out.println("this is resouce " + name);
		}
		
		synchronized void print(Resource another) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("error");
			}
			System.out.println("Thread " + Thread.currentThread().getName() + " acquired resource "+ name);
			another.print();
		}
	}
	
	public static void main(String[] args) {
		final Resource r1 = new Resource("r1");
		final Resource r2 = new Resource("r2");
		new Thread(() -> r1.print(r2)).start();
		new Thread(() -> r2.print(r1)).start();
	}
}
