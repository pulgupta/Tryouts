package org.study.bitwise.operations;

public class MoreOperations {
	public static void main(String[] args) {
		/**
		 * How to check if a number is odd or even
		 */
		int[] numbers = {1001, 100, 2, 9};
		System.out.println("Even numbers are :"); 
		for (int i : numbers) {
			if((i & 0b1) == 0)
				System.out.print(i + " ");
		}
		
		
	}
}
