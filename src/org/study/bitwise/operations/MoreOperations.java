package org.study.bitwise.operations;

public class MoreOperations {
	public static void main(String[] args) {
		/**
		 * How to check if a number is odd or even
		 */
		int[] numbers = {1001, 100, 2, 9};
		System.out.println("Even numbers are :"); 
		for (int i : numbers) {
			// Any number & 00000001 => will be non zero if the last bit of the number is non-zero
			if((i & 1) == 0)
				System.out.print(i + " ");
		}
		
		
	}
}
