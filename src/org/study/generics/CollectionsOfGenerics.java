package org.study.generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsOfGenerics<T> {
	
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	//ERROR
	//public boolean equals(T value) {
		//return false;
		
	//}
	/**
	 * This below method is an error. 
	 * We cannot reference non static variable from static context.
	 * @return
	 *
	public static T printInfo() {
		return data;
	}
	*/

}


class genericCollectionTester {
	public static void main(String[] args) {
		CollectionsOfGenerics<String> abc = new CollectionsOfGenerics<>();
		abc.setData("Pulkti");
		CollectionsOfGenerics<Integer> abc1 = new CollectionsOfGenerics<>();
		abc1.setData(10);
		CollectionsOfGenerics<Integer> abc2 = new CollectionsOfGenerics<>();
		abc2.setData(20);
		
		//ERROR : CollectionsOfGenerics<String> [] temp = new CollectionsOfGenerics<String>[];
		
		List<CollectionsOfGenerics<Integer>> mylist = new ArrayList<>();
		//ERROR : mylist.add(abc);
		mylist.add(abc1);
		mylist.add(abc2);
		
	}
}