package org.study.inheritance;

class SuperTest {
	public static final int a;
	static {
		a =10;
	}
	public SuperTest() {
		System.out.println("This is in the parent class");
	}
	public SuperTest(String a){
		System.out.println("!!HAHA!! " + a);
	}
	public void someDummyMethod(){
		System.out.println("Some dummy method");
	}
}
public class Super extends SuperTest{
	public Super() {
		super("Jhon");
		System.out.println("This is in the sub class");
		//super(); - This is an error as we cannot call super as
		//it should be the first statement in the sub class constructor
		super.someDummyMethod();
	}
	
	
	public void someDummyMethod(String overloaded){
		System.out.println("Some dummy method");
	}
	public void someDummyMethod(String overloaded, int again){
		System.out.println("Some dummy method");
	}
	
	public  void someDummySecondMethod() {
		super.someDummyMethod();
	}
	
	public static void main(String[] args) {
		Super s = new Super();
	}
}
