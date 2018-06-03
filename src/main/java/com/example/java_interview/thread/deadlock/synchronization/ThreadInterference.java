package com.example.java_interview.thread.deadlock.synchronization;

class MyThread extends Thread {
	   Counter counter;
	 
	   MyThread(Counter counter){
	      this.counter = counter;
	   }
	   public void run() {
	         counter.increment();
	         counter.decrement();
	         counter.increment();
	        
   }
}
	 
class Counter {
	   private int count = 12;
	 
	   public synchronized void  increment() {
	      count++;
	   }
	 
	   public synchronized void decrement() {
		   count--;
	   }
	 
	   public int value() {
	      return count;
	   }
}
public class ThreadInterference {
	   public static void main(String[] args) throws InterruptedException {
	      Counter counter = new Counter();
	      System.out.println("Count: " + counter.value());
	      MyThread t1 = new MyThread(counter);
	      MyThread t2 = new MyThread(counter);
	      MyThread t3 = new MyThread(counter);
	      t1.start();
	      t2.start();
	      t3.start();
	      t1.join();
	      t2.join();
	      t3.join();
	      System.out.println("Count: " + counter.value());
	   }
	}