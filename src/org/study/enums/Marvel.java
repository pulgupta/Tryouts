package org.study.enums;

public enum Marvel {
	
	//This is the way of calling the constructor and setting the public final Strings of the enum type.
	//This is the way of putting the comments on all the constants of an enum
	/**
	 * Best super hero out there by far :)
	 */
	IRONMAN("Technology", "Attitude"),
	/**
	 * Ok he is also just fine.
	 */
	CAPTAINAMERICA("None", "absolutely nothing"),
	HULK,
	THOR;
	
	public final String attribute1;
	public final String attribute2;
	
	Marvel() {
		attribute1 = null;
		attribute2 = null;
	}
	
	Marvel(String att1, String att2) {
		this.attribute1 =att1;
		this.attribute2 =att2;
	}
}
