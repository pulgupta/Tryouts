package org.study.enums;

import org.study.enums.EnumInClass.myenum;

public class EnumInClass {

	public void printEnum(myenum e) {
		System.out.println(e.toString());
	}
	
	public static enum myenum {
		DEMO_PRINT,
		ADVANCED_PRINT;
	}
	
}

/**
 * We just need an import statement and then we can use the enum 
 * inside the class everywhere
 * I have also tried to use it in some other class and not just the below one
 * @author pulgupta
 *
 */

class EnumInClassTester {
	public static void main(String[] args) {
		EnumInClass ec = new EnumInClass();
		ec.printEnum(myenum.DEMO_PRINT);
	}
}
