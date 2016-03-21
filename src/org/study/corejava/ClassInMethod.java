package org.study.corejava;

public class ClassInMethod {

	void myMethod() {
		class Student {
			String name;
		}
		
		Student st = new Student();
		st.name = "Hello";
		System.out.println(st.name);
	}
	
	public static void main(String[] args) {
		ClassInMethod cim = new ClassInMethod();
		cim.myMethod();
	}
}
