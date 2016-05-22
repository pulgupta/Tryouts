package org.study.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class StringGrid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++) {
            int N = in.nextInt();
            in.nextLine();
            String[] data = new String[N];
            for(int j=0;j<N;j++) {
                data[j] = in.nextLine();
             }
            char[][] result = new char[N][N];
            boolean answer = true;
            for(int j=0;j<N;j++) {
                String original = data[j];
                char[] chars = original.toCharArray();
                Arrays.sort(chars);
                //Sorted the first line now we can put this char array in a temp array
                for(int k=0;k<N;k++)
                    result[j][k] = chars[k];
                //first condition is already verified
                //checking the row verification
                if(j > 0)
                    answer = validate(result, j, N);
                if(answer == false) {
                    System.out.println("NO");
                    break;
                } 
            }
            if(answer == true)
                System.out.println("YES");
        }
    }
    public static boolean validate(char[][] result, int j, int N) {
        //Till now we have only j rows
        //We will only compare the adjascent rows as it is transtive check
        for(int i=0;i<N;i++) {
        	System.out.print(result[j-1][i] + "  " + result[j][i] + " ::::: ");
            if(result[j-1][i] > result[j][i])
                return false;
        }
        return true;
    }
}