package org.study.db.inter;

public class ExceptionTest {

	public static void main(String args[]) {
		try {
			System.out.println(1);
			throw new java.lang.Exception();
		}
		catch(Exception e){
			System.out.println(2);
		}
		finally {
			System.out.println(3);
		}
	}
}
