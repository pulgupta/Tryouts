package org.study.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//A simple iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			itr.next();
			//We can only remove an element using the remove method only if we have called next 
			//remember that iterator maintains the reference in between of the elements
			itr.remove();
			System.out.println(itr.next());
		}
		
	}
}
