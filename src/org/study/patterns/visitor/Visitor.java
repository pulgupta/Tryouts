package org.study.patterns.visitor;

public interface Visitor {
	
	//We have used multiple methods so that we can achive
	//polymorphism
	void visit(Element1 e);
	void visit(Element2 e);
}
