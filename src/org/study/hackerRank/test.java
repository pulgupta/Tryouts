package org.study.hackerRank;

import java.util.*;

public class test {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0 , number = 0, max = 0;
            
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(deque.size() >= m) {
            	number = deque.removeFirst();
            	if(frequency.get(number) == 1) {
                    if(sum > max)
                        max = sum;
                    sum--;
                }
                else  
                    frequency.put(number, frequency.get(number) -1 );
            }
            if(!deque.contains(num)) {
            	sum++;
            	if(sum > max)
            		max = sum;
                frequency.put(num, 1);
            }
            else
                frequency.put(num, (frequency.get(num) + 1));
            deque.addLast(num);
        }
        System.out.println(max);
    in.close();
    }
}

