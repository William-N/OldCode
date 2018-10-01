package edu.buffalo.cse116;

public class Cube extends Square
{

	public Cube(double length) 
	{
		super(length);
	}
	
	@Override
	public double getCircumference()
	{
		return (this.getLength() * 4) * (3);
	}
	
	public double getVolume()
	{
		double length = this.getLength();
		return (length * length * length);
	}
	
}
