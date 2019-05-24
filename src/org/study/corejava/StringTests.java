package org.study.corejava;

import java.util.Arrays;

public class StringTests {
	public static void main(String[] args) throws InterruptedException {
		String name = "pulkit,gargi";
		String[] names= name.split(",");
		Arrays.stream(names).forEach(System.out::println);
		
		String email = "@.@.";
		String email1= email.substring(email.lastIndexOf("@")+1);
		System.out.println(email1);
		System.out.println(email1.substring(0, email1.lastIndexOf(".")));
		
//		for(int i=0;i<1_000_000_000;i++) {
//			String a = "Hello " + i; 
//		}
//		System.out.println("String allocated");
//		Thread.sleep(10000000);
	}
}
