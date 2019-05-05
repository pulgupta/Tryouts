package org.study.patterns.adaptor;

public class FreeText implements Text {

	String text;
	
	@Override
	public void write() {
		System.out.println("Write free text");
	}

}
