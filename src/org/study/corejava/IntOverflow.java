package org.study.corejava;

public class IntOverflow {
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		System.out.println(a + " " + b);
		a=a+1;
		b=b-1;
		System.out.println(a + " " + b);
	}
}
