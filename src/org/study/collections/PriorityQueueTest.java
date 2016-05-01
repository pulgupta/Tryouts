package org.study.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * There are many ways in which we can traverse a Priority Queue
 * However it is always better not to use iterator in case you actually want to 
 * see the items in order
 * 
 * In a normal queue implementation we can see that the iterator will work 
 * perfectly. However in case of Priority queue this is not the case.
 * From what I have seen that most of the collections will work perfectly with 
 * iterator but not all and one example is proiority queue.
 * @author pulgupta
 *
 */
public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(1);
		pq.add(16);
		pq.add(2);
		int a = 10;
		String s = "" + a;
		/**
		 * Iteration will not give us the correct order
		 * This is because we are just traversing the collection
		 */
		System.out.println("**OUTPUT USING ITERATORS**");
		for (Integer integer : pq) {
			System.out.println(integer);
		}
		
		System.out.println("\n**OUTPUT USING POLL**");
		/**
		 * In case we want to get the correct order then we will have to 
		 * poll or peek the collection which will give us the correct order
		 * based in the comparator.
		 */
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
		
		//TESTING A NORMAL QUEUE(LINKLIST IMPLEMENTS QUEUE INTERFACE)
		Queue<Integer> queue1 = new LinkedList<>();
		queue1.add(10);
		queue1.add(20);
		queue1.add(5);
		queue1.add(15);
		
		System.out.println("\n**USING NORNAL ITERATOR ON LINKLIST**");
		for (Integer integer : queue1) {
			System.out.println(integer);
		}
		
		queue1.poll();
		System.out.println("\n**USING NORNAL ITERATOR ON LINKLIST AFTER POLL**");
		for (Integer integer : queue1) {
			System.out.println(integer);
		}
		
	}
}
