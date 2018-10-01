package rhymes;

import java.util.ArrayList;

import rhymes.dictionary.RhymingDictionary;

public class GameModel 
{
	
	private RhymingDictionary dictionary;
	private int score;
	private String reference;
	private ArrayList<String> choices;
	
	public GameModel(String fileName)
	{
		
		this.dictionary=new RhymingDictionary(fileName);
		this.score=0;
		this.reference=this.dictionary.randomWord();
		this.choices=this.dictionary.getChoices(this.reference);
		
	}
	
	public void makeChoice(String guess)
	{
		
		if(this.dictionary.isRhyme(guess, this.reference))
		{
						
			this.score=this.score+1;

		}
		else
		{
			
			this.score=this.score-1;
			
		}
		
		this.reference=this.dictionary.randomWord();
		this.choices=this.dictionary.getChoices(this.reference);
		
	}
	
	public int getScore()
	{
		
		return this.score;
		
	}
	
	public String getGivenWord()
	{
		
		return this.reference;
		
	}
	
	public ArrayList<String> getChoices()
	{
		
		return this.choices;
		
	}

	
}
