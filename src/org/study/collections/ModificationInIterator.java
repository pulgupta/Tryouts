package org.study.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModificationInIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) { 
			int a = iterator.next();
			System.out.println(a);
			if(a == 50)
				iterator.remove();
		}
		
		System.out.println("The new modified list is :");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
