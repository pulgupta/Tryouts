package org.java8.general.concepts;

@FunctionalInterface
public interface MyFunctioanlInterface {

	void abstractMethod();
	
	// Even though we have specified one more abstract method 
	// but still this interface is a functional interface as 
	// toString is a overridden method from the Object class.
	@Override
	String toString();
	
	default void defaultMethod() {
		System.out.println("This is a default method");
	}
}
