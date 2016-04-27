package org.java8.methodParameterism;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsePredicate {

	public static boolean isLarge(Predicate<String> t, String string) {
		//boiler
		//Lots of boiler plate
		return t.test(string);
	}
	
	public static void insert(Consumer<String> t, String string) {
		//boiler
		System.out.println("boiler plate code called");
		t.accept(string);
	}
	
	public static void main(String[] args) {
		
		/**
		 * If you see using the same boiler plate code we have devised a way to 
		 * perform different tests. This is the power of lambdas
		 */
		System.out.println(UsePredicate.isLarge((String string) -> string.length() > 10 , "Hello all"));
		System.out.println(UsePredicate.isLarge((String string) -> string.length() > 8 , "Hello all"));
		UsePredicate.insert((String string) -> {} , "Hello all");
	}
}
