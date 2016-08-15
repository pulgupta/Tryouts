package org.java8.streams;

public class Dish {
	
	private final String name;
	private final int calories;
	private final boolean vegetarian;
	private final String type;
	
	public Dish(String name, int calories, boolean vegetarian, String type) {
		super();
		this.name = name;
		this.calories = calories;
		this.vegetarian = vegetarian;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public String getType() {
		return type;
	}
}
