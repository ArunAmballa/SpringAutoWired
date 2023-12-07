package com.arun.beans;

public class CourseSelection 
{
	private Course course;
	
	
	public CourseSelection()
	{
		System.out.println("CourseSelection Object is Created");
	}
	
	

	@Override
	public String toString() {
		return "CourseSelection [course=" + course + "]";
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public boolean selecting()
	{
		return course.purchase();
		
	}
	public CourseSelection(Course course)
	{
		this.course=course;
	}
	

}
