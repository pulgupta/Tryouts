package org.study.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Some basic differences between HashMap and ConcurrentHashMap.
 * @author pulgupta
 * @date 9-5-2016
 */
public class HashMapVsConcHashMap {

	public static void main(String[] args) {
		Map<Integer , Integer> map = new HashMap<>();
		map.put(1, null);
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		//BOTH OF THE ABOVE STATEMENT WILL GIVE A NULL
		//NOW WE CAN CHECK IF THE KEY 1/2 EXISTS
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(2));
		/**
		 * Using the above dual check of contains and get we can 
		 * clearly decide when the value is null and when it does not 
		 * exists
		 */
		Map<Integer, Integer> concMap = new ConcurrentHashMap<>();
		try {
			concMap.put(1, null);
		}
		catch(NullPointerException e) {
			System.out.println("Lo yaar aa gayi na error");
		}
		/**
		 * We can even call contains on a concurrent hash map 
		 * However nulls are not allowed as we can see that we are getting null
		 * pointer exception
		 */
		System.out.println(concMap.containsKey(1));
		
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(1, 10);
		treeMap.put(5, 7);
		treeMap.put(2, 4);
		
		//This will give us the sorted collection
		for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
