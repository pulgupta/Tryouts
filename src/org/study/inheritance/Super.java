package org.study.inheritance;

class SuperTest {
	public SuperTest() {
		System.out.println("This is in the parent class");
	}
	
	public void someDummyMethod(){
		System.out.println("Some dummy method");
	}
}
public class Super extends SuperTest{
	public Super() {
		System.out.println("This is in the sub class");
		//super(); - This is an error as we cannot call super as
		//it should be the first statement in the sub class constructor
		super.someDummyMethod();
	}
	
	public  void someDummySecondMethod() {
		super.someDummyMethod();
	}
	
	public static void main(String[] args) {
		Super s = new Super();
	}
}
