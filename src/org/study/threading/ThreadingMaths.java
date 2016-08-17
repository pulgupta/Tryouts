package org.study.threading;

public class ThreadingMaths {

	public static void main(String args[]) {
		
		CosMath cos = new CosMath(60);
		SinMath sin = new SinMath(60);
		TanMath tan = new TanMath(60);
		
		
		Thread thCos = new Thread(cos);
		thCos.setPriority(5);
		thCos.setName("CosThread");
		
		//****JAVA 7*****
		//thCos.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		
		//*****JAVA 8******
		thCos.setUncaughtExceptionHandler((Thread t, Throwable e) ->  System.out.println("ERROR!!"));
		
		Thread thSin = new Thread(sin);
		Thread thTan = new Thread(tan);
		
		thSin.setPriority(thTan.getPriority() + 1);
		thTan.setPriority(1);
		
		System.out.println("Priorities are as : Cos - " + thCos.getPriority());
		System.out.println("Priorities are as : Sin - " + thSin.getPriority());
		System.out.println("Priorities are as : Tan - " + thTan.getPriority());
		
		thCos.start();
		thSin.start();
		thTan.start();
		
		System.out.println("Priorities are as : Cos - " + thCos.getPriority());
		System.out.println("Priorities are as : Sin - " + thSin.getPriority());
		System.out.println("Priorities are as : Tan - " + thTan.getPriority());
		
		
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
