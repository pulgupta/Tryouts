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
		
		
		
	}

}
