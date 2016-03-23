package org.study.corejava;

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
