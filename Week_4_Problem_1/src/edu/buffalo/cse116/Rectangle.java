package edu.buffalo.cse116;

public class Rectangle extends Square 
{
	private double height;
	
	public Rectangle(double length, double height) 
	{
		super(length);
		this.height = height;	
	}
	
	@Override
	public double getCircumference()
	{
		return (2 * this.height) + (2 * this.getLength());
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}

}
