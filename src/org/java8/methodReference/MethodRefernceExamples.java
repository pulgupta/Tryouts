package org.java8.methodReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefernceExamples {
	
	
	
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.setName("First Employee");
		e1.setSalary(10000);
		
		//While this is successful but at the same time if we will try to do this using 
		//Employee::getName that will be a type miss match and we will get some static 
		//context error as that is the placeholder for almost all method reference issue
		Supplier<String> supplier = e1::getName;
		System.out.println(supplier.get());
		
		//While this is successful we not are passing the object on which we want to call
		//the functional interface method so basically we do not have a one to one match here
		//between the method reference and the functional interface method
		Function<Employee, String> fn = Employee::getName;
		System.out.println(fn.apply(e1));
		
		
	}

}
