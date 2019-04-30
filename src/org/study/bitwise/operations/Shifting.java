package org.study.bitwise.operations;

/**
 * Tips and tricks for right and left shifting
 * @author pulgupta
 *
 */
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
		
		byte e = 4;
		System.out.println(e >>> 1); // 2
		
		byte f = -4;
		// The reason for this is that as soon as we are shifting 
		// it becomes an integer with 1's in all the higher order bits
		// because of 2's complement.
		// Now when we shift the highest bit is set to 0 and what we got is a 
		// fairly huge positive number.
		// This feature of unsigned right shift makes it slightly less useful.
		System.out.println(f >>> 1); // 2147483646
		
	}

}
