package org.study.patterns;

//We will assume this as a car model which is a singleton and is used to create multiple cars
public class StaticFactoryPattern {

	//These are the dimentions of the car model which we are creating
	float length;
	float width;
	float height;
	private static StaticFactoryPattern ref;
	
	//Making the constructor as private
	private StaticFactoryPattern(float l, float w, float h) {
		this.length = l;
		this.width = w;
		this.height = h;
	}
	
	public static StaticFactoryPattern acquireModel(float l, float w, float h) {
		//This method is better than the public field approach as in this we can control in what all 
		//cases we want a new instance
		if(ref == null)
			ref =  new StaticFactoryPattern(l,w,h);
		return ref;
	}
}

class tester {
	public static void main(String args[]) {
		System.out.println("Create a new instance");
		StaticFactoryPattern cm1 = StaticFactoryPattern.acquireModel(10, 20, 30);
		System.out.println(cm1.length + " " + cm1.width + " " + cm1.height);
		
		System.out.println("Create 2nd new instance");
		StaticFactoryPattern cm2 = StaticFactoryPattern.acquireModel(100, 200, 300);
		System.out.println(cm2.length + " " + cm2.width + " " + cm2.height);
	}
}

//Cannot extend the CarModel class as it has only private constructors.
/*
class inhertTest extends CarModel {
	
}*/
