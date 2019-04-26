package org.java8.general.concepts;

import java.util.function.Supplier;

public class UsingStaticVariables {

	static int staticTest = 5;
	int var = 10;
	
	public void testInstanceVar()
	{
		var = 10;
		// We can use any instance variable or static variable in the lambdas
		// However we can't use a local variable if it is not marked as 
		// Final or if it is not effectively final
		int data = 10;
		data++;
		Supplier<Integer> supplier = () -> {return staticTest + var; };
		System.out.println(supplier.get());
	}
	
	public static void main(String args[]) {
		UsingStaticVariables obj = new UsingStaticVariables();
		obj.testInstanceVar();
		
		staticTest++;
		System.out.println("Static test first value is " + staticTest);
		Supplier<Integer> supplier = () -> {return ++staticTest; };
		staticTest++;
		System.out.println("Static test second value is " + staticTest);
		System.out.println("Static Test lambda output is " + supplier.get());
	
	}
}
