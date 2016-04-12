package org.study.collections.multiThreading;

import java.util.Map.Entry;
import java.util.concurrent.Callable;

public class StudentConcHashMap implements Callable<String>{

	Student s;

	public StudentConcHashMap(Student s) {
		this.s = s;
	}
	
	public void addStudent(String name, String division) {
		s.studentnClass.put(name, division);
	}
	
	public String getDivision(String name) {
		return s.studentnClass.get(name);
	}

	@Override
	public String call() throws Exception {
		/**
		 * This synchronized is plying a huge part here.
		 * When I was not using this I was able to produce inconsistency in the Map.
		 * Once put all the data is updating correctly.
		 */
		synchronized (s) {
			for (Entry<String, String> e : s.studentnClass.entrySet()) {
			e.setValue(e.getValue() + " verified ");
			System.out.println(e.getValue());
			}
		}
		return "Done";
	}
	
	
}
