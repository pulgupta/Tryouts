package org.study.exceptionHandling;

public class CatchingErrors {

	public static int throwAnError(int a) {
		if(a == 0)
			return 0;
		else
			throw new InstantiationError();
	}
	
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
			//CatchingErrors.throwAnError(1);
		}
		catch(NullPointerException | ClassCastException e) {
			System.out.println(e.getClass());
		}
		catch(Throwable e) {
			System.out.println("Caught the error");
		}
	}
	
}
