package edu.buffalo.cse116;

public class Goat implements Pet 
{

	@Override
	public String preferredFood() 
	{
		return "EVERYTHING";
	}

	@Override
	public String howToCall(String name) 
	{
		return name + " to me";
	}

}
