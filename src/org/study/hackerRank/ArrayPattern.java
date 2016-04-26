package org.study.hackerRank;

import java.util.Scanner;

public class ArrayPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			//Finding the pattern
			int patternLoc = -1;
			int temp;
			boolean cont = false;
			boolean found = false;
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < r; j++) {
					temp = G[i].indexOf(P[j]);
					if (temp != -1) {
						if (j == 0) {
							patternLoc = temp;
							i++;
							cont=true;
						} else if (temp != patternLoc && j!=0) {
							j = 0;
							cont=false;
						} else if (temp == patternLoc) {
							i++;
							cont=true;
						}

						if (j == r - 1 && cont == true) {
							System.out.println("YES");
							found=true;
							break;
						}
					}
					else{
						cont=false;
						break;
					}
				}
				if(found==true)
					break;
			}
			if(found==false)
				System.out.println("NO");
		}
	}
}
