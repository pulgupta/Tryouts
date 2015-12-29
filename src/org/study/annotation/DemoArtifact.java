package org.study.annotation;

public class DemoArtifact {

	@Log
	public static void myMethod1() {
		System.out.println("This is my method1");
	}
	@ExceptionLog(NullPointerException.class)
	public static void myMethod2() {
		System.out.println("This is my method2");
	}
	@ExceptionLog(ArithmeticException.class)
	public static void myMethod3() {
		System.out.println("This is my method3");
		int a = 1/0;
		System.out.println(a);
	}
}
