package org.study.enums;

import java.util.HashMap;
import java.util.Map;

public enum DC {
	SUPERMAN,
	BATMAN;
	
	//Arbitrary fields
	int a = 10;
	
	public static void helperMethod(){
		System.out.println("This is a helper method");
	}
	
	//Arbitrary Methods
	public void getDescription() {
		System.out.println("Output of THIS : " + this);
		System.out.println("This enum contains the DC universe heros");
	}
	
	//The below logic till the method fromString is a logic which is used
	//to get the object of the enum back by specifying the string value
	//Thus toString will convert from obj to string and fromString will do the vice versa
	static Map<String, DC> val = new HashMap<>();
	static {
		val.put(DC.SUPERMAN.toString(), DC.SUPERMAN);
		val.put(DC.BATMAN.toString(), DC.BATMAN);
	}
	
	public static DC fromString(String name) {
		return val.get(name);
	}
}
