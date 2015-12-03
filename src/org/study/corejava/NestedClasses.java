package org.study.corejava;

public class NestedClasses {

	int a;
	static int b;
	
	public NestedClasses() {
		a=1;
		b=2;
	}
	
	public void outerMethod() {
		System.out.println("Outer class method " + this.a + b);
	}
	
	//Static member class
	static class StaticMember {
		int c;
		
		public StaticMember() {
			c=2;
			b=3;
		}
		
		public void innerMethod() {
			System.out.println("inside static member class");
		}
		
	}
}

class tester5 {
	public static void main(String args[]) {
		NestedClasses nc = new NestedClasses();
		nc.outerMethod();
	}
}