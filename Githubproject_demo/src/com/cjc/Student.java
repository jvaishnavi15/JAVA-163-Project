package com.cjc;

public class Student 
{

	public void m1()
	{
		System.out.println("method m1");
	}
	public void m2()
	{
		System.out.println("method m2");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome Student");
		Student s=new Student();
		s.m1();
		s.m2();
		
	}

}
