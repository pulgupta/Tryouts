package org.study.collections.multiThreading;

import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StudentConcHashMap implements Callable<String>{

	Student s;
	Lock lock;
	public StudentConcHashMap(Student s) {
		this.s = s;
		lock = new ReentrantLock();
	}
	
	public void addStudent(String name, String division) {
		s.studentnClass.put(name, division);
	}
	
	public String getDivision(String name) {
		return s.studentnClass.get(name);
	}

	public String call1() throws Exception {
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
	
	/**
	 * lock.tryLock will not work as here we are not actually locking S.
	 * We are locking the this instance. Hence even though this instance is locked and
	 * as we have the same reference of student passed to other callable 
	 * it will continue to modify s.
	 * @return
	 * @throws Exception
	 */
	public String call() throws Exception {
		/**
		 * Thus to resolve the issue I have put a lock on the object which I want to 
		 * protect. In this case it is the  student. Thus if someone has shared the same 
		 * object to multiple callables then also this code will not break.
		 * We just have to provide it enough time so that it can wait for
		 * the other threads to release the lock.
		 */
		try{
			if(s.lock.tryLock(100, TimeUnit.SECONDS)) {
				for (Entry<String, String> e : s.studentnClass.entrySet()) {
					e.setValue(e.getValue() + " verified ");
					System.out.println(e.getValue());
				}
			}
		}
		catch(Exception e) {
			System.out.println("**ERROR**");
		}
		finally {
			s.lock.unlock();
		}
		return "Done";
	}
	
}
