package org.java8.general.concepts;

import java.util.function.BiConsumer;

/**
 * A  way to wrap a lambda into another lambda of same type with proper try catch.
 * We can then use the smaller lambda but by wrapping in into the more versatile lambda
 * @author pulgupta
 *
 */
public class LambdasExceptionHandingDemo {
	public static void main(String[] args) {
		int arr[] = {10,5,8,4};
		int key =0;
		//This can throw a Arithmetic exception and hence we need some exception handing
		System.out.println("In Main");
		callLambda(arr, key, wrapperLambda((a,b) -> System.out.println(a/b)));
	}
	
	/**
	 * This is the actual client code which is actually using the lambda.
	 * We will not be putting any exception handling here as then in this case the client 
	 * should be aware of the possible errors a lambda can throw.
	 * @param arr
	 * @param key
	 * @param consumer
	 */
	public static void callLambda(int[] arr, int key, BiConsumer<Integer, Integer> consumer){
		System.out.println("In call lambda");
		for (int i : arr) {
			//This is now receiving the complete method with try catch embedded.
			//Thus here we do not have to put any try catch
			consumer.accept(i, key);
		}
	}
	
	/**
	 * A wrapper just to implement all error handling. This single method can then be used
	 * with many actual method implementation 
	 * @param consumer
	 * @return 
	 */
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		System.out.println("In wrapper");
		return (a, b) -> {
			try{
				consumer.accept(a, b);
			}
			catch(ArithmeticException e){
				System.out.println("Exception caught here itself");
			}
		};
	}
}
