package org.study.corejava;

public class CompareStrings {

	public static void main(String[] args) {
		String firstName = "Tom";
		String secondName = "Jack";
		
		if(firstName.compareTo(secondName) < 0)
			System.out.println(firstName);
		else
			System.out.println(secondName);
	}
}
