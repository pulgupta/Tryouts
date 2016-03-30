package org.study.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		//lets iterate using enumeration
		System.out.println("ENUMERATION EXAMPLE");
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
			System.out.println(integer);
		}
		
		System.out.println("ITERATOR EXAMPLE");
		//Lets iterate using iterator
		Iterator<Integer> i = v.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.println(integer);
		}
	}
}
