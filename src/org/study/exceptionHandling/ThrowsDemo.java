package org.study.exceptionHandling;

public class ThrowsDemo {
	/**
	 * Without the below throws the code will not compile as we are 
	 * doing a throw but missing the throws
	 * @throws ArthimeticException
	 * 
	 */
	public static void throwMethod() throws IllegalAccessException {
		System.out.println("Inside throwMethod.");
		throw new IllegalAccessException("demo");
	}
	
	public String getData() throws MyUncheckedException, IllegalAccessException{
		return "called method";
		
	}
	
	public String getData2() throws MyCheckedException{
		throw new MyCheckedException();
		//return "called method 2";
		
	}

	public static void main(String args[]) {
		
		ThrowsDemo td = new ThrowsDemo();
		try {
			td.getData();
		
		}
		//A great new feature of Java multi catch block
		catch (MyUncheckedException | IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		try {
			td.getData2();
		} catch (MyCheckedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getInfo());
		}
		
		int[] arr = new int[1];
		arr[0] =10;
		try {
			System.out.println(arr[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Lower bound is 0");
			System.out.println("Lower bound is 1");
			System.out.println(e.getClass());
			System.out.println("Index that caused the exception is " + e.getMessage());
		}
		try {
			throwMethod();
		} catch (IllegalAccessException e) {
			System.out.println("Caught before new exception " + e);
			//an example of exception chaining
			//This will result in the caused by output of the exception
			throw new MyUncheckedException(e);
		}
	}

}
