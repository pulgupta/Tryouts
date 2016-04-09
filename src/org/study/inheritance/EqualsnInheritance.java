package org.study.inheritance;

public class EqualsnInheritance {

	int a;
	
}

class Subclass extends EqualsnInheritance {
	
	int b;
	
}

/**
 * In case of inheritance the instanceof check breaks the equals reflective property
 * thus many people advocate that we should use the getClass check.
 * This is because what ever may be the case we will always get the correct 
 * concrete class name back.
 * example if(this.getClass() != otherObject.getClass()) return false;
 * 
 * @author pulgupta
 *
 */
class TesterInstance {
	public static void main(String[] args) {
		EqualsnInheritance instance1 = new EqualsnInheritance();
		Subclass instance2 = new Subclass();
		System.out.println(instance1 instanceof Subclass);
		System.out.println(instance1 instanceof EqualsnInheritance);
		System.out.println(instance2 instanceof Subclass);
		System.out.println(instance2 instanceof EqualsnInheritance);
		
		System.out.println(instance1.getClass());
		System.out.println(instance2.getClass());
	}
}