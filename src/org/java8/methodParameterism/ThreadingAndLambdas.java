package org.java8.methodParameterism;

/**
 * This class shows the same example of running threads and passing a 
 * basic Runnable implementation by using Anoymous classes and 
 * then will use the Java 8 feature of Lambdas
 * @author pulgupta
 *
 */
public class ThreadingAndLambdas {
	public static void main(String[] args) {
		//Java 7 way of doing thing with anonymous class
		Thread th = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running a thread");
				}
			});
		th.start();
		
		//Java 8 way of doing things
		Thread th1 = new Thread(() -> System.out.println("Running a thread using Lambdas"));
		th1.start();
		
		//We can also assign lambdas to variables
		Runnable runnable = () -> System.out.println("Running a thread using Lambdas in a variable");
		Thread th2 = new Thread(runnable);
		th2.start();
	}
}
