package edu.buffalo.cse116;

public class Cat implements Pet 
{

	@Override
	public String preferredFood() 
	{
		return "Meat";
	}

	@Override
	public String howToCall(String name) 
	{
		return "Open a can";
	}

}
