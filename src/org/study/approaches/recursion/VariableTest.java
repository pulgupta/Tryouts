package org.study.approaches.recursion;

public class VariableTest {

	public static int testVar(int limit) {
		if(limit<0)
			return 0;
		int sum = testVar(limit-1);
		return sum+limit;
	}
	public static void main(String[] args) {
		System.out.println(testVar(2));
	}
}
