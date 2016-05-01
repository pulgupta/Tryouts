package org.study.serialization;

import java.io.Serializable;

import org.junit.runners.model.InitializationError;

public class Student extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private static String city;
	
	public Student() throws InitializationError {
		System.out.println("default constructor called");
		throw new InitializationError(" " );
		
	}
	public Student(String name, int age) {
		super();
		System.out.println("Parameterized constructor called");
		this.name = name;
		this.age = age;
	}

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
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Student.city = city;
	}
		
	
}
