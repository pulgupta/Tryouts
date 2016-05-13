package org.java8.methodReference;

import java.util.ArrayList;
import java.util.List;

class Apple{

	int weight;
	String type;
	
	public Apple(int weight, String type) {
		super();
		this.weight = weight;
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

public class SortApples {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple(10, "Indian"));
		apples.add(new Apple(12, "Imported"));
		apples.add(new Apple(9, "Imported"));
		apples.add(new Apple(3, "Indian"));
	}
}