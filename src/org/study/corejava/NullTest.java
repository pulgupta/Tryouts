package org.study.corejava;

import java.util.Date;

public class NullTest {
	static Date dt;
	public static void main(String args[]) {
		//println has a special setting for null and will not throw a null pointer exception
		System.out.println(dt);
	}
}
