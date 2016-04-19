package org.study.serialization;

import java.io.NotSerializableException;

import org.junit.runners.model.InitializationError;

public class SubStudent extends Student{

	public SubStudent() throws InitializationError {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * In this case we have a parent class which is serializable and thus
	 * this means that our sub class will also be serializable automatically.
	 * Hence if we want to make our sub class not serializable we can use 
	 * read and write object methods and can throw exception.
	 * @param stream
	 * @throws NotSerializableException 
	 */
	private void writeObject(java.io.ObjectOutputStream stream) throws NotSerializableException{
		throw new NotSerializableException();
	}
	
	private void readObject(java.io.ObjectInputStream stream) throws NotSerializableException{
		throw new NotSerializableException();
	}

}
