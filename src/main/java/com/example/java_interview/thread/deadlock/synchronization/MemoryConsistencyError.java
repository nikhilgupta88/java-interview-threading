package com.example.java_interview.thread.deadlock.synchronization;

public class MemoryConsistencyError extends Thread {
	 
	   static int count = 0;
	 
	   public void run() {
	      for (int x=0; x<100000000; x++) {
	         count++;
	         count--;
	      }
	      System.out.println(this.getName() + " count: " + count);
	   }
	 
	   public static void main(String[] args) throws InterruptedException {
	 
	      MemoryConsistencyError t1 = new MemoryConsistencyError();
	      MemoryConsistencyError t2 = new MemoryConsistencyError();
	      t1.start();
	      t2.start();
	   }
	}
	 