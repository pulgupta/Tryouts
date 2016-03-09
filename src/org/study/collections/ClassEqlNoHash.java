package org.study.collections;

/**
 * This class will have a equals method but will not have the hashcode method.
 * In this way we will check what will happen if we will add its objects to a 
 * hashset and a hashmap
 * @author pulgupta
 *
 */
public class ClassEqlNoHash {

	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(! (obj instanceof ClassEqlNoHash))
			return false;
		ClassEqlNoHash o = (ClassEqlNoHash)obj;
		return (o.getAddress().equals(this.getAddress()) && o.getName().equals(this.getName()));
		
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	
}
