package org.study.patterns.strategy;

public class PrintWeight implements PrettyPrintApple{

	@Override
	public void prettyPrintApple(Apple apple) {
		System.out.println(apple.weight);
	}

}
