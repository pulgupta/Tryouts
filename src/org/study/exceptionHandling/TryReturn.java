package org.study.exceptionHandling;

class TryRetrunTest {
	public String testString = "Pulkit";
	public StringBuilder testString2 = new StringBuilder("Pulkit");
	
	public String myMethod() {
		try{
			return testString;
		}
		catch(Exception e) {
			System.out.println("");
		}
		finally {
			testString = testString + " Updated";
		}
		return testString;
	}
	public StringBuilder myMethodBuilder() {
		try{
			return testString2;
		}
		catch(Exception e) {
			System.out.println("");
		}
		finally {
			testString2.append(" Updated");
		}
		return testString2;
	}
	public void ExceptionPropogation() {
		int a =10/0;
		System.out.println(a);
	}
}

public class TryReturn {
	public static void main(String[] args) {
		TryRetrunTest trt = new TryRetrunTest();
		System.out.println(trt.myMethod());
		System.out.println(trt.myMethodBuilder());
		try{
			trt.ExceptionPropogation();
		}
		catch(Exception e) {
			System.out.println("caught a runtime exception");
		}
		trt.ExceptionPropogation();
	}
}
