package org.study.externalization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeExterlizationTester {

	public static void main(String[] args) {
		
		try {
			FileInputStream fs = new FileInputStream("/Users/pulgupta/Documents/tester.txt");
			ObjectInputStream nos = new ObjectInputStream(fs);
			List<Student> ls = new ArrayList<>();
			Student a = (Student)nos.readObject();
			System.out.println(a.getName());
//			try{
//				while(true) {
//					ls.add((Student) nos.readObject());
//				}
//			}
//			catch(EOFException e){
//				System.out.println("End of file exceptions");
//			}
//			finally {
//				nos.close();
//			}
//			for (Student student : ls) {
//				System.out.println("In loop " + student.getName() + " " + student.getAge());
//			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
