package org.study.generics;

import java.util.ArrayList;
import java.util.List;

public class InvariantTest<E> {
	E item;
	List<E> list;
	
	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}
	
	public void setList(List<E> l) {
		this.list = l;
	}
	/**
	 * In case we want to perform some tasks in which know that the collection will return some types which are 
	 * subclass then in those cases we can also use use ? super Integer - which means any class which 
	 * is a super class of Integer
	 * @param l
	 * you want all the data from the list to set into another list of type <Object> then that method 
	 * should be ? super E as object is a super class of E which is an Integer. We mainly do this is 
	 * in consumers as there we will then have the option to create a Object acceptor. 
	 */
	public void setListGeneric(List<? extends E> l) {
		//cannot use this as lists are invariants
		//this.list = l;
		for (E e : l) {
			this.list.add(e);
		}
	}
	
}

class tester {
	public static void main(String args[]) {
		InvariantTest<Number> a = new InvariantTest<Number>();
		Number n = new Integer(10);
		Integer i = new Integer(20);
		a.item = n;
		a.item = i;
		a.setItem(n);
		a.setItem(i);
		a.setItem(new Double(10.0));
		
		//This all is working so lets see how we cam set these invariance
		
		InvariantTest<Integer> b= new InvariantTest<>();
		//The error below is : type mismatch a InvariantTest<Number> is not a InvariantTest<Integer>
		//b = a;
		
		//We will now try doing the same thing with arrays
		
		Object[] arr = new String[10];
		//On similar lines but error in below line
		//InvariantTest<Number> a = new InvariantTest<Integer>();
		
		List<Number> l1 = new ArrayList<>();
		l1.add(new Integer(10));
		List<Integer> l2 = new ArrayList<>();
		l2.add(new Integer(10));
		
		a.setList(l1);
		//again this will give us error as lists is invariant
		//a.setList(l2);
		a.setListGeneric(l2);
		
		
		System.out.println(a.item);
	}
}
