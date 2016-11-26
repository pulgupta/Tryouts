package org.java8.general.concepts;

import java.util.function.BiConsumer;

public class LambdasExceptionHandingDemo {
	public static void main(String[] args) {
		int arr[] = {10,5,8,4};
		int key =0;
		//This can throw a Arithmetic exception and hence we need some exception handing
		callLambda(arr, key, wrapperLambda((a,b) -> System.out.println(a/b)));
	}
	
	//This is the actual client code which is actually using the lambda.
	//We will not be putting any exception handling here as then in this case the client 
	//should be aware of the possible errors a lambda can throw.
	public static void callLambda(int[] arr, int key, BiConsumer<Integer, Integer> consumer){
		for (int i : arr) {
			//This is now receiving the complete method with try catch embedded.
			//Thus here we do not have to put any thy catch
			consumer.accept(i, key);
		}
	}
	
	public static BiConsumer<Integer, Integer>wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		//this is receiving (a,b) -> System.out.println(a/b) as the accept method body
		return (a, b) -> {
			try{
				//Assume this is coming here System.out.println(a/b)
				consumer.accept(a, b);
			}
			catch(ArithmeticException e){
				System.out.println("Exception caught here itself");
			}
		};
	}
}
