package org.study.patterns.prototype;

/**
 * This is the parent class of the concrete classes for which we will be 
 * making clones. This class overrides the cloneable interface and overrides the 
 * clone method
 * @author pulgupta
 * @version 1.0.0.0
 */
public abstract class SystemDetails implements Cloneable {
	
	private int id;
	private String type;
	abstract void reboot();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	/**
	 * As per effective java : 
	 * If you override the clone method in a non-final class, you should return an object obtained by invoking super.clone
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Cloneing");
		return super.clone();
	}
	

}
