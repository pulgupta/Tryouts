package org.study.corejava;

import org.study.genericClass.Employee;

//This test will prove that primitive types are passed by values 
//and all the objects are passed by value of their reference(This is still pass by Value only)
//Thus primitive values changed inside a function will not affect the passed variable
//However if we update some values of an object inside the function it will result
//in the mutation of the original object itself.
public class PassvaluenRef {
	public static void main(String args[]) {
		int d = 9;
		String e = "String";
		Employee f = new Employee();
		f.setAge(15);
		System.out.println("values are " + d + " " + e + " " + f.getAge());
		TesterRef.update(d, e, f);
		System.out.println("values after update are " + d + " " + e + " " + f.getAge());
		
		TesterRef x1 = new TesterRef();
		TesterRef x2 = new TesterRef();
		TesterRef x3 = new TesterRef();
		x1.a =10;
		x3.a =20;
		x2 = x1;
		x2.a = 30;
		System.out.println(x1.a + " " + x2.a + " " +x3.a);
	}

}


//Test class
class TesterRef {
	static volatile Integer y = 0;
	public int a;
	public static void update(int a, String b, Employee c) {
		a = 10;
		b = "updatedString";
		c.setAge(20);
		try {
			y = new Integer(10);
		}
		finally {
			y = new Integer(20);
		}
		System.out.println("update has completed execution");
	}
}
