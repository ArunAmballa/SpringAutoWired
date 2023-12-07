package com.arun.beans;

public class JavaCourse implements Course
{
	
	public JavaCourse()
	{
		System.out.println("JavaCourse Object is Created");
	}

	@Override
	public boolean purchase() 
	{
		
		System.out.println("Java Course is Purchased");
		return true;
		
	}

}
