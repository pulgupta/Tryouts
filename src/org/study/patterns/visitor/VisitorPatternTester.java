package org.study.patterns.visitor;

public class VisitorPatternTester {
	public static void main(String[] args) {
		Elements e1 = new Element1();
		Elements e2 = new Element2();
		Visitor v = new ConcreteVisitor();
		e1.accept(v);
		e2.accept(v);
		
		System.out.println("Lets see if we can extend the functionality");
		System.out.println("If you will see we are just changing the visitor");
		
		Visitor v2 = new ConcreteVisitor2();
		e1.accept(v2);
		e2.accept(v2);
		
		
	}
}
