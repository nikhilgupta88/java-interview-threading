package com.example.java_interview.multithreading;

// Java program to demonstrate the usage of 
// setDaemon() and isDaemon() method.
public class TestDaemonThread extends Thread {
	public void run() {
		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Thread name: " + Thread.currentThread().getName());
			System.out.println("This is Daemon thread");
		}

		else {
			System.out.println("Thread name: " + Thread.currentThread().getName());

			System.out.println("This is User thread");
		}
	}

	public static void main(String[] args) {

		TestDaemonThread t1 = new TestDaemonThread();
		TestDaemonThread t2 = new TestDaemonThread();
		TestDaemonThread t3 = new TestDaemonThread();

		// Setting user thread t1 to Daemon
		t1.setDaemon(true);

		// starting all the threads
		t1.start();
		t2.start();
		t3.start();

		// Setting user thread t3 to Daemon

	}
}
