package org.study.enums;

enum BasicOperationTest implements Operation {
	
	PLUS("+") {
		public double apply(double x, double y) {
			return (x+y);
		}
	},
	
	MINUS("-") {
		public double apply(double x, double y) {
			return (x-y);
		}
	};
	
	private final String symbol;
	
	private BasicOperationTest(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
	
}

public class BasicOperation {
	public static void main(String[] args) {
		System.out.println(BasicOperationTest.PLUS.apply(10,100));
	}
}