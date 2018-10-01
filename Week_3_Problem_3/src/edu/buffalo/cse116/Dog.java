package edu.buffalo.cse116;

public class Dog implements Pet 
{

	@Override
	public String preferredFood() 
	{
		return "Kibble";
	}

	@Override
	public String howToCall(String name) 
	{
		return "Come here " + name;
	}

}
