package org.study.patterns.adaptor;

public class Square implements Shape {

	int length;
	String fillColour;
	
	@Override
	public void draw() {
		System.out.println("Draw square");
	}

	@Override
	public void move() {
		System.out.println("Moving square");
	}

}
