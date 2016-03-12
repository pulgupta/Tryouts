package org.study.patterns.decorator;

/**
 * Decorator class implements the component interface and it has a HAS-A relationship with the component interface.
 * @author pulgupta
 *
 */
public class CarDecorator implements Car {

	/**
	 * The component variable should be accessible to the child decorator class
	 * Hence we are making it protected.
	 */
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}
	
}
