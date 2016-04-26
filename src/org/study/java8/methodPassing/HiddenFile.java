package org.study.java8.methodPassing;

import java.io.File;
import java.io.FileFilter;

public class HiddenFile {

	public static void main(String[] args) {
		File hiddenFile =  new File("/Users/pulgupta"); 
		File[] list = hiddenFile.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		for (File file : list) {
			//System.out.println(file);
		}
		
		
		//SAME TASK USING JAVA 8
		
		File[] files = new File("/Users/pulgupta").listFiles(File::isHidden);
		for (File file : files) {
			System.out.println(file);
		}
		
	}
}
