package org.study.patterns.prototype;

/**
 * Concrete class for which we will be making clones
 * @author pulgupta
 *
 */
public class Desktop extends SystemDetails {

	public Desktop() {
		this.setType("desktop");
	}

	@Override
	void reboot() {
		System.out.println("Inside laptop");
		
	}

}
