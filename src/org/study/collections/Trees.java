package org.study.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * A very basic implementation and use of trees.
 * One point to remember we can safely use iterator to get the element in the
 * correct order as per their natural ordering
 * @author pulgupta
 *
 */
public class Trees {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(1);
		set.add(9);
		set.add(11);
		
		//THUS WE CAN SAFELY USE A ITERATOR ON A SET TO GET THE ELEMENTS IN CORRECT ORDER
		System.out.println("Printing the details using iterator");
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
