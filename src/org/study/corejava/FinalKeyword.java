package org.study.corejava;

public class FinalKeyword {

	/**
	 * In Java, non-static final variables can be assigned a value either in constructor 
	 * or with the declaration. But, static final variables cannot be assigned value in constructor;
	 * they must be assigned a value with their declaration.
	 */
	public final int a =10;
	public static final int b =20;
	public static int c;
	public int d;
	
	public static int getB() {
		return b;
	}
}

class FinalTester {
	
	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		//Error in this as it cannot be assigned here
		//fk.a =10;
		// b and c being static are not visible to this object.
		fk.d =10;
	}
	
}