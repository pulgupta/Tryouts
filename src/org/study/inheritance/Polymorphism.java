package org.study.inheritance;

class Base {

	int a;
	
	public Base() {
		a = 10;
	}
	
	public String method() {
		return "base";
	}
	
}

class Derived extends Base {

	int a;
	
	public Derived() {
		a = 20;
	}
	 
	public String method() {
		return "derived";
	}
	
}
public class Polymorphism {

	public static void main(String args[]) {
		Base b = new Derived();
		//Thus by the below output we can see that the base reference will
		//refer to the case instance variables and the methods will depend on the 
		//actual object and not the reference.
		System.out.println("Instance Variable " + b.a + "\nInstance Method " + b.method());
	}
	
}
