package org.study.collections;

public class FinalArrays {

	public static void main(String args[]) {
		final int arr[] = new int[5];
		//This is fine as we are just changing the array and not the reference as the 
		//reference is final.
		arr[0] = 10;
		//The below is wrong as we can't change change the reference of arr variable
		//arr = new int[2];
	}
}
