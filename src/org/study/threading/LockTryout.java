package org.study.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTryout {
	Lock lock = new ReentrantLock();
	
	public void justTestLock() {
		lock.lock();
		System.out.println("I am coding real shit here");
		System.out.println("Ohh this is really complex");
		lock.unlock();
	}
	
	public static void main(String args[]) {
		LockTryout lt = new LockTryout();
		lt.justTestLock();
	}
}
