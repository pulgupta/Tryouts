package org.study.serialization.advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class SingletonSerializationTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int VALUE = 100;
	public static SingletonSerializationTest ref;

	private SingletonSerializationTest() throws Exception {
		if (ref != null)
			throw new Exception();
	}

	public static SingletonSerializationTest getInstance() {
		if (ref != null)
			return ref;
		else {
			try {
				ref = new SingletonSerializationTest();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ref;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SingletonSerializationTest))
			return false;
		SingletonSerializationTest c = (SingletonSerializationTest) obj;
		System.out.println("Checking references");
		if (c == this)
			return true;
		System.out.println("In equals INST 1 value : " + c.VALUE + " INST 2 value : " + this.VALUE);
		if (c.VALUE == this.VALUE)
			return true;
		else
			return false;
	}
	
	/**
	 * Just by adding this method the second equals check will pass with a true.
	 * In case we are not implementing this method then we will get a false in the second check
	 * @return
	 * @throws ObjectStreamException
	 */
	protected Object readResolve() throws ObjectStreamException {
		return ref;
	}
}

public class SingletonSerialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonSerializationTest instance1 = SingletonSerializationTest.getInstance();
		SingletonSerializationTest instance2 = SingletonSerializationTest.getInstance();
		System.out.println("Is both objects equals " + instance1.equals(instance2));

		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("/Users/pulgupta/Documents/JavaFileTest/serial.txt"));
		oos.writeObject(instance1);


		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("/Users/pulgupta/Documents/JavaFileTest/serial.txt"));
		SingletonSerializationTest obj = (SingletonSerializationTest)ois.readObject();
		obj.VALUE =10;
		System.out.println("Is both objects equals " + instance1.equals(obj));
		
		oos.close();
		ois.close();

	}
}