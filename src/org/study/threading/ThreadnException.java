package org.study.threading;

import java.io.IOException;

class ExceptionGenerator implements Runnable{
	
	
	/**
	 * This method will throw runtime exception 
	 * When we will call this method 
	 * @return
	 */
	private int divide() {
		int result = 0;
		//result = 10/0;
		return result;
	}
	/**
	 * Thus from this example we can see that there is now way of getting 
	 * a checked exception from the run method.
	 */
	@Override
	public void run () {
		System.out.println("This is inside run");
		this.divide();
		System.out.println("This is after divide");    //This will not be printed
		//throw new IOException("Ohh this is an error");
		throw new RuntimeException();
	}
	
}

public class ThreadnException {
	
	public static void main(String[] args) {
		
		Thread th = new Thread(new ExceptionGenerator());
		th.start();
		
	}

}
