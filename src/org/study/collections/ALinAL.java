package org.study.collections;

import java.util.ArrayList;
import java.util.List;

public class ALinAL {
	public static void main(String[] args) {
		List<List<Integer>> listInList =new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		List<Integer> list2 = new ArrayList<>();
		list1.add(5);
		list1.add(6);
		listInList.add(list1);
		listInList.add(list2);	
		
		for (List<Integer> outer : listInList) {
			for (Integer integer : outer) {
				System.out.println(integer);
			}
		}
		
	}
}
