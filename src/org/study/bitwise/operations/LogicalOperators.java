package org.study.bitwise.operations;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 4; // In binary : 100
		int b = 5; // In binary : 101
		int c = 9;

		System.out.println(a|b); // 101
		System.out.println(a&b); // 100

		/**
		 * 4 = 00000100
		 * ~4 = 11111011
		 * now to convert this into decimal
		 * 00000100 = 4
		 * plus 1 = -5
		 */
		System.out.println(~a);
		/**
		 * 9 = 00001001
		 * ~9 = 11110110
		 * Convert this do decimal
		 * 00001001 = 9
		 * now add one = 00001010 = -10
		 */
		System.out.println(~c);
	}
}
