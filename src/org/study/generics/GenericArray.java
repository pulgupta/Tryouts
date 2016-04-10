package org.study.generics;

/**
 * The point to take from this example is that we cannot create an 
 * array of generic type however we can create an object array and then 
 * we can cast them to a generic array.
 * 
 * @author pulgupta
 * @param <E>
 */
public class GenericArray<E> {
	public static void main(String[] args) {
		int[] ar = new int[10];
		
		Object[] arr = {"Pulkit", 10};
		for (Object object : arr) {
			System.out.println(object);
		}
		
		System.out.println("\nCalling our method");
		GenericArray<String> obj = new GenericArray<>();
		obj.testArray(arr);
		
	}
	
	public void testArray(Object[] obj) {
		//The below statement of creating a generic array is wrong
		//E[] abc = new E[10];
		
		E[] arr = (E[])obj;
		for (E e : arr) {
			System.out.println(e);
		}
	}
}
