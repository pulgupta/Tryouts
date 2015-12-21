package org.study.exceptionHandling;

public class ThrowsDemo {
	/**
	 * Without the below throws the code will not compile as we are 
	 * doing a throw but missing the throws
	 * @throws IllegalAccessException
	 */
	static void throwMethod() throws IllegalAccessException {
		System.out.println("Inside throwMethod.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwMethod();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
	}

}
