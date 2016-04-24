package org.study.collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(1);
		pq.add(16);
		pq.add(2);
		
		/**
		 * Iteration will not give us the correct order
		 * This is because we are just traversing the collection
		 */
		for (Integer integer : pq) {
			System.out.println(integer);
		}
		
		/**
		 * In case we want to get the correct order then we will have to 
		 * poll or peek the collection which will give us the correct order
		 * based in the comparator.
		 */
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
	}
}
