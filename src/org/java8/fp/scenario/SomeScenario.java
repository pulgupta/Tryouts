package org.java8.fp.scenario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SomeScenario {
	
	private static class Student {
		
		String name;
		int age;
		int marks;
		
		public Student(String name, int age, int marks) {
			super();
			this.name = name;
			this.age = age;
			this.marks = marks;
		}
	}
	
	/**
	 * Get the names of the students who are older than 20 and has less than 50 marks
	 * @param students
	 * @return Student names
	 */
	private List<String> getStudentNameWithAgeMoreThan20AndMarksLessThan50(List<Student> students) {
		return students.stream()
				.filter(s -> s.age > 20 && s.marks < 50) // Filter based on data
				.map(s -> s.name) // get the student and just return the data you need
				.collect(Collectors.toList()); // Collect it into a List
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<SomeScenario.Student>();
		students.add(new Student("John", 21, 75));
		students.add(new Student("Tom", 22, 05));
		students.add(new Student("Mia", 19, 35));
		students.add(new Student("Stark", 21, 49));
		students.add(new Student("Foo", 15, 56));
		students.add(new Student("Bar", 27, 99));
		students.add(new Student("Richard", 20, 33));
		students.add(new Student("Terry", 2, 44));
		students.add(new Student("Ronaldo", 57, 98));
		students.add(new Student("Bale", 20, 78));
		
		
		SomeScenario scenario = new SomeScenario();
		List<String> result = scenario.getStudentNameWithAgeMoreThan20AndMarksLessThan50(students);
		result.stream().forEach(System.out::println);
		
	}

}
