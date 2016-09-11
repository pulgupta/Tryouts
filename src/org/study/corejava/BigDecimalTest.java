package org.study.corejava;

import java.math.BigDecimal;

class testerStatic {
	public void test() {
		//BigDecimalTest.counter =10; //ERROR!
		//Just works
		BigDecimalTest.counter1 =10;
	}
}

public class BigDecimalTest {

	private static int counter = 0;
	static int counter1 = 0;
	public void test() {
		counter =10;
	}
	public static void main(String args[]) {
		
		BigDecimal bd = new BigDecimal("1.55");
		//you will see that this will result in a very large approximate value.
		BigDecimal bd1 = new BigDecimal(1.55);
		//For this reason we should always use the string constructor and not the double one
		System.out.println(bd);
		System.out.println(bd1);
		
		//We have a way in which we can restrict the number of trailing 
		//random value which is being generated in case of BigDecimal with double values.
		bd1=bd1.setScale(4, BigDecimal.ROUND_HALF_EVEN);
		System.out.println(bd1.stripTrailingZeros().toPlainString());
		
	}
}
