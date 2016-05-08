package org.java8.general.concepts;


interface A{
	public default void show() {
		System.out.println("In A");
	}
}

interface B{
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
 * @author pulgupta
 * Also remember that in case we have 2 duplicate methods in 2 interface
 * extended in the same class then in that case we will get an error 
 * saying that duplicate method found.
 */
public class NewInheritance extends C implements A, B{
	
	/*
	@Override
	public void show() {
		System.out.println("This is in NewInheritance");
	}*/
	
	public static void main(String[] args) {
		NewInheritance ni = new NewInheritance();
		ni.show();
	}

}
