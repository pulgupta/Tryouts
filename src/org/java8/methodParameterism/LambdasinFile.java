package org.java8.methodParameterism;

import java.io.File;
import java.io.FileFilter;
/**
 * This class will show you the details of Method Parameterism using 
 * 1. Anonymous Class(Java7)
 * 2. Lambda (Java8) - My preference
 * 3. Method Passing(Java8) 
 * @author pulgupta
 *
 */
public class LambdasinFile {

	public static void main(String[] args) {
		File hiddenFile = new File("/Users/pulgupta");

		/**
		 * FileFilter is a functional interface It contains a single method
		 * accept which will filter the files based on criteria
		 */
		File[] list = hiddenFile.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		for (File file : list) {
			// System.out.println(file);
		}
		// SAME TASK USING JAVA 8
		//LAMBDA
		/**
		 * Trick for creating lambdas
		 * 1. Remove the new <<InterfaceName>> code for creating the anonymous class
		 * 2. Remove the method return type and name, but leave the parameters as is
		 * 3. Remove the explicit return statement and add a -> between parameters
		 * 4. We can even remove the Parameter type
		 * and the expression/statement
		 */
		File[] list_new = hiddenFile.listFiles((file) -> file.isHidden());
		for (File file : list_new) {
			System.out.println(file);
		}
		
		//METHOD PASSING
		File[] files = new File("/Users/pulgupta").listFiles(File::isHidden);
		for (File file : files) {
			//System.out.println(file);
		}
	}
}
