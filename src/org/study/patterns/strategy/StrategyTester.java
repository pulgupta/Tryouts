package org.study.patterns.strategy;

public class StrategyTester {
	public static void main(String[] args) {
		Apple apple =  new Apple();
		apple.setSize("Big");
		apple.setWeight(10);
		
		//Using strategy pattern to pick up a implementation algo at runtime
		
		apple.printApple(new PrintSize());     // We can also use anonymous class here
		apple.printApple(new PrintWeight());
		
		//Doing the same thing using a anonymous class
		apple.printApple(new PrettyPrintApple() {
			
			@Override
			public void prettyPrintApple(Apple apple) {
				System.out.println("Haha this is inside a anonymous class");
				
			}
		});
		
	}
}
