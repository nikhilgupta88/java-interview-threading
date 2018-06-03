package com.example.java_interview.thread.deadlock;

// Java program to illustrate Deadlock situation

public class TestDeadLock2 extends Thread {
	static Thread mainThread;

	public void run() {
		System.out.println("Child Thread waiting for" + " main thread completion");
		try {

			// Child thread waiting for completion
			// of main thread
			mainThread.join();
		} catch (InterruptedException e) {
			System.out.println("Child thread execution" + " completes");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TestDeadLock2.mainThread = Thread.currentThread();
		TestDeadLock2 thread = new TestDeadLock2();

		thread.start();
		System.out.println("Main thread waiting for " + "Child thread completion");

		// main thread is waiting for the completion
		// of Child thread
		thread.join();

		System.out.println("Main thread execution" + " completes");
	}
}