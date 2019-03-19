package org.study.threading.custom.executor.framework;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * We will be creating a custom executor framework with fixed pool of threads
 * The idea is a pool of thread will be maintained and once a thread is created
 * it will keep on executing tasks
 * 
 * @author pulgupta
 */
public class CustomExecutorFramework {

	// The idea here is to maintain a blocking queue which blocks in case there are no more element to pool
	private BlockingQueue<Runnable> taskQueue = null;

	public CustomExecutorFramework(int poolSize) {
		// The queue can accept any number of tasks and so is left open ended
		taskQueue = new LinkedBlockingQueue<>();
		for (int i = 0; i < poolSize; i++) {
			Thread t = new Thread(new TaskExecutor(poolSize, taskQueue), "poolThread" + (i + 1));
			t.start();
		}
	}

	public void submitTask(Runnable r) {
		taskQueue.add(r);
	}

	private static class TaskExecutor implements Runnable {
		// Each instance of TaskExecutor shares the same instance of the queue
		BlockingQueue<Runnable> taskQueue;

		public TaskExecutor(int size, BlockingQueue<Runnable> queue) {
			this.taskQueue = queue;
		}

		@Override
		public void run() {
			while (true) {
				// This is a blocking call. This will block the thread until taskQueue has some element
				Runnable r = taskQueue.poll();
				if (r != null) {
					System.out.print("\n" + Thread.currentThread().getName() + "\n");
					r.run();
				}
			}
		}
	}
}
