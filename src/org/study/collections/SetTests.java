package org.study.collections;

import java.util.HashSet;
import java.util.Set;

import org.study.genericClass.Employee;

/**
 * These comments will come in java docs which we will generate
 * 
 * @author pulgupta
 *
 */
public class SetTests {
	//This class will use the generic employee class
	public static void main(String args[]) {
		//This hashset will contain the ratings of the employee
		Set<Employee> employee = new HashSet<>();
		Employee oo = new Employee("Pulkit" , 27);
		employee.add(oo);
		Employee e = new Employee("Gargi" , 24);
		employee.add(e);
		
		//We will get both the employees
		for (Employee em : employee) {
			System.out.println(em.getName() + " " + em.getAge());
		}
		System.out.println("Changing the object");
		//lets change the second employee to make it equal to the first
		e.setAge(27);
		e.setName("Pulkit");
		
		System.out.println("\nCheck if both the employee are now equal : " + e.equals(oo));
		
		System.out.println("\nPrinting the data after changing the object");
		for (Employee em : employee) {
			System.out.println(em.getName() + " " + em.getAge());
		}
		
		Employee oo1 = new Employee("Pulkit" , 27);
		employee.add(oo1);
		//The above code will not add the data as it is now equal to the already added employee
		
		System.out.println("\nPrinting the data after adding one more object");
		for (Employee em : employee) {
			System.out.println(em.getName() + " " + em.getAge());
		}
	}
}
