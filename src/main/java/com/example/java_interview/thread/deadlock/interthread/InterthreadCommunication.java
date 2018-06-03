package com.example.java_interview.thread.deadlock.interthread;

public class InterthreadCommunication {

	public static void main (String[] args) throws InterruptedException {
	
		ThreadB b = new ThreadB();
		
			b.start();
			//Thread.sleep(1000); Not recommended
			//b.join(); Not recommended
			//Thread.sleep(10000);b.wait(1000);
			synchronized(b) {
				System.out.println("Main Thread trying to call wait method");
				b.wait();//b.wait(1000);
				System.out.println("Main Thread got notification");
				System.out.print(b.total);
			}
			
			
	}
}
class ThreadB extends Thread {
	int total = 0;
	public void run() {
		
		synchronized (this) {
			System.out.println("Child Thread starts calculation");
			for(int i = 0; i <= 100; i++){
				total = total+i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();	
		}
		
	}
}

