package org.study.threading;

class ExceptionGenerator implements Runnable{
	
	/**
	 * Thus from this example we can see that there is now way of getting 
	 * a checked exception from the run method.
	 */
	
	private int divide() {
		int result = 10/0;
		return result;
	}
	
	@Override
	public void run () {
		System.out.println("This is inside run");
		this.divide();
		//throw new InitializationError("Ohh this is an error");
	}
	
}

public class ThreadnException {
	
	public static void main(String[] args) {
		
		Thread th = new Thread(new ExceptionGenerator());
		th.start();
		
	}

}
