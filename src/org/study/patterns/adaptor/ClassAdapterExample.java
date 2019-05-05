package org.study.patterns.adaptor;

/**
 * By extending we got all the state of the animated text and the behavior of 
 * Shape
 * @author pulgupta
 *
 */
public class ClassAdapterExample  extends AnimatedText implements Shape{

	@Override
	public void draw() {
		super.write();
		System.out.println("Drawing animated text");		
	}

	@Override
	public void move() {
		System.out.println("Moving animated text");
	}

}
