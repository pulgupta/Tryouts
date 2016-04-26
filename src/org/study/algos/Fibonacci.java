package org.study.algos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		if(n >= 1)
			System.out.print(a + " ");
		int b = 1;
		if(n >= 2)
			System.out.print(b + " ");		
		
		for(int i=2;i<n;i=i+2) {
			a = a + b;
			b = b + a; 
			if(n-i==1){ 
				System.out.print(a);
				break;
			}
			else {
				System.out.print(a + " " + b + " ");
			}
		}
	}
}