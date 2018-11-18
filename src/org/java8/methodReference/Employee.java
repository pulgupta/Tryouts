package org.java8.methodReference;

public class Employee {

	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void printString(String data) {
		System.out.println(data);
	}
		
}
