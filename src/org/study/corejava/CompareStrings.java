package org.study.corejava;

public class CompareStrings {

	public static void main(String[] args) {
		String firstName = "Tom";
		String secondName = "Jack";
		Integer a =10;
		Integer b =20;
		System.out.println(a.compareTo(b));
		if(firstName.compareTo(secondName) < 0)
			System.out.println(firstName);
		else
			System.out.println(secondName);
	}
}
