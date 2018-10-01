package edu.buffalo.cse116;

public class Fish implements Pet 
{

	private boolean wild;
	
	public Fish(boolean isWild)
	{
		this.wild = isWild;
	}
	
	@Override
	public String preferredFood() 
	{
		if(this.wild == true)
		{
			return "Worms";
		}
		
		return "Flakes";
	}

	@Override
	public String howToCall(String name) 
	{
		return null;
	}
	
	public boolean isWild()
	{
		return this.wild;
	}
	
	public void setWild(boolean setter)
	{
		this.wild = setter;
	}

}
