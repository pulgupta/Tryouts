package org.study.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<String,Employee> map = new HashMap<String, Employee>();
		Employee e1 = new Employee("Pulkit1", 100000);
		Employee e2 = new Employee("Pulkit2", 200000);
		Employee e3 = new Employee("Pulkit3", 300000);
		Employee e4 = new Employee("Pulkit4", 400000);
		
		map.put("emp1", e1);
		map.put("emp2", e2);
		map.put("emp3", e3);
		map.put("emp4", e4);
		
		System.out.println("Writing the map to a file");
		FileOutputStream fs = new FileOutputStream("/Users/pulgupta/Documents/tester1.txt", false);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(map);
		os.close();
		fs.close();
		
		System.out.println("Reading the object from the file");
		FileInputStream fs1 = new FileInputStream("/Users/pulgupta/Documents/tester1.txt");
		@SuppressWarnings("resource")
		ObjectInputStream os1 = new ObjectInputStream(fs1);
		@SuppressWarnings("unchecked")
		Map<String,Employee> map1 = (Map<String, Employee>) os1.readObject();
		Iterator<Map.Entry<String, Employee>> itr = map1.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Employee> entry = itr.next();
			System.out.println("Key is "+ entry.getKey() + " value is " + entry.getValue());
		}
	}
}
