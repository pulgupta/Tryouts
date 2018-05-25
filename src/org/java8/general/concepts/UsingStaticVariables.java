package org.java8.general.concepts;

import java.util.function.Supplier;

public class UsingStaticVariables {

	static int staticTest = 10;
	
	public static void main(String args[]) {
		
		staticTest++;
		System.out.println("Static test first value is " + staticTest);
		Supplier<Integer> supplier = () -> {return staticTest++; };
		staticTest++;
		System.out.println("Static test second value is " + staticTest);
		System.out.println("Static Test lambda output is " + supplier.get());
	
	}
}
