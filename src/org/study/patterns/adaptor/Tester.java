package org.study.patterns.adaptor;

/**
 * The idea here is that we have shape interface and we have many concrete classes 
 * for it. Now we want to use a Text as a shape. We have two ways
 * Object
 * 		In this we can embed an object of Tree in the adapter class
 * Class 
 * 		In this we can implement the Shape interface and extend the freeText class
 * @author pulgupta
 *
 */
public class Tester {

	public static void main(String[] args) {
		
		Text t = new FreeText();
		
		Shape s = new Square();
		Shape s1 = new ClassAdapterExample();
		Shape s2 = new ObjectAdapterExample(t);
		
		s.draw();
		s1.draw();
		s2.draw();
		
	}
}
