package org.study.corejava;

public class InterfaceTesterClass implements InterfaceTest{

	//will have to use public with overridden method else we will
	//get error that we are reducing the scope.
	public void print(){
		
	}
	public static void main(String args[]) {
		//This a is coming from the interface
		System.out.println(a);
		//This is giving error final field interfaceTest.a cannot be assigned
		//a=10;
		
		QualifierTests qt = new QualifierTests();
		System.out.println(qt.a);
	
	}
}
