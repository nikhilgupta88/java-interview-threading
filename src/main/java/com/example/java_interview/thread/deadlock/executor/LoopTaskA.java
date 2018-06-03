package com.example.java_interview.thread.deadlock.executor;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private int id;
	private static int count  = 0;
	public void run() {
		System.out.println(" ##### "+"Task "+id+" Starts"+" ##### ");
		for(int i = 10; i > 0; i--) {
			System.out.println("<"+ id +"> TICK TICK "+i);
		try {
			TimeUnit.MILLISECONDS.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(" ***** "+" Task "+id+" Ends "+" ***** ");
	}

	public LoopTaskA() {
		this.id = ++count;
		

	}
}
