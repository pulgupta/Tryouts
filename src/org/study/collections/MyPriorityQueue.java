package org.study.collections;

import java.util.PriorityQueue;
import java.util.Queue;
/**
 * Priority queues provide log n time complexity for adding and removing element.
 * @author pulgupta
 *
 */
public class MyPriorityQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(40);
		queue.add(70);
		queue.add(20);
		queue.add(50);
		queue.add(30);
		
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		
	}

}
