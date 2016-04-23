package org.study.serialization.advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The whole point of this example is to prove is that if we are sharing
 * the same object across the state of many other objects and we save these other objects
 * then the share object state is saved only once.
 * Hence if we reconstruct the same object graph again the relationship of this sharing will be
 * maintained and thus no extra objects will be created.
 * @author pulgupta
 * However we must pay attention that this main method will result in 6 objects 
 * 3 which were created earlier and 3 which were created as a result of deserialization
 */
public class SerializeDeserialize {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee tom = new Employee("Tom", 1000000, null);
		Employee jack = new Employee("Jack", 2000000, null);
		Employee tracy = new Employee("Tracy", 100000, null);
		
		//Both of Tom and Jack share the same Secretary
		tom.setSectary(tracy);
		jack.setSectary(tracy);
		
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/pulgupta/Documents/JavaFileTest/advanced.txt"));
		 oos.writeObject(tom);
		 oos.writeObject(jack);
		 //oos.writeObject(tracy);
		 
		 oos.close();
		 
		 System.out.println("****We have written the file****\nNow lets recreate objects");
		 
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/pulgupta/Documents/JavaFileTest/advanced.txt"));
		 Employee tomRecreated = (Employee) ois.readObject();
		 Employee jackRecreated = (Employee) ois.readObject();
		 
		 System.out.println("Jack's secretary salary is " + jackRecreated.getSectary().getSalary());
		 tomRecreated.getSectary().setSalary(10);
		 
		 System.out.println("Jack's secretary salary after tom secretary's salary is updated " + jackRecreated.getSectary().getSalary());
		 tracy.setSalary(2);
		 System.out.println("Jack's secretary salary after tracy salary is updated " + jackRecreated.getSectary().getSalary());
		 ois.close();
	}
}
