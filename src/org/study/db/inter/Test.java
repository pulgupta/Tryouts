package org.study.db.inter;

public class Test {
	
	Test t = new Test();
	Test() {
		System.out.println(1);
	}
	
	public static void main(String args[]) {
		System.out.println(2);
		new Test();
		System.out.println(3);
	}
}
