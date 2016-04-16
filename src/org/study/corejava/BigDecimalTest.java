package org.study.corejava;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String args[]) {
		
		BigDecimal bd = new BigDecimal("1.50");
		//you will see that this will result in a very large approximate value.
		BigDecimal bd1 = new BigDecimal(.11111111111111);
		System.out.println(bd);
		System.out.println(bd1);
		
	}
}
