package org.java8.general.concepts;

import java.util.function.Supplier;

/**
 * Sample class for which we will be creating an object using Lambdas
 * @author pulgupta
 *
 */
class Apple {
	boolean test(){
		return true;
	}
}

/**
 * This class will create objects of the Apple class using the 
 * Lambdas expression
 * @author pulgupta
 *
 */
public class ObjectUsingLambda {

	public static void main(String[] args) {
		// We can store Lambdas in a functional interface
		//This is nothing but the implementation of the only method of the 
		//functional interface to which we are assigning it
		Supplier<Apple> supplier = () -> new Apple();
		
		//Once we have defined the implementation now 
		// we can call that implementation
		Apple apple = supplier.get();
		
		//TEST CASE to check if we have a correct object
		System.out.println(apple.test());
	}
	
}
