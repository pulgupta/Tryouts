package org.study.threading.custom.executor.framework;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * We will be creating a custome executor framework with fixed pool of threads
 * The idea is a pool of thread will be maintained and once a thread is created it will
 * keep on executing tasks
 * @author pulgupta
 */
public class CustomExecutorFramework {

	int poolSize = 0;
	BlockingQueue<Runnable> taskQueue = null;
	public CustomExecutorFramework(int poolSize) {
		this.poolSize = poolSize; 
		// The queue can accept any number of tasks and so is left open ended
		taskQueue = new LinkedBlockingQueue<>(); 
	}
	
	public void submitTask(Runnable r) {
		taskQueue.add(r);
	}
}
