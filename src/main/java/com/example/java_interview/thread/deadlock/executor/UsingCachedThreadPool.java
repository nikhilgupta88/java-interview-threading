package com.example.java_interview.thread.deadlock.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {

	public static void main(String[] args) {
	
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.shutdown();
	}

}
