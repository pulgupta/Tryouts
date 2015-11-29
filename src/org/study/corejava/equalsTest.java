package org.study.corejava;

public class equalsTest {
	String name;
	int age;
	
	@Override
	public boolean equals(Object e) {
		/*
		 * We do not need a separate null check as instanceOf will return false in case
		 * the first parameter is a null regardless of what type appears in the second operand*/
		if(e == null)
			return false;
		
		if(!(e instanceof equalsTest)) 
			return false;
		
		equalsTest temp = (equalsTest)e;
		/*
		 * This check will help in performance improvement in case the member variable
		 * comparison is expensive*/
		if(temp == this)
			return true;
		
		if(temp.name.equals(this.name) && temp.age == this.age)
			return true;
		
		return false;
	}
	
	public String toString(){
		return "Values " + this.name + " " + this.age;
	}
	
}

class subClass extends equalsTest {
	String address;
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(! (o instanceof subClass)) 
			return false;
		subClass sc = (subClass)o;
		
		if(!sc.name.equals(this.name))
			return false;
		return true;
	}
}

interface test {
	int a =10;
}

class inter implements test {
	
}

class inter1 implements test {
	
}
class tester2 {
	public static void main(String args[]) {
		 equalsTest et = new subClass();
		 et.name = "hello";
		 System.out.println(et.equals(et));
		 System.out.println("**Interface test**");
		 inter a = new inter();
		 inter1 a1 = new inter1();
		 if(a instanceof test) 
			 System.out.println("true");
		 System.out.println();
		 }
}