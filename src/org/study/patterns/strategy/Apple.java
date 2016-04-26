package org.study.patterns.strategy;

public class Apple {

	int weight;
	String size;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public void printApple(PrettyPrintApple p) {
		p.prettyPrintApple(this);
	}
	
}
