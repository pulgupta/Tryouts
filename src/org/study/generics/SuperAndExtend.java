package org.study.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * We have extends and super to bound the wild cards. 
 * Which to use where : in case you want to save data in a 
 * list then do not create list using extends as while 
 * defining the object you can use a sub-type of the bounded 
 * class and thus compiler will not know what we can store. 
 * In case of super as you can only use the parent class thus
 * it will allow you to write.
 * @author pulgupta
 *
 */
public class SuperAndExtend {
	
	public static void main(String[] args) {
		
		List<? extends Number> list1 = new ArrayList<Integer>();
		
		//See the below is an error as Integer is not the super class of Number
		//List<? super Number> list2 = new ArrayList<Integer>();
		List<? super Number> list2 = new ArrayList<Object>();
		
		Integer ii = 11;
		Number i = 10;
		
		//This can't as we are not sure in extend about the actual type
		//of the elements the list can hold like Double, Integer etc.
		//list1.add(i); - //****ERROR****
		//list1.add(ii); - //****ERROR****
		
		//This will work as we are adding number to a list which can hold
		//a number or any parent type of number which again will be a number
		list2.add(i);
		
	}
}
