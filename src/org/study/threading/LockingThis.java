package org.study.threading;

class ParentClass {

	public synchronized void doSomething() {
		System.out.println(this);
	}
	
}

class ChildClass extends ParentClass {
	
	@Override
	public synchronized void doSomething() {
		System.out.println(this);
		super.doSomething();
	}
}

public class LockingThis {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.doSomething();
	}
}


