package org.study.collections;

import java.util.HashMap;
import java.util.Map;

public class AllAboutMaps {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, null);
		
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(2));
	}
}
