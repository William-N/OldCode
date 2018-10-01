package submission;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class GameLogic 
{
	
	private ArrayList<String> dictionary;
	private String givenWord;
	private int score;
	private ArrayList<String> wordsGuessed;
	
	
	
	public GameLogic(String dictionaryFileName)
	{
		parseDictionary(dictionaryFileName);
		restartGame();
	}
	
	
	
	private void parseDictionary(String dictionaryFileName)
	{
		this.dictionary=new ArrayList<>();
		try
		{
			for(String line: Files.readAllLines(Paths.get(dictionaryFileName)))
			{
				this.dictionary.add(line);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public void restartGame()
	{
		
		this.score=0;
		this.wordsGuessed=new ArrayList<>();
		Collections.shuffle(this.dictionary);
		this.givenWord=this.dictionary.get(0);
	}
	
	
	
	public void makeGuess(String playerInput)
	{
			
		for(int i=0; i<playerInput.length(); i++)
		{
			char c=playerInput.charAt(i);
			String s=""+c;
			
			if(!givenWord.contains(s))
			{
				return;
			}
		}	
				if(!wordsGuessed.contains(playerInput))
				{
					if(dictionary.contains(playerInput))
					{
						score++;
						wordsGuessed.add(playerInput);

					}
										
				}	
				
	}
		
	
	
	
	public int getScore()
	{
		return this.score;
	}
	
	
	
	public String getGivenWord()
	{
		return this.givenWord;
	}
	
	
	
}