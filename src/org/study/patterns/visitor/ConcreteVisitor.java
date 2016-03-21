package org.study.patterns.visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(Element1 e) {
		System.out.println("This is inside the element 1 method");
	}

	@Override
	public void visit(Element2 e) {
		System.out.println("This is inside the element 2 method");
	}

}
