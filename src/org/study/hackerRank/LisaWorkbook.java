package org.study.hackerRank;

import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String data1 = in.nextLine();
		String data2 = in.nextLine();
		//Parsing data
		String[] chapLimit = data1.split(" ");
		String[] problems = data2.split(" ");
		
		
		int noOfChapters = Integer.parseInt(chapLimit[0]);
		int limit = Integer.parseInt(chapLimit[1]);
		
		int[] prob = new int[noOfChapters];
		for(int i =0;i < noOfChapters;i++) {
			prob[i] = Integer.parseInt(problems[i]);
		}
		//We have the data now lets see if we can not get the answer
		//Keep track of the page
		int page = 1, counter =0;
		for(int i =0;i < noOfChapters;i++) {
			int noOfProblems = prob[i];
			
			int totalCoverred = noOfProblems/limit;
			int partial = noOfProblems%limit;
			
			for(int j=1; j<=totalCoverred*limit;j=j+limit) { //Tracking the questions
				if(j<= page && page <j+limit)
					counter++;
				page++;
			}
			if(partial!=0){
				int startingQues = limit*totalCoverred +1;
				if(startingQues<=page && page <= noOfProblems)
					counter++;
				page++;
			}
			
		}
		System.out.println(counter);
		in.close();
		
	}
}
