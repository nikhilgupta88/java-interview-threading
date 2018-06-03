package com.example.java_interview.thread;

import java.util.concurrent.TimeUnit;

public class SecondWay {

	public static void main(String[] args) {
		System.out.println("main Thread starts here....");
		new SecondTask().start();
		Thread t = new SecondTask();
		t.start();
		System.out.println("main Thread ends here....");
		}

}
class SecondTask extends Thread {
	private int id;
	private static int count  = 0;
	@Override
	public void run() {
		
		for(int i = 10; i > 0; i--) {
			System.out.println("<"+ id +"> TICK TICK "+i);
		try {
			TimeUnit.MILLISECONDS.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public SecondTask() {
		this.id = ++count;
	}
}