package org.study.junit;

public class GreetingImpl implements Greeting{

	@Override
	public String greeting(String name) {
		if(name == null || name.length() == 0 )
			throw new IllegalArgumentException();
		return "Hello " + name;
	}
}
