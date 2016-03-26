package org.study.threading;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public class GenericTaskClass implements Runnable{

	int id;
	String name;
	ReentrantLock lock;
	
	public GenericTaskClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		//lock.
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		
		if(!Thread.currentThread().isInterrupted()) {
			for(int i=0; i<id;i++){
				System.out.println(name + " " + i);
				try {
					Thread.sleep(10);
					//int a = 10/0;
					Thread.currentThread().interrupt();
					//In the above line if interrupt is set on a thread then it will not
					//go to sleep and rather will throw a InterruptedException
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}


class genericThreadTester {
	public static void main(String[] args) {
		Thread th1 = new Thread(new GenericTaskClass(10, "Pulkit"));
		Thread th2 = new Thread(new GenericTaskClass(10, "Gargi"));
		Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler());
		//th1.setUncaughtExceptionHandler(new ExceptionHandler());
		th1.start();
		th2.start();
		//th1.interrupt();
		try {
			th1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}