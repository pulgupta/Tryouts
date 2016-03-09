package org.study.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashing {

	public static void main(String args[]) {
		//Thus hash table is also a kind of hashmap
		Map<Integer, Integer> mp = new Hashtable<>();
		Map<ClassEqlNoHash, String> map = new HashMap<>();
		
		Set<ClassEqlNoHash> set = new HashSet<>();
		/**
		 * In this set we will add the class objects which has just the equals method overridden
		 */
		ClassEqlNoHash obj1 = new ClassEqlNoHash();
		obj1.setName("Pulkit");
		obj1.setAddress("Pune");
		ClassEqlNoHash obj2 = new ClassEqlNoHash();
		obj2.setName("Pulkit");
		obj2.setAddress("Pune");
		set.add(obj1);
		set.add(obj2);
		System.out.println(obj1.equals(obj2));
		for (ClassEqlNoHash classEqlNoHash : set) {
			System.out.println(classEqlNoHash.getName() + " " + classEqlNoHash.getAddress());
		}
		
		map.put(obj1, "object 1");
		map.put(obj2, "object 2");
		
		for (Entry<ClassEqlNoHash, String> classHash : map.entrySet()) {
			System.out.println(classHash.getKey().getName() + " " + classHash.getKey().getAddress());
		}
	}
}
