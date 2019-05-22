package org.java8.general.concepts;

import java.util.function.Supplier;

/**
 * Sample class for which we will be creating an object using Lambdas
 * @author pulgupta
 *
 */
class Apple {
	boolean test(){
		// To check if we have two different objects
		System.out.println(this);
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
		/* We can store Lambdas in a functional interface
		 * This is nothing but the implementation of the only method of the 
		 * functional interface to which we are assigning it
		*/
		Supplier<Apple> supplier = () -> new Apple();
		
		//Method reference
		Supplier<Apple> supplier1 = Apple::new;
		
		//Once we have defined the implementation now we can call that implementation
		Apple apple = supplier.get();
		Apple apple2 = supplier1.get();
		
		//lets check if we have correct objects
		System.out.println(apple.test());
		System.out.println(apple2.test());
	}
	
}
