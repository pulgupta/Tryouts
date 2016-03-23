package org.study.threading;

import java.util.concurrent.TimeUnit;

public class DeadLockOld {
	static class Resource extends Thread{
		final String name;
		public Resource another;
		
		public Resource(String name) {
			this.name = name;
		}
		
		synchronized void print1() {
			System.out.println("this is resouce " + name);
		}
		
		synchronized void print() {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("error");
			}
			System.out.println("Thread " + Thread.currentThread().getName() + " acquired resource "+ name);
			another.print1();
		}
		public void run(){
			this.print();
		}
	}
	
	public static void main(String[] args) {
		Resource t1 = new Resource("r1");
		Resource t2 = new Resource("r2");
		t1.another = t2;
		t2.another = t1;
		t1.start();
		t2.start();
		
	}
}
