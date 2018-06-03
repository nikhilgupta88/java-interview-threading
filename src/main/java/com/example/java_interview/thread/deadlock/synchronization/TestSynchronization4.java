
package com.example.java_interview.thread.deadlock.synchronization;
	  
public class TestSynchronization4{  
	public static void main(String t[]){  
		MyThreadd1 t1=new MyThreadd1();  
		MyThreadd2 t2=new MyThreadd2();  
		MyThreadd3 t3=new MyThreadd3();  
		MyThreadd4 t4=new MyThreadd4();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
	}  
}  
class Table{  
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	class MyThreadd1 extends Thread{  
	public void run(){  
	Table.printTable(1);  
	}  
	}  
	  
	class MyThreadd2 extends Thread{  
	public void run(){  
	Table.printTable(10);  
	}  
	}  
	  
	class MyThreadd3 extends Thread{  
	public void run(){  
	Table.printTable(100);  
	}  
	}  
	  
	  
	  
	  
	class MyThreadd4 extends Thread{  
	public void run(){  
	Table.printTable(1000);  
	}  
	}  
