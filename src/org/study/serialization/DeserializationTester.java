package org.study.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationTester {

	/**
	 * Just like in case of clone de-serialization will not call the constructor.
	 */
	public static void deSerializeStudent() {

		try {
			FileInputStream fs = new FileInputStream("/Users/pulgupta/Documents/tester1.txt");
			ObjectInputStream os = new ObjectInputStream(fs);
			Student st = (Student) os.readObject();
			System.out.println("The data of the object is " + st.getName() + " " + st.getAge());
			// Solution for multiple serialized objects
			List<Student> ls = new ArrayList<>();
			try {
				while (true) {
					ObjectInputStream nos = new ObjectInputStream(fs);
					ls.add((Student) nos.readObject());
				}
			} catch (EOFException e) {
				// EOF exception ignored
			}
			for (Student student : ls) {
				System.out.println("In loop " + student.getName() + " " + student.getAge());
			}
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		deSerializeStudent();
	}
}
