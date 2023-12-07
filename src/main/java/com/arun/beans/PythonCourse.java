package com.arun.beans;

public class PythonCourse implements Course
{
	
	public PythonCourse()
	{
		System.out.println("PythonCourse Object is Created");
	}
	@Override
	public boolean purchase() 
	{
		
		System.out.println("Python Course is Purchased");
		return true;
		
	}

}
