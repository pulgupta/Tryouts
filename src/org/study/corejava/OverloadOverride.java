package org.study.corejava;

/**
 * Useful things to remember :
 * 1. Method return type is not part of the signature and thus cannot be the
 * only change for overloading the methods
 * 2. Order of parameters can be the only change for overloading the methods
 * @author pulgupta
 *
 */
public class OverloadOverride {

	int x =10;
	public Number overrideThis(int a) {
		System.out.println("In parent");
		return null;
	}
	
	public Number overloadThis(int a, String b) {
		System.out.println("INT IS FIRST");
		return null;
	}
	public String overloadThis(String b, int a) {
		System.out.println("STRING IS FIRST");
		return null;
	}
	
}

/**
 * Important points to learn : 
 * You cannot make the access modifier restrictive than that of the parent class
 * in the overriding method.
 * You can change the return type in the overriding method but only to a
 * more restrictive type.
 * @author pulgupta
 *
 */
class testerOO extends OverloadOverride {
	
	int x =20;
	@Override
	public Integer overrideThis(int a) {
		System.out.println("In child");
		return null;
	}
	
	public String overloadThis(String b, int a, Long l) {
		System.out.println("STRING IS FIRST");
		return null;
	}
	
	public static void main(String[] args) {
		OverloadOverride t = new testerOO();
		t.overloadThis(0, "");
		t.overrideThis(0);
		System.out.println(t.x);
	}
}
