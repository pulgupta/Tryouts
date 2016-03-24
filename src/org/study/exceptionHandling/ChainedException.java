package org.study.exceptionHandling;

public class ChainedException {
	public static void main(String[] args) {
		ChainedException ce = new ChainedException();
		try {
			ce.divide();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
		}
		
	}
	
	public void divide() {
		int a =10;
		int b = 0;
		
		try {
			int c = a/b;
		}
		catch(ArithmeticException e) { 
			System.out.println("Arithmetic Exception caught " + e);
			NumberFormatException e1 = new NumberFormatException();
			e1.initCause(e);
			throw e1;
		}
	}
}
