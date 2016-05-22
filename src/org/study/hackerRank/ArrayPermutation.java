package org.study.hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPermutation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			System.out.println(N);
			int K = in.nextInt();
			System.out.println(K);
			int[] arr1 = new int[N];
			int[] arr2 = new int[N];
			for (int j = 0; j < N; j++) {
				arr1[j] = in.nextInt();
			}
			for (int j = 0; j < N; j++) {
				arr2[j] = in.nextInt();
			}
			Arrays.sort(arr1);
			for (int j : arr1) {
				System.out.println(j);
			}
			
			Arrays.sort(arr2);
			
			for (int j : arr2) {
				System.out.println(j);
			}
			
			boolean flag = false;
			for (int j = 0; j < N; j++) {
				System.out.print((arr1[j] + arr2[N - 1 - j]) + " :: ");
				if (arr1[j] + arr2[N - 1 - j] < K) {
					System.out.println("NO");
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println("YES");
		}
	}
}
