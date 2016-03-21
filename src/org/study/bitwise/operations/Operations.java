package org.study.bitwise.operations;

public class Operations {
	public static void main(String args[]) {
		//this means 2*( 4 times 2) 
		System.out.println(2 << 2);
		System.out.println(-5 << 2);
		
		System.out.println(8>>2);
		System.out.println(8 >>> 2);
		
		System.out.println("More bit operators");
		int n = 8;
		int binary = 0b0101;
		int fourthBit = (n & 0b1000) / 0b1000;
		System.out.println(fourthBit);
		System.out.println(binary);
		
		int a = 0;
		
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
