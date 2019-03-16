package org.study.corejava;

public interface InterfaceTest {
	// Error as this is not initialized and 
	// interface can only contain constants
	//int b;
	
	int a =9;
	//static - not allowed below
	void print();
	
	static void printThis() {
		System.out.println("We can have method with bodies in Interfaces");
	}
	
	/**
	 * Its a new feature in Java 8 where we can add methods to interfaces
	 */
	default void oneMore() {
		System.out.println("A new default method");
	}
	
}

class testerInterface implements InterfaceTest{
	
	public static void main(String[] args) {
		testerInterface ti = new testerInterface();
		ti.print();
		ti.oneMore();
		/**
		 * Because this is a static method we were not able to call it using the ti object
		 */
		InterfaceTest.printThis();
		/**
		 * We can however call a class static method using an object.
		 * However it will throw a warning but nothing else
		 */
		ti.printOneMore();
	}

	@Override
	public void print() {
		System.out.println("This is the only method which is overridden");
		
	}
	
	public static void printOneMore() {
		System.out.println("A class static method");
	}
}