package org.study.patterns.decorator.moreTests;

/**
 * Component Implementation
 * The basic implementation of the component interface
 * @author pulgupta
 *
 */
public class BasicCar implements Car {

	int wheelSize;
	int engineCapacity;
	
	@Override
	public void assemble() {
		System.out.println("Basic Car");
		System.out.println("Specs : ");
		System.out.println("Wheel Size : " + this.wheelSize);
		System.out.println("Engine Capacity : " + this.engineCapacity);

	}

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	
	
}
