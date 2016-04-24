package org.study.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class will contains all the tricks and tips for regular expression
 * As a good point to remember if you see we can use string and even string builder 
 * for giving the string to test
 * @author pulgupta
 * Things covered
 * 1. String matching true/false.
 * 2. String builder matching true/false.
 * 3. Extracting matches out of a big dataset.
 */
public class AllPossibleRegularExpression {

	public static void main(String[] args) {
		String pattern1 = "[A-Z]{1}[a-z]*";
		String data1 = "Pulkit";
		StringBuilder data2 = new StringBuilder("Gargi");
		AllPossibleRegularExpression.tryPattern(pattern1, data1);
		AllPossibleRegularExpression.tryPattern(pattern1, data2);
		String data3 = "Hello all this is a big data set. We will see if this will match" +
					".We will use this set for regex. If all goes well the program will run";
		//AllPossibleRegularExpression.findMatches(pattern1, data3);
		String pattern2 = "((1?[0-9]):([0-5][0-9]))[ap]m";
		AllPossibleRegularExpression.findMatches(pattern2, "11:59am");
	}
	
	/**
	 * These methods will only tell if the data is as per the regular expressio
	 * @param inputPattern
	 * @param data
	 */
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
	
	/**
	 * We have a use case in which we can use regex to find the substrings in a big
	 * string. We will take the string out of the complete data set and can then use it
	 * for other purposes
	 */
	public static void findMatches(String inputPattern, String data) {
		Pattern pattern = Pattern.compile(inputPattern);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			System.out.println("Start is : " + start + " and end is : " + end);
			String match = data.substring(start, end);
			System.out.println(match);
			
			System.out.println("dealing with groups");
			int start2 = -1;
			if(matcher.group(2) != null)
				start2  = matcher.start(3);
			System.out.println("Third groups starts at : " + start2);
		}
		
	}
}
