package org.study.threading;

import java.lang.Thread.UncaughtExceptionHandler;

public class ExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		
		System.out.println(t.getId() + ": I am so sorry for the error");
		
	}

}
