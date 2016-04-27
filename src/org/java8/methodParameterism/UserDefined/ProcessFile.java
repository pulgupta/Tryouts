package org.java8.methodParameterism.UserDefined;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class contains a processFile method. This method 
 * helps in using the same boilerPlate code and still 
 * can perform different tasks
 * If we can see we are passing a functional interface object in the 
 * Method body. Thus this will open the gates for passing lambdas where we are 
 * passing the interface.
 * 
 * @author pulgupta
 *
 */
public class ProcessFile {
	
	public static String processFile(BufferedReaderProcessor p) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("/Users/pulgupta/Documents/JavaFileTest/serial.txt"))) {
			return p.process(br);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		//JAVA 7 WAY OF DOING THINGS
		String oneLine1 = ProcessFile.processFile(new BufferedReaderProcessor() {
			
			@Override
			public String process(BufferedReader br) throws IOException {
				return br.readLine();
			}
		});
		System.out.println(oneLine1);
		
		//JAVA 8 WAY OF DOING THINGS
		String twoLine2 = ProcessFile.processFile((BufferedReader br) -> br.readLine() + br.readLine());
		System.out.println(twoLine2);
	}
	
}
