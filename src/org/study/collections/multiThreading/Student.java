package org.study.collections.multiThreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Student {

	ConcurrentHashMap<String, String> studentnClass;
	Lock lock;
	public Student() {
		studentnClass = new ConcurrentHashMap<>();
		lock = new ReentrantLock();
	}
}
