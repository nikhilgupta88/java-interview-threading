package com.example.java_interview.thread.binding;

public class InnerClass
{
	public class superclass
	{
		void print()
		{
			System.out.println("print in superclass.");
		}
	}

	public  class subclass extends superclass
	{
		@Override
		void print()
		{
			System.out.println("print in subclass.");
		}
	}

	public static void main(String[] args)
	{
		InnerClass n = new InnerClass();
		superclass a = n.new superclass();
		superclass B = n.new subclass();
		a.print();
		B.print();
	}
}
