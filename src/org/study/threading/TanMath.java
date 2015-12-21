package org.study.threading;

public class TanMath implements Runnable{
	
	private int degree;
	private double result;
	
	public TanMath(int degree) {
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
		this.result = Math.tan(degree);
		System.out.println("calculated tan");
	}
	
}
