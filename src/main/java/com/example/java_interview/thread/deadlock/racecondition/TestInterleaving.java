package com.example.java_interview.thread.deadlock.racecondition;

public class TestInterleaving {
    
    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i);
        }
    }
    
    public static void main(String[] args) {
        final TestInterleaving main = new TestInterleaving();
        
        Runnable runner = new Runnable() {
            public void run() {
                main.show();
            }
        };
        
        new Thread(runner, "Thread 1").start();
        new Thread(runner, "Thread 2").start();
    }
}