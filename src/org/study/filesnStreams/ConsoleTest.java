package org.study.filesnStreams;

import java.io.*;

/**
 * Another way of reading data from the console
 * @author pulgupta
 * 12-05-2016
 */
class ConsoleTest {
	public static void main(String args[]) {
		Console c = System.console();
		if(c==null) {
			System.out.println("Great this is now null");
			System.out.println("Solve this!!");
			System.exit(-1);
		}
		System.out.println("Enter your name: ");
		String n = c.readLine();
		System.out.println("Welcome " + n);
	}
}