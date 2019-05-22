package org.java8.general.concepts;


interface A{
	
	public void absShow();
	
	public default void show() {
		System.out.println("In A");
	}
}

interface B{
	
	public void absShow();
	
	public default void show() {
		System.out.println("In B");
	}
}

class C{
	public void show() {
		System.out.println("In C");
	}
}

/**
 * Remember that extends will be the first keyword before implements
 * Also remember that in case we have 2 duplicate methods in 2 interface
 * extended in the same class, we will only get an error if the compiler is not
 * able to statically determine which method to call.
 * @author pulgupta
 */
public class NewInheritance extends C 
						implements A, B{
	
	@Override
	public void show() {
		System.out.println("This is in NewInheritance");
	}
	
	public static void main(String[] args) {
		NewInheritance ni = new NewInheritance();
		ni.show();
		ni.absShow();
	}

	@Override
	public void absShow() {
		System.out.println("ABS Show");
		
	}

}
