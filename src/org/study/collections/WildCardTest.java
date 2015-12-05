package org.study.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @description : Take aways from this
 * In the main you can see we are not actually doing anything with Integer as 
 * we are not aware what sub class can come over there
 * Also we are not able to fill values to a list of ? - Question marks
 * ? here is the wild card which we are using
 * @author pulgupta
 *
 */
public class WildCardTest {
	
	List<? extends Number> list;
	List<?> list1;
	
	public static void main(String args[]) {
		WildCardTest t = new WildCardTest();
		t.list = t.getList();
		t.list1 = t.getList();
		
		//As we are saying that ? will be a subclass of Number 
		//Below we are just expecting a number and not the sub class
		
		for (Number ii : t.list) {
			System.out.println("values of i is " + ii);
		}
		
		//Another important point in case we are using a unbounded list we will have to 
		//take the type of variable as Object
		
		for (Object ii : t.list1) {
			System.out.println("values of i is " + ii);
		}
	}
	
	public List<Integer> getList() {
		List<Integer> i = new ArrayList<>();
		i.add(10);
		return i;
	}
}
