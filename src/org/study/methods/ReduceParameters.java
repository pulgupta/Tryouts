package org.study.methods;

import org.study.methods.Car.Attributes;

public class ReduceParameters {

	public static void main(String args[]) {
		Car c = new Car();
		
		//calling normal method
		c.addCar(0, "1", "2", "3");
		
		Attributes att = new Car.Attributes().brand("1").makeYear(10);
		
		//calling a method with reduced parameters
		c.updateCar(att, 2);
	}
}
