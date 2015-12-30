package org.study.methods;

public class Car {

	public void addCar(int makeYear, String brand, String fuelType, String owner){
		//method called
		System.out.println("Method with");
	}
	/**
	 * 
	 * @param attr : This is a static member class which will hold all the parameters
	 * which we are passing to the methods
	 * This will help us in reducing the number of parameters which we are passing to the methods
	 * @param carId
	 */
	public void updateCar(Attributes attr, int carId){
		//method called
		System.out.println("method with helper class called");
	}
	
	static class Attributes {
		int makeYear; 
		String brand; 
		String fuelType; 
		String owner;

		public Attributes makeYear(int val) {
			makeYear = val;
			return this;
		}
		
		public Attributes brand(String val) {
			brand = val;
			return this;
		}
	}
	
	
}
