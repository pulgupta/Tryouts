package org.study.corejava;

class A {
	static void fun() {
		System.out.println("A.fun()");
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
	public static void main(String args[]) {
		A a = new B();
		a.fun(); // prints A.fun()
	}
}