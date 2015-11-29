package org.study.corejava;

import org.study.genericClass.Employee;

//This test will prove that primitive types are passed by values 
//and all the objects are passed by reference
//Thus primitive values changed inside a function will not affect the passed variable
//However if we update some values of an object inside the function it will result
//in the mutation of the original object itself.
public class PassvaluenRef {
	
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
		System.out.println(y);
	}

}


//Test class
class tester {
	public static void main(String args[]) {
		int d = 9;
		String e = "String";
		Employee f = new Employee();
		f.setAge(15);
		System.out.println("values are " + d + " " + e + " " + f.getAge());
		PassvaluenRef.update(d, e, f);
		System.out.println("values are update are" + d + " " + e + " " + f.getAge());
		
		PassvaluenRef x1 = new PassvaluenRef();
		PassvaluenRef x2 = new PassvaluenRef();
		PassvaluenRef x3 = new PassvaluenRef();
		x1.a =10;
		x3.a =20;
		x2 = x1;
		x2.a = 30;
		System.out.println(x1.a + " " + x2.a + " " +x3.a);
	}
}
