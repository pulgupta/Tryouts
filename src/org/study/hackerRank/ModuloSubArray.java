package org.study.hackerRank;

import java.util.Scanner;

public class ModuloSubArray {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0;i<T;i++) {
            //This loop will work on each test case
            int N = in.nextInt();
            int M = in.nextInt();
            long[] arr = new long[N];
            //Taking in array elements
            for(int j=0;j<N;j++) {
                arr[i] = in.nextInt();
            }
            long test = 1000000000000000000L;
            //Now we have the data lets start the magic
            long max_so_far = 0,  max_till_now = 0;
            for(int j=0;j<N;j++){
                max_till_now=(max_till_now+arr[i])%M;
                if(max_so_far<max_till_now)
                    max_so_far = max_till_now;
            }
            System.out.println(max_so_far);
        }
        
    }
}