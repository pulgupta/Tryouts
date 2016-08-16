package org.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList; 

//In this example we are performing some operation on the array elements
public class StreamOperations {
	
	public static int veryComplexCalculations(int a){
		//a very complex operation
		return a+1;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println("Original list 1,2,3,4,5");
		//Work on each array element and perform some operation
		//In this case the operation is defined as a lambda
		List<Integer> squared = list.stream()
									.map(n -> n*n)
									.collect(toList());
		for (Integer integer : squared) {
			System.out.print(integer + " ");
		}
		
		//CASE 2 : In this case we are using method reference
		//We have defined the static method up for using it as a method reference
		System.out.println("");
		List<Integer> complexOne = list.stream()
				.map(StreamOperations::veryComplexCalculations)
				.collect(toList());
		for (Integer integer : complexOne) {
			System.out.print(integer + " ");
		}
		
		//CASE 3: Terminal operation of types like anyMatch, allMatch, noneMatch
		System.out.println("\n" + list.stream()
								.anyMatch(d -> d==2));
		
		//CASE 4: Reducing the stream into a single value
		//THis is know as fold in functional programming case
		int sum = list.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		//CASE 5: New static methods in Integer class to be used for method reference
		//Just like this Java 8 has introduced many new static methods like min max etc
		System.out.println(list.stream().reduce(0, Integer::sum));
		
		//CASE 6 The new way of finding max and minimum from a steam.
		//This example also highlights the use of the Optional 
		Optional<Integer> max = list.stream().reduce(Integer::max);
		max.ifPresent(System.out::print);

	}
}
