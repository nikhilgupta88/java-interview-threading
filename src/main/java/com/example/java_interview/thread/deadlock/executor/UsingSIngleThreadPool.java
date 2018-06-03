package com.example.java_interview.thread.deadlock.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingSIngleThreadPool {

	public static void main(String[] args) {
	
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.shutdown();
	}

}
