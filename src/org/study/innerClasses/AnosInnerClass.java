package org.study.innerClasses;

interface Test {
	public void testIt();
}

/**
 * This class contains various tests for the variable and their
 * access inside an anonymous class
 * Points to remember : 
 * We can access Instance and static variables of the outer class 
 * directly in our anonymous class.
 * However for accessing the local variable of the method they should be either 
 * final or effectively final
 * For more details check the code comments
 * @author pulgupta
 *
 */
public class AnosInnerClass {

	static int c = 20;
	public static void main(String[] args) {
		int  a = 10;
		int z = 20;
		z =30;
		Test test = new Test() {
			
			@Override
			public void testIt() {
				System.out.println(a);
				int b = 11;
				c =30;
				
				//ERROR : As z is assigned twice thus it is neither final
				//nor effectively final 
				//System.out.println(z);
				
				//ERROR : Local variable a defined in an enclosing scope must be final or effectively final
				//a = 12;
			}
		}; 
		test.testIt();
		//Thus if you see we can change the instance and static variables but not local variables
		System.out.println(AnosInnerClass.c);
	}
}
