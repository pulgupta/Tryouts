package org.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionLog {
	//This will mean that this annotation will accept any class which will extend Exception class
	//just add a "[]" after the > and it will be able to accept multiple classes as annotation parameters
	Class<? extends Exception> value();
	//String description;
}
