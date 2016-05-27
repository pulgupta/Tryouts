package org.study.corejava;

public class StringTests {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<1_000_000_000;i++) {
			String a = "Hello " + i; 
		}
		System.out.println("String allocated");
		Thread.sleep(10000000);
	}
}
