package org.study.exceptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		try
		{
			//This is error as we do not have a catch or a finally block for the 
			//inner try block
		    //try
		    {
		    }
		}
		catch(Exception e)
		{
			
		}
	}
}
