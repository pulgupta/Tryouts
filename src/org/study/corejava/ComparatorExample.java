package org.study.corejava;

import java.util.Comparator;

import org.study.genericClass.Employee;

public class ComparatorExample implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.equals(o2))
			return 0;
		else if (o1.getAge() < o2.getAge()) 
			return -1;
		else
			return 1;
	}
}

class tester6 {
	public static void main(String args []) {
		Employee o1 = new Employee("Pulkit", 27);
		Employee o2 = new Employee("Gargi", 25);
		System.out.println(new ComparatorExample().compare(o1, o2));
	}
}
