package org.study.enums;

public enum Marvel {
	
	//This is the way of calling the constructor and setting the public final Strings of the enum type.
	IRONMAN("Technology", "Attitude"),
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
