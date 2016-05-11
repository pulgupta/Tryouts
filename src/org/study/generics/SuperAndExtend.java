package org.study.generics;

import java.util.ArrayList;
import java.util.List;

public class SuperAndExtend {
	public static void main(String[] args) {
		List<? extends Number> list1 = new ArrayList<Integer>();
		//See the below is an error as Integer is not the super class of Number
		//List<? super Number> list2 = new ArrayList<Integer>();
		
		List<? super Number> list2 = new ArrayList<Object>();
		
		Number i = 10;
		
		//This can't as we are not sure in extend about the actual type
		//of the elements the list can hold like Double, Integer etc.
		//list1.add(i); - //****ERROR****
		
		//This will work as we are adding number to a list which can hold
		//a number or any parent type of number which again will be a number
		list2.add(i);
		
	}
}
