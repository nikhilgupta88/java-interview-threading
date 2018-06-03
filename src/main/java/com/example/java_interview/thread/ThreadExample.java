package com.example.java_interview.thread;

public class ThreadExample {

	  public static void main(String[] args){
	    
		System.out.println(Thread.currentThread().getName()); // print the current thread name
	    
	    for(int i=0; i<1; i++){
	      new Thread("" + i) {
	        public void run(){
	          System.out.println("Thread: " + getName() + " running");
	        }
	      }.start();
	    }
	  }
	}