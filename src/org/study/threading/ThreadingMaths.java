package org.study.threading;

public class ThreadingMaths {

	public static void main(String args[]) {
		
		CosMath cos = new CosMath(60);
		SinMath sin = new SinMath(60);
		TanMath tan = new TanMath(60);
		
		
		Thread thCos = new Thread(cos);
		Thread thSin = new Thread(sin);
		Thread thTan = new Thread(tan);
		
		thCos.start();
		thSin.start();
		thTan.start();
		
		try {
			thCos.join();
			thSin.join();
			thTan.join();
			System.out.println("sin " + sin.getResult());
			System.out.println("cos " + cos.getResult());
			System.out.println("tan " + tan.getResult());
			System.out.println("The result is " + (sin.getResult() + cos.getResult() + tan.getResult()));
		}
		
		catch(InterruptedException e) {
			System.out.println("Exception");
		}
		
	}
	
}
