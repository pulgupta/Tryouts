package org.study.serialization.advanced;

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
	
	
}
