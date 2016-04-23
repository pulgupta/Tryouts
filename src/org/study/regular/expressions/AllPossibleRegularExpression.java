package org.study.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class will contains all the tricks and tips for regular expression
 * As a good point to remember if you see we can use string and even string builder 
 * for giving the string to test
 * @author pulgupta
 *
 */
public class AllPossibleRegularExpression {

	public static void main(String[] args) {
		String pattern1 = "[A-Z]{1}[a-z]*";
		String data1 = "Pulkit";
		StringBuilder data2 = new StringBuilder("Gargi");
		AllPossibleRegularExpression.tryPattern(pattern1, data1);
		AllPossibleRegularExpression.tryPattern(pattern1, data2);
	}
	
	public static void tryPattern(String inputPattern, String data) {
		Pattern pattern = Pattern.compile(inputPattern);
		Matcher matcher = pattern.matcher(data);
		if(matcher.matches())
			System.out.println("****What a great thing dude****");
		else
			System.out.println("****Try something else****");
	}
	public static void tryPattern(String inputPattern, StringBuilder data) {
		Pattern pattern = Pattern.compile(inputPattern);
		Matcher matcher = pattern.matcher(data);
		if(matcher.matches())
			System.out.println("****What a great thing dude****");
		else
			System.out.println("****Try something else****");
	}
}
