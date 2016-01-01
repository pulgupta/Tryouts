package org.study.exceptionHandling;

public class MyUncheckedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getInfo() {
		return "This is an unchecked exception";
	}
	
	//This will allow us to chain the exceptions
	public MyUncheckedException(Throwable cause) {
		super(cause);
	}
	
}
