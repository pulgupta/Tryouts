package org.java8.methodParameterism.UserDefined;

import java.io.BufferedReader;
import java.io.IOException;
/**
 * This is a functional interface which will help us in 
 * Parametering the behaviour once we have a reader on a file and before we close it
 * Thus in this way we will be able to use the same boiler plate code and still will be able to perform 
 * multiple different tasks
 * @author pulgupta
 *
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
	
	//Will perform activities using the passed bufferedReader
	String process(BufferedReader br) throws IOException;
}
