package org.study.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllPossibleRegularExpression {

	public static void main(String[] args) {
		String pattern1 = "[A-Z]{1}[a-z]*";
		String data1 = "Pulkit";
		AllPossibleRegularExpression.tryPattern(pattern1, data1);
	}
	
	public static void tryPattern(String inputPattern, String data) {
		Pattern pattern = Pattern.compile(inputPattern);
		Matcher matcher = pattern.matcher(data);
		if(matcher.matches())
			System.out.println("****What a great thing dude****");
		else
			System.out.println("****Try something else****");
	}
}
