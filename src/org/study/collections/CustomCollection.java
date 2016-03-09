package org.study.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomCollection<T> implements Iterable<T>{

	List<T> t;
	
	//On creating the new object we will decide which 
	//implementation we have to choose to get the custom collection working.
	
	public CustomCollection() {
		t = new ArrayList<>();
	}
	public T add(T value) {
		t.add(value);
		return value;
	}
	
	@Override
	public Iterator<T> iterator() {
		return t.iterator();
	}
	
}

class tester {
	public static void main(String[] args) {
		CustomCollection<String> cc= new CustomCollection<>();
		cc.add("Custom Collection 1");
		cc.add("Custom Collection 2");
		for (String string : cc) {
			System.out.println(string);
		}
	}
}