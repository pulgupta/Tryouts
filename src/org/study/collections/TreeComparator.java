package org.study.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeComparator {
	public static void main(String[] args) {
		Map<Student, Integer> map= new TreeMap<>();
		Student st1 = new Student();
		st1.rollNumber = 1;
		st1.name = "Akash";
		
		Student st2 = new Student();
		st2.rollNumber = 2;
		st2.name = "Arun";
		
		map.put(st2, 98);
		map.put(st1, 99);
		
		for (Entry<Student, Integer> studentEntry : map.entrySet()) {
			System.out.println(studentEntry.getKey());
			System.out.println(studentEntry.getValue());
		}
		
	}
}
