package org.study.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Below we have an example of raw types.
 * They will work however we should only use these for backward compatibility.
 * @author pulgupta
 *
 */
public class RawTypes {
	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add("Hello");
		arr.add(1);
		
		for (Object object : arr) {
			System.out.println(object);
		}
	}
}
