package org.study.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Conversions {
	
	static Set<Integer> listToSet(List<Integer> a) {
		Set<Integer> set = new HashSet<>();
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext())
			set.add(itr.next());
		return set;
	}
	
	static Set<Integer> arrayToSet(Integer[] a) {
		Set<Integer> set = new HashSet<>(Arrays.asList(a));
		return set;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Integer[] array = {6,7,8,9,10};
		
		//List to Set conversion
		Set<Integer> set = Conversions.listToSet(list);
		System.out.println("*****List to Set conversion*****");
		for (Integer integer : set) {
			System.out.println(integer);
		}
		//Array to hash set
		Set<Integer> set2 = Conversions.arrayToSet(array);
		System.out.println("*****Array to Set conversion*****");
		for (Integer integer : set2) {
			System.out.println(integer);
		}
	}
}
