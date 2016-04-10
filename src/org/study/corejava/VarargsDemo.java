package org.study.corejava;

public class VarargsDemo {

	public void testVarargs(int ...a) {
		System.out.println("In Varargs Method");
		for (int i : a) {
			System.out.println(i);
		}
	}
	public void testVarargs(int a, int b) {
		System.out.println("int overloaded testVarargs " + a + " " + b);
	}
	
	public void noVarargs(int a) {
		System.out.println("in noVarargs " + a);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Lets do some testing");
		VarargsDemo vd = new VarargsDemo();
		vd.testVarargs(10);
		vd.testVarargs(10,20);
		vd.testVarargs(10,20,30);
		vd.testVarargs(10,20,30,40);
		vd.noVarargs(10);
	}
}
