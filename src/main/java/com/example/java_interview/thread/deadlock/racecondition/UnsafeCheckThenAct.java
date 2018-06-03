package com.example.java_interview.thread.deadlock.racecondition;

public class UnsafeCheckThenAct {
    private int number;
    
    public void changeNumber() {
        if (number == 0) {
            System.out.println(Thread.currentThread().getName() + " | Changed");
            number = -1;
        }
        else {
            System.out.println(Thread.currentThread().getName() + " | Not changed");
        }
    }
    
    public static void main(String[] args) {
        final UnsafeCheckThenAct checkAct = new UnsafeCheckThenAct();
        
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                public void run() {
                    checkAct.changeNumber();
                }
            }, "T" + i).start();
        }
    }
}