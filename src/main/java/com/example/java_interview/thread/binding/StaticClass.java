package com.example.java_interview.thread.binding;


public class StaticClass {
	public static class superclass
	{
		void print()
		{
			System.out.println("print in superclass.");
		}
	}

	public static class subclass extends superclass
	{
		@Override
		void print()
		{
			System.out.println("print in subclass.");
		}
	}

	public static void main(String[] args)
	{
		
		superclass a = new superclass();
		superclass B = new subclass();
		a.print();
		B.print();
	}
}
