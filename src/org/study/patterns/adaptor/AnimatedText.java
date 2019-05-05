package org.study.patterns.adaptor;

public class AnimatedText implements Text {

	String text;
	String[] animations;
	
	@Override
	public void write() {
		System.out.println("Animated text");
	}

}
