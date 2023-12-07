package com.arun.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.beans.CourseSelection;

public class LaunchMain {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CourseSelection cs=context.getBean("select",CourseSelection.class);
		boolean status=cs.selecting();
		
		System.out.println(cs);
		

	}

}
