package org.study.corejava;

class A {
	static void fun() {
		System.out.println("A.fun()");
	}
	
	static public void newFun() {
		System.out.println("A.newFun()");
	}
}

class B extends A {
	static void fun() {
		System.out.println("B.fun()");
	}
}

/**
 * Point to learn here is that in case of static methods we 
 * will not have dynamic polymorphism.
 * The method which will be called will be decided based on the reference
 * and not based on the object.
 * ALSO REMEMBER THAT WE CAN CALL STATIC METHODS USING OBJECTS
 * @author pulgupta
 *
 */
public class StaticShadow {
	@SuppressWarnings("static-access") //This warning is coming because we are
	//accessing static variable using an abject which is not required.
	public static void main(String args[]) {
		A a = new B();
		a.fun(); // prints A.fun()
		a.newFun();
	}
}