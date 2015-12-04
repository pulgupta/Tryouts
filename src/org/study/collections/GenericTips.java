package org.study.collections;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author pulgupta
 * @description This class will show some neat tricks which will apply on collections
 * 
 */
public class GenericTips {
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
