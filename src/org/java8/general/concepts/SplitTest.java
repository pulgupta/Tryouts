package org.java8.general.concepts;

public class SplitTest {
	public static void main(String[] args) {	
		String[] data = "google".split(",");
		System.out.println(data.length);
		for(String string: data)
			System.out.println(string);
		
		String test = "asdasdasdasdasda";
		System.out.println(test.substring(test.lastIndexOf("@")+1));
		
		String test1 = "asdasdasdasdasda@gmail.com";
		System.out.println(test1.substring(test1.lastIndexOf("@")));
		
	}
}
