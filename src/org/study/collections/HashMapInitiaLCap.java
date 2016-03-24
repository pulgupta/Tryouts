package org.study.collections;

public class HashMapInitiaLCap {

	static int indexFor(int h, int length) {
	    return h & (length-1);
	}
	
	public static void main(String[] args) {
		int a = 19;
		int b = 18;
		System.out.println(indexFor(a, b));
	}
}
