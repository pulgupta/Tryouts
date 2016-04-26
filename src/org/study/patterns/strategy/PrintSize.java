package org.study.patterns.strategy;

public class PrintSize implements PrettyPrintApple {

	@Override
	public void prettyPrintApple(Apple apple) {
		System.out.println(apple.size);
	}

}
