package org.study.threading.producerConsumer;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProducerConsumer {
	public static void main(String[] args) throws InterruptedException{
		Queue<Integer> queue= new PriorityQueue<Integer>();
		
		Thread th1 = new Thread(new Producer(queue));
		Thread th2 = new Thread(new Consumer(queue));
		
		th1.start();
		Thread.sleep(5000);
		th2.start();
		
	}
}
