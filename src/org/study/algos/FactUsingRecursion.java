package org.study.algos;

public class FactUsingRecursion {

	public int fact(int n) {
		if(n==1)
			return 1;
		else
			return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		FactUsingRecursion fur = new FactUsingRecursion();
		System.out.println(fur.fact(4));
	}
}
