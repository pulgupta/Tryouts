package org.study.bitwise.operations;

public class Shifting {
	
	public static void main(String[] args) {
		// Left shifting 
		// Move the bits to the left. In case if we are shifting well 
		// beyond the capacity then the left bits will be lost and right 
		// side will be added with zeros
		int a = 4;
		a = a << 2; // 100 will become 10000
		System.out.println(a);
		byte b = 4; // 00000100
		int c = (b << 5);  // 10000000 which is nothing but 128
		System.out.println(c);
		b = (byte) (b << 5); // by default it will be an int. which when 
		// converted into byte results in a signed number
		System.out.println(b);
		
		int d = -4; //11111100 (invert all bits in 4 and add 1)
		d = d >> 1; // 11111110 -> 00000001 -> 1 -> 1 + 1 = 2(negative)
		System.out.println(d);
		
	}

}
