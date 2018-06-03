package com.example.java_interview.thread;

import java.util.concurrent.TimeUnit;

public class FifthWay {

	public static void main(String[] args) {
		System.out.println("main Thread starts here....");
		
		new Thread(new Runnable() {
			
			public void run() {
				for(int i = 10; i > 0; i--) {
					System.out.println("TICK TICK "+i);
				try {
					TimeUnit.MILLISECONDS.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
		}).start();
		
		Thread t = new Thread(new Runnable() {
			
			public void run() {
				for(int i = 10; i > 0; i--) {
					System.out.println("TICK TICK "+i);
				try {
					TimeUnit.MILLISECONDS.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
		});
		t.start();
		System.out.println("main Thread ends here....");
		}

}
