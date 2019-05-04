package org.study.patterns.decorator.better.example;

public class LuxuryCar extends CarDecorator {

	String leatherMake;
	
	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("adding the features of luxury car");
		System.out.println("Specs : ");
		System.out.println("Leather Make : " + this.leatherMake);
	}

	public String getLeatherMake() {
		return leatherMake;
	}

	public void setLeatherMake(String leatherMake) {
		this.leatherMake = leatherMake;
	}
	
	
}
