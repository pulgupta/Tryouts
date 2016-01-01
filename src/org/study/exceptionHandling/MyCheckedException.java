package org.study.exceptionHandling;

public class MyCheckedException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Whenever you are creating your exception class then in that case always
	//create these kind of methods which will help the API user to extract the cause of the issue.
	
	public String getInfo() {
		return "This is a checked exception";
	}

}
