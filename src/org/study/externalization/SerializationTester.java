package org.study.externalization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTester {

	public static void main(String[] args) {
		Student st = new Student("Pulkit", "g" ,27);
		try {
			FileOutputStream fs = new FileOutputStream("/Users/pulgupta/Documents/tester.txt" , true);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(st);
			os.flush();
			os.close();
			System.out.println("Go check the file dude");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
