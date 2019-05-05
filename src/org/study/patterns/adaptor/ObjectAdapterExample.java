package org.study.patterns.adaptor;

public class ObjectAdapterExample implements Shape {

	Text text; // This should be parent interface
	
	public ObjectAdapterExample(Text text) {
		super();
		this.text = text;
	}

	@Override
	public void draw() {
		text.write();
		System.out.println("Drawinig text(any)");
	}

	@Override
	public void move() {
		System.out.println("Moving text(any)");
	} 
}
