package org.study.patterns.prototype;


/**
 * Concrete class for which we will be making clones
 * @author pulgupta
 *
 */
public class Laptop extends SystemDetails {

	public Laptop() {
		this.setType("laptop");
	}

	@Override
	void reboot() {
		System.out.println("Inside laptop");
		
	}

}
