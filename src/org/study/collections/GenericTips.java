package org.study.collections;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author pulgupta
 * @description This class will show some neat tricks which will apply on collections
 * 
 */
public class GenericTips<E extends Number> {
	
	private E[] elements;
	Set<E> ssss;
	public GenericTips() {
		//will not work
		//elements = new E[90];
		//To make this work we will create an object array and then will cast it into E array
		//Also one point to take from here we can just not type cast primitive elements or objects
		//We can even typecast a complete array
		elements = (E[])new Object[10];
		ssss = new HashSet<>();
	}
	
	//In this way we can make a method generic without actually changing the class
	public static <K> Set<K> testType() {
		return new HashSet<K>();
	}
	
	public static void main(String args[]) {
		//A set which can contain object of some unknown type
		
		Set<? extends Number> s = new HashSet<>();
		Set<?> ss = new HashSet<>();
		Set<Object> sss = new HashSet<>();
		 

		//not working
		//s.add(new Integer(10));
		//not working
		//ss.add(new Integer(10));
		sss.add(new Integer(10));
		sss.add(new String("10")); //So we can mix and match the contents of a set like this.
		
		//1. First use of raw types
		System.out.println(Set.class);
		
		//2. Second use of raw types
		if(s instanceof Set)
			System.out.println("instance of set");
	}
}
