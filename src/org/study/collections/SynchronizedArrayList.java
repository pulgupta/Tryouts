package org.study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String args[]) {
		List<String> synchronizedArrayList = Collections.synchronizedList(new ArrayList<String>());
		Iterator<String> itr = synchronizedArrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
