package org.java8.streams;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList; 

//In this example we are performing some operation on the array elements
public class StreamOperations {
	
	public static int veryComplexCalculations(int a){
		//a very complex operation
		return a+1;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//Work on each array element and perform some operation
		List<Integer> squared = list.stream()
									.map(n -> n*n)
									.collect(toList());
		for (Integer integer : squared) {
			System.out.print(integer + " ");
		}
		
		System.out.println("");
		List<Integer> complexOne = list.stream()
				.map(StreamOperations::veryComplexCalculations)
				.collect(toList());
		for (Integer integer : complexOne) {
			System.out.print(integer + " ");
		}
		
		System.out.println("\n" + list.stream()
								.anyMatch(d -> d==2));

	}
}
