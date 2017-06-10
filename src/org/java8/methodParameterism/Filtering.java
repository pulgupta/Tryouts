package org.java8.methodParameterism;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filtering {
	
	//This method will just initiate the marks
	public List<Double> initiateMarks() {
		List<Double> marks = new ArrayList<>();
		for(int i=0;i<10;i++) {
			marks.add(Math.random());
		}
		return marks;
	}
	
	//This method will do the filtering
	public List<Double> filteredMarks(List<Double> input, Predicate<Double> filter) {
		List<Double> result = new ArrayList<>();
		for(Double d : input)
			if(filter.test(d))
				result.add(d);
		return result;
	}
	
	public static void main(String args[]) {
		Filtering filterDemo = new Filtering();
		List<Double> input = filterDemo.initiateMarks();
		Predicate<Double> filter1 =  d -> d>.4; 
		Predicate<Double> filter2 = d -> d<.2;
		List<Double> result1 = filterDemo.filteredMarks(input,filter1);
		System.out.println("--------------First Result-----------------");
		for(Double d : result1)
			System.out.println(d);
		System.out.println("---------------Second Result-------------------");
		List<Double> result2 = filterDemo.filteredMarks(input,filter2);
		for(Double d : result2)
			System.out.println(d);
	}
}
