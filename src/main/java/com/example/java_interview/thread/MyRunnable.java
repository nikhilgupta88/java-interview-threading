package com.example.java_interview.thread;

public class MyRunnable implements Runnable {

	public void run() {
		System.out.println("MyRunnable is running");
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
	}

	public static void main (String[] args) {
		Thread t = new Thread(new MyRunnable());
		System.out.println(t.getName());
		t.start();
	}
}
