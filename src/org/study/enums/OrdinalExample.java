package org.study.enums;

public enum OrdinalExample {

	SOLO,
	DUET,
	TRIO,
	QUARTET,
	
	//Better way of doing this is without using ordinals
	
	QUINTET(5),
	SEXTET(6),
	SEPTET(7),
	DECTET(10);
	
	private final int size;
	
	OrdinalExample() {
		this.size=99;
	}
	OrdinalExample(int size) {
		this.size = size;
	}
	
	public int number() {
		return ordinal() + 1;
	}
	public int getNumber() {
		return size;
	}
}
