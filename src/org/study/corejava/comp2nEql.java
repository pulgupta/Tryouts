package org.study.corejava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * This will show the relations between compare and equals*/
public class comp2nEql implements Comparable<comp2nEql> {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public comp2nEql(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(comp2nEql o) {
		//NOTE : In case we have primitive numerical values then in place if 
		//comparing the values we can even do the substraction of the two 
		//attributes under comparision and thus just can return that as according to the 
		//contract what matters is just the sign of the return values and not the 
		//values itself
		// Only age will decide the comparability
		if(o == null)
			throw new NullPointerException();
		System.out.println("Using comparator to compare with " + ((comp2nEql)o).name);
		comp2nEql c = (comp2nEql)o;
		if(c.age == this.age)
			return 0;
		else if(this.age < c.age)
			//This means if this is small then we will have to return -1
			//in case this is bigger we will return 1
			return -1;
		else if(this.age > c.age )
			return 1;
		return 0;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("using equals to compare with "+ ((comp2nEql)o).name);
		if(!(o instanceof comp2nEql))
			return false;
		comp2nEql c = (comp2nEql)o;
		//Both name and age will decide the equality
		if(c.age == this.age && c.name.equals(this.name))
			return true;
		
		return false;
	}
	
}

class tester4 {
	public static void main(String args[]) {
		Set<comp2nEql> hs = new HashSet<>();
		Set<comp2nEql> ts = new TreeSet<>();
		
		System.out.println("adding sanket");
		hs.add(new comp2nEql("sanket", 27));
		System.out.println("adding pulkit");
		hs.add(new comp2nEql("pulkit", 27));
		

		ts.add(new comp2nEql("sanket", 24));
		ts.add(new comp2nEql("pulkit", 27));
		ts.add(new comp2nEql("gargi", 25));
		
		System.out.println("HASHSET");
		for (comp2nEql hso : hs) {
			System.out.println(hso.age + " " + hso.name);
		}
		
		System.out.println("TREESET");
		for (comp2nEql tso : ts) {
			System.out.println(tso.age + " " + tso.name);
		}
	}
}
