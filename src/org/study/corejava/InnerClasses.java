package org.study.corejava;

public class InnerClasses {

	private int a = 10;
	
	public class NestedInnerClass {
		public void method() {
			System.out.println("Inside nested inner class " + a);
		}
		/**
		 * Point to learn here : Inner classes cannot have static method for themselves.
		 * If we want static methods we will have to define them in the top level
		 */
		//public static void abc() {}
	}
	
}

class InnerTester {
	public static void main(String[] args) {
		InnerClasses.NestedInnerClass inc = new InnerClasses().new NestedInnerClass();
		inc.method();
	}
}
