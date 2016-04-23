package org.study.serialization.advanced;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{


	private static final long serialVersionUID = 1L;
	private String name;
	private int salary;
	private Employee sectary;
	
	public Employee(String name, int salary, Employee sectary) {
		super();
		this.name = name;
		this.salary = salary;
		this.sectary = sectary;
	}

	public Employee getSectary() {
		return sectary;
	}

	public void setSectary(Employee sectary) {
		this.sectary = sectary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Here we have created this object which will be called whenever we are doing 
	 * serialization. This is similar to Externalization approach. However in externalization
	 * we deal with objects and thus it hides the nitty gritty of dealing with
	 * chars and int and other primitive types.
	 * Hence even though we have this facility of creating write object etc. it is not
	 * advisable to directly deal with it. If you need something like this we can always
	 * switch to externalization.
	 */
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeChars(name);
		out.writeInt(salary);
		out.writeObject(sectary);
	}
}
