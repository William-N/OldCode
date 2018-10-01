package edu.buffalo.cse116;

/**
 * Instances of this class represents a single Student registration for a course. Since the course's properties are defined as static
 * fields of this class, it is usable by a program which only uses the registrations for a single course.
 *
 * @author Matthew Hertz
 */
public class Student 
{
	private String name;
	private int number;
	private static CourseInfo courseData;
	private static int totalStudents;
	
  /**
   * Add a new Student to the course. The Student instance should use {@code stuName} as their name and
   * set {@code number} so that it is one after the last total number of registrations. For simplicity, the constructor assumes
   * students cannot drop this course.
   * 
   * @param stuName String storing the name to be used by this Chapter.
   */
	
	public Student(String stuName) 
	{
		totalStudents ++;
		this.name = stuName;
		this.number = totalStudents;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public static String getCourse()
	{
		return courseData.getName() + " - " + courseData.getSection() + " section";
	}
	
	public static void setCourseData(String courseName, int courseNumber)
	{
		CourseInfo newCourseData = new CourseInfo(courseName, courseNumber);
		courseData = newCourseData;
	}
  
}
