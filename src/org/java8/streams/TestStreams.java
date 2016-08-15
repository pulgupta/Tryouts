package org.java8.streams;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestStreams {
	public static void main(String[] args) {
		Dish soup = new Dish("Tamato Soup", 90, true, "Appitisers"); 
		Dish paratha = new Dish("Paratha", 400, true, "Breakfast");
		Dish maggie = new Dish("Maggie", 200, true, "Snacks");
		Dish salads = new Dish("Salad", 750, true, "Appitisers");
		Dish chicken = new Dish("Chicken", 500, false, "Dinner");
		Dish burger = new Dish("Cheese Burger", 300, false, "Lunch");
		Dish wrap = new Dish("Chicken wrap", 100, false, "Dinner");
		
		List<Dish> menu = new ArrayList<>();
		menu.add(soup);
		menu.add(paratha);
		menu.add(maggie);
		menu.add(salads);
		menu.add(chicken);
		menu.add(burger);
		menu.add(wrap);
		System.out.println("*******************JAVA 7*********************");
		//Filter based on calories
		List<Dish> lessCal = new ArrayList<>();
		for (Dish dish : menu) {
			if(dish.getCalories()<=400)
				lessCal.add(dish);
		}
		
		//Sort
		Collections.sort(lessCal, new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});
		//Transform
		List<String> lowCalDishNames = new ArrayList<>();
		for (Dish dish : lessCal) {
			lowCalDishNames.add(dish.getName());
		}
		
		for (String string : lowCalDishNames) {
			System.out.println(string);
		}
		
		System.out.println("\n******************JAVA 8*********************");
		//JAVA 8 WAY OF DOING THE SAME THING
		List<String> listLessCalName = menu.stream()
											.filter(d -> d.getCalories() <= 400)
											.sorted(comparing(Dish::getCalories))
											.map(Dish::getName)
											.collect(toList());
		
		for (String string : listLessCalName) {
			System.out.println(string);
		}
	}
}
