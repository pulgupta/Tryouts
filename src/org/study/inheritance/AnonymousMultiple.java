package org.study.inheritance;

abstract class Anonymous  extends Anonymous3 implements Anonymous2 {
	
}

interface Anonymous2 {
	
}

class  Anonymous3 {
	
}
public class AnonymousMultiple {
	public static void main(String[] args) {
		Anonymous a = new Anonymous() {
		};
		Anonymous3 b = new Anonymous() {
		};
		Anonymous2 c = new Anonymous() {
		};
	}
}
