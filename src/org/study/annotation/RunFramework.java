package org.study.annotation;

import java.lang.reflect.*;

public class RunFramework {

	public static void main(String args[]) throws Exception {
		@SuppressWarnings("rawtypes")
		Class test = Class.forName(args[0]);
		for (Method m : test.getDeclaredMethods()) {
			if(m.isAnnotationPresent(Log.class))
				System.out.println("annotation is present and will be duly noted");
			try{
				System.out.println(m.getName());
				m.invoke(null);
				System.out.println("No exception");
			}
			catch(InvocationTargetException e) {
				Throwable th = e.getCause();
				Class <? extends Exception> excType = m.getAnnotation(ExceptionLog.class).value();
				if(excType.isInstance(th))
					System.out.println("Caught the correct exception");
			}
			
			
		}
	}
}
