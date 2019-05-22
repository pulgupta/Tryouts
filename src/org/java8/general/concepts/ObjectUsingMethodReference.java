package org.java8.general.concepts;

import java.util.function.Function;
import java.util.function.Supplier;

class AppleTest {

	String type;

	public AppleTest() {
		System.out.println("Default constructor called");
	}

	public AppleTest(String type) {
		super();
		this.type = type;
		System.out.println("Parameter constructor called with " + type);
	}

}

public class ObjectUsingMethodReference {


	public static void main(String[] args) {
		// Lambda for the below code
		// Supplier<Apple> s = () -> new Apple();
		Supplier<AppleTest> s1 = AppleTest::new; // Method reference
		@SuppressWarnings("unused")
		AppleTest obj = s1.get();
		
		//Calling parameterized constructor
		//Lambda Function<String, AppleTest> s = (String str) -> new AppleTest(str);
		Function<String, AppleTest> s2 = AppleTest::new;
		@SuppressWarnings("unused")
		AppleTest obj2 = s2.apply("Orange");
		
	}
}
