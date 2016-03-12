package org.study.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * This is a utility class which has a method to actually clone the 
 * objects. We have mocked the actual logic of creating
 * expensive objects for say getting details from db and then creating them using a 
 * HashMap.
 * @author pulgupta
 *
 */
public class SystemCache {

	public static Map<Integer, SystemDetails> map = new HashMap<>();
	public static SystemDetails getDetails(int key) {
		SystemDetails sd = map.get(key);
		try {
			return (SystemDetails) sd.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	/**
	 * Assume this to be a very expensive operation 
	 * which we want to perform only once
	 */
	public static void loadCache() {
		Laptop lp = new Laptop();
		lp.setId(1);
		map.put(lp.getId(), lp);
		
		Desktop dp = new Desktop();
		dp.setId(2);
		map.put(dp.getId(), dp);
	}
}
