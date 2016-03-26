package org.study.threading.executorDemo;

import java.util.concurrent.Callable;

public class PerformTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Thread.sleep(10000);  //We can assume that we are doing some very long processing here
		return 10;
	}

}
