package org.study.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardUtils {

	public static void main(String args[]) {
		List<Integer> intlist = new ArrayList<>();
		intlist.add(10);
		intlist.add(20);
		//By calling a wildcard method we will not have to think about the 
		//types and different warnings
		//Also by using the ? we can actually use the static methods - another advantage
		System.out.println(genericUtils.swap(intlist, 0, 1));
		for (Integer i : intlist) {
			System.out.println(i);
		}
	}
}

class genericUtils <E>
{
	/**
	 * 
	 * @param list : Generic list to be swapped
	 * @param i : first position
	 * @param j : second position
	 * @return
	 * This ? will help us in hiding the use of generics from the client
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean swap(List<?> list, int i, int j) {
		/*
		 * Object ob_i = (Object)list.get(i);
		Object ob_j = (Object)list.get(j);
		list.set(i, ob_j);
		*/
		//The above method will not compile
		//The idea is to use a helper method here
		return (new genericUtils().swapHelper(list,i,j));
	}
	public boolean swapHelper(List<E> list, int i, int j) {
		E e = list.get(i);
		System.out.println(e);
		//Can do this in one line itself
		//list.set(i, list.set(j, list.get(i)));
		//The above line will work as the set method will set the data
		// and will also return the original element and the index being set
		list.set(i, list.get(j));
		System.out.println(list.set(j, e));
		return true;
	}
}
