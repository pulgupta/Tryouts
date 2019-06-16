package org.study.bitwise.operations;

public class Operations {
	public static void main(String args[]) {
		//this means 2*4
		// 00000010 -> 00001000 (Shifting 1 by two places towards left)
		System.out.println(2 << 2);
		System.out.println("-5 shifting by two places to left " + (-5 << 2));
		
		System.out.println(8>>2);
		System.out.println(8 >>> 2);
		
		System.out.println("More bit operators");
		int n = 8;
		int binary = 0b0101;
		int fourthBit = (n & 0b1000) / 0b1000;
		System.out.println(fourthBit);
		System.out.println(binary);
		
		int a = 0;
		
		//XOR DEMO
		int x1 = 0b101;
		int x2 = 0b011;
		
		System.out.println("XOR IS " + (x1 ^ x2));
		
		//Why do we do not need unsigned left shift
		System.out.println("No unsigned left shift");
		int lf = 0b11111111;

		//In this case it will move the signed bit
		System.out.println(lf>>2);

		//In this case it will not move the signed bit
		System.out.println(lf>>>2);

		//In this case no need as we are not changing the right bits
		System.out.println(lf<<2);
		
		System.out.println(lf);
		
		//SHORT CIRCUIT DEMO
		
		if(false && (10/a == 1))
			System.out.println("Wow!! no error in if");
		else
			System.out.println("Wow!! no error in else");
		if(false & (10/a == 1))
			System.out.println("What!! still no error in if");
		else
			System.out.println("What!! still no error in else");
	}
}
