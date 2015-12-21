package org.study.corejava;

public class FloatNDouble {
	public static void main(String args[]) {
		/**
		 * If we are just passing a fractional value to then that value will be considered
		 * as Double. To explicitly specify that this value is a float we will have to specify a "f"
		 */
		double d = 1.2;
		float f = 1.2f;
		
		System.out.println("Double value is " + d);
		System.out.println("Float value is  " + f);
		
		/**
		 * The concept shown here is the RULE OF PROMOTION: 
		 * In this case as the operands of the ternary operator are int and double
		 * Hence by the rule of promotion which is applied at compile time is double
		 * Hence the output will be 9.0 and not 9
		 */
		int a = 5; 
		System.out.println("Value is - " + ((a < 5) ? 9.9 : 9)); 
		
	}
}
