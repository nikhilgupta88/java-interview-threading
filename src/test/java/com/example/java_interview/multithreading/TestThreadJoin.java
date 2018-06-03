package com.example.java_interview.multithreading;

// Creating thread by creating the
// objects of that class
public class TestThreadJoin extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread: " + Thread.currentThread().getName());
			}

			catch (Exception ex) {
				System.out.println("Exception has" + " been caught" + ex);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// creating two threads
		TestThreadJoin t1 = new TestThreadJoin();
		TestThreadJoin t2 = new TestThreadJoin();
		TestThreadJoin t3 = new TestThreadJoin();

		// thread t1 starts
		t1.start();

		// starts second thread after when
		// first thread t1 is died.
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t1.join();
		}

		catch (Exception ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}

		// t2 starts
		t2.start();

		// starts t3 after when thread t2 is died.
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t2.join();
		}

		catch (Exception ex) {
			System.out.println("Exception has been" + " caught" + ex);
		}

		t3.start();
	}
}