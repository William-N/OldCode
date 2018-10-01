package edu.buffalo.cse116;

public class Square 
{
	private double length;
	
	public Square(double length)
	{
		this.length = length;
	}
	
	public double getCircumference()
	{
		return this.length * 4;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
}
