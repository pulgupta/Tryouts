package org.study.enums;

public enum BasicOperation implements Operation {
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
	
	private BasicOperation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
	
}
