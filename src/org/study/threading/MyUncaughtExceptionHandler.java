package org.study.threading;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		//I am doing some clean up here
		System.out.println("Name of the failed thread is " + t.getName());
		System.out.println("Exception is " + e.getMessage());
		System.out.println("Done with the huge task of this cleanup");
	}

}
