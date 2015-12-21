package org.study.threading;

public class CosMath implements Runnable{
	
	private int degree;
	private double result;
	
	public CosMath(int degree) {
		this.degree = degree;
	}
	
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public double getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public void run() {
		this.result = Math.cos(degree);
		System.out.println("calculated cos");
	}
	
}
