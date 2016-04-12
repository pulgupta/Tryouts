package org.study.collections.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestConcurrentHashMap {
	public static void main(String[] args) {
		Student s = new Student();
		StudentConcHashMap sc = new StudentConcHashMap(s);
		sc.addStudent("Pulkit", "first");
		sc.addStudent("Pulkit1", "first1");
		sc.addStudent("Pulkit2", "first2");
		sc.addStudent("Pulkit3", "first3");
		sc.addStudent("Pulkit4", "first4");
		//We are using the same student object to crreate two callable threads.
		StudentConcHashMap sc1 = new StudentConcHashMap(s);
		ExecutorService ec = Executors.newFixedThreadPool(4);
		ec.submit(sc);
		ec.submit(sc1);
	}
}
