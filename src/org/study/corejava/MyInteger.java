package org.study.corejava;

class TestInteger {

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}

public class MyInteger {
	public static void main(String[] args) {
		Integer a = 10;
		TestInteger b = new TestInteger();
		b.setA(10);
		
		MyInteger.modify(a);
		MyInteger.modify(b);
		
		System.out.println(a);
		System.out.println(b.getA());
	}
	
	/**
	 * Integer being a object but still we are not able to see the modification in the main method
	 * This is because when we modify the Integers(any Wrappers) they being immutables will result in 
	 * creation of new object and thus the old object will remain the same.
	 * @param a
	 */
	public static void modify(Integer a) {
		a++;
	}
	
	public static void modify(TestInteger a) {
		a.setA(a.getA()+1);
	}
}