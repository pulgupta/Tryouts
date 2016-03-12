package org.study.patterns.decorator;

/**
 * Component Implementation
 * The basic implementation of the component interface
 * @author pulgupta
 *
 */
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.println("Basic Car");

	}
}
