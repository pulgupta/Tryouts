package org.study.threading;

/**
 * Print 1,2,3,1,2,3.... in three separate threads
 * @author pulgupta
 */
public class Print123123Using3Threads {

	static final Object mutex = new Object();
	
	public static void main(String args[]) {
		// All the three thread will share the same mutex
		Thread t1 = new Thread(new MyTask(1, mutex));
		Thread t2 = new Thread(new MyTask(2, mutex));
		Thread t3 = new Thread(new MyTask(3, mutex));
		t1.start();
		t2.start();
		t3.start();
	}
}


class MyTask implements Runnable {

	// The flags will decide the turn
	static boolean one = true;
	static boolean two = false;
	static boolean three = false;
	int threadId;
	Object mutex;
	
	MyTask(int threadId, Object mutex) {
		this.threadId = threadId;
		this.mutex = mutex;
	}
	
	@Override
	public void run() {
		while(true) {
			// Just for some sanity
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (mutex) {
				if(threadId == 1) {
					// If it is thread 1, then it can only execute the first call
					while(!one) {
						try {
							mutex.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					// If it is one's turn, print 1 and then update the flag to set two's turn
					System.out.println(1);
					one=false;
					two=true;
					three=false;
					mutex.notifyAll();
				}
				if(threadId == 2) {
					while(!two) {
						try {
							mutex.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(2);
					one=false;
					two=false;
					three=true;
					mutex.notifyAll();
				}
				if(threadId == 3) {
					while(!three) {
						try {
							mutex.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(3);
					one=true;
					two=false;
					three=false;
					mutex.notifyAll();
				}
			}
		}
	}
	
}