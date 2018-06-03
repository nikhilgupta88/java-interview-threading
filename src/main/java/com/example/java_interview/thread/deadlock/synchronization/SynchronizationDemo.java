package com.example.java_interview.thread.deadlock.synchronization;

public class SynchronizationDemo {

	public static void main (String[] args) throws InterruptedException {
		Display d1 = new Display();
		Display d2 = new Display();
		Mythreadd t1 = new Mythreadd(d1, "Dhoni");
		Mythreadd t2 = new Mythreadd(d2, "Yuvraj");
		t1.start();
		d1.wait();
		t2.start();
	}
}
 class Display {
	public static synchronized void wish(String name) {
		for(int i = 0; i < 10; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}
class Mythreadd extends Thread {
	Display d;
	String name;
	Mythreadd(Display d, String name){
		this.name = name;
		this.d = d;
	}
	public void run() {
		Display.wish(name);
	}
}
