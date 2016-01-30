package org.study.corejava;

import java.util.Date;

public class NullTest {
	static Date dt;
	static int x = 10;
	public static void main(String args[]) {
		//println has a special setting for null and will not throw a null pointer exception
		System.out.println(dt);
		String st = "Hello";
		int x = 20;
		System.out.println(x);
		if(st instanceof Object)
			System.out.println("String is an instance of Object");
		else
			System.out.println("String is **NOT** an instance of Object");
		
	}
}
