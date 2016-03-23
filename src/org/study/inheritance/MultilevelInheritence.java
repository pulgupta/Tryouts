package org.study.inheritance;

public class MultilevelInheritence {

	public void add() {
		System.out.println("In MultilevelInheritence");
	}
}

class MultilevelInheritenceFirstChild {
	
	public void add() {
		System.out.println("In MultilevelInheritenceFirstChild");
	}
}

class MultilevelInheritenceSecondChild {
	
	public void add() {
		MultilevelInheritence a = new MultilevelInheritence();
		a.add();
		System.out.println("In MultilevelInheritenceSecondChild");
	}
}

class multiLevelTester {
	public static void main(String[] args) {
		MultilevelInheritenceSecondChild c = new MultilevelInheritenceSecondChild();
		c.add();
	}
}