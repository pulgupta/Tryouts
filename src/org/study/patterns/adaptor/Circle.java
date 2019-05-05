package org.study.patterns.adaptor;

public class Circle implements Shape {

	int radius;
	String fillColour;
	
	@Override
	public void draw() {
		System.out.println("Draw circle");		
	}

	@Override
	public void move() {
		System.out.println("Move circle");
	}

}
