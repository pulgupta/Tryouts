package org.study.collections;

/**
 * This class will give us the example implementation of all the 
 * major operations which we need to override.
 * equals
 * hashCode
 * CompareTo
 * toString
 * @author pulgupta
 *
 */
public class Student implements Comparable<Student>{

	int rollNumber;
	String name;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int hashcode = 0;
		hashcode = 53*this.rollNumber;
		hashcode = hashcode + this.name.hashCode();
		return hashcode;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if( ! (obj instanceof Student ))
			return false;
		Student student = (Student)obj;
		return (student.name.equals(this.name) && student.rollNumber == this.rollNumber);
	}
	@Override
	public String toString() {
		String details = "Name : " + this.name + "& roll number : " + this.rollNumber ;
		return details;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.rollNumber == o.rollNumber)
			return 0;
		if(this.rollNumber > o.rollNumber)
			return 1;
		else 
			return -1;
	}
	
}
