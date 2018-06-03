package com.example.java_interview.multithreading;

// Java code to see that all threads are
// pushed on same stack if we use run()
// instead of start().
public class TestThreadStart extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i < n; i++) {
			TestThreadStart object = new TestThreadStart();
			// start() is replaced with run() for
			// seeing the purpose of start
			object.run();
		}
		for (int i = 0; i < n; i++) {
			TestThreadStart object1 = new TestThreadStart();
			// start() is replaced with run() for
			object1.start();
		}

	}
}