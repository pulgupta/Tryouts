package org.study.collections.multiThreading;

import java.util.concurrent.ConcurrentHashMap;

public class Student {

	ConcurrentHashMap<String, String> studentnClass;
	
	public Student() {
		studentnClass = new ConcurrentHashMap<>();
	}
}
