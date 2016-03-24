package org.study.collections;

import java.util.Comparator;

public class CompareTo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("Comparator called");
		if(o1.rollNumber == o2.rollNumber)
			return 0;
		if(o1.rollNumber > o2.rollNumber)
			return 1;
		else 
			return -1;
	}

}
