package org.study.corejava;

public class equalsTest {
	String name;
	int age;
	
	@Override
	public boolean equals(Object e) {
		
		if(e == null)
			return false;
		
		if(!(e instanceof equalsTest)) 
			return false;
		
		equalsTest temp = (equalsTest)e;
		
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

class tester2 {
	public static void main(String args[]) {
		 equalsTest et = new subClass();
		 et.name = "hello";
		 System.out.println(et.equals(et));
	}
}