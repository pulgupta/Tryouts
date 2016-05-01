package org.study.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTester {

	public static void serializeStudent() {
		Student st = new Student("Gargi", 27);
		st.setCity("Mathura");
		st.setDob("thisIsInParent");
		try {
			FileOutputStream fs = new FileOutputStream("/Users/pulgupta/Documents/tester1.txt" , false);
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
	public static void main(String[] args) {
		serializeStudent();
	}
}
