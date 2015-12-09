package org.study.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greeting;
	
	@Before
	public void setup() {
		System.out.println("setup");
		greeting = new GreetingImpl();
	}
	
	@Test
	//All the test methods should be void and also they should have @Test annotation
	public void greetShouldReturnValidOutput() {
		System.out.println("greetShouldReturnValidOutput");
		String result = greeting.greeting("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	//For testing an expected exception we can use the below annotation attribute
	//Also remember that the test case can execute in any order so do not make any assumption on the order of test casese
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowAnExceptionForNullName() {
		System.out.println("greetShouldThrowAnExceptionForNullName");
		String result = greeting.greeting(null);	
	}
	
	//Always make a habit of creating separate test cases for almost all the test scenarios
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowAnExceptionForEmptyName() {
		System.out.println("greetShouldThrowAnExceptionForEmptyName");
		String result = greeting.greeting("");	
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
		greeting = null;
	}
	

}
