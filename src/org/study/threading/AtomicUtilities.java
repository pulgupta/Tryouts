package org.study.threading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicUtilities {
	
	static AtomicInteger ai = new AtomicInteger();
	
	public static void main(String[] args) {
		
		
		float f = 114.99f;
		
		//We have to use the Atomic Integer set method and we can't just assign any value
		ai.set(Float.floatToIntBits(f));
		
		System.out.println(ai);
	
		//In this case also we will have to use the get method as 
		//Atomic Integer returns the int value from this get method.
		System.out.println(Float.intBitsToFloat(ai.get()));
		
		//Now we have seen how to store float values 
		//lets update something now
		
		ai.set(100);
		AtomicUtilities.addInteger(100);
		System.out.println(ai.get());
		
	}
	
	public static void addInteger(Integer a) {
		for(;;) {
			Integer currentValue = ai.get();
			Integer newValue = currentValue + a;
			if(ai.compareAndSet(currentValue,newValue))
					return;
		}
	}
}
