package rhymes.dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RhymingDictionary 
{
	
	private ArrayList<String> words;
	private HashMap<String, ArrayList<String>> wordToSound;
	
	public RhymingDictionary(String fileName)
	{
		
		this.words=new ArrayList<String>();
		this.wordToSound=new HashMap<String, ArrayList<String>>();
		
		try
		{
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				ArrayList<String> sounds=new ArrayList<String>();
				String[] lineValues=line.split("  ");
				String[] soundValues=lineValues[1].split(" ");
				
				this.words.add(lineValues[0]);
				
				for(int i=0; i<soundValues.length; i++)
				{
					
					sounds.add(soundValues[i]);
					
				}
				
				this.wordToSound.put(lineValues[0],sounds);
				
			}
			
		}
		catch(IOException ex)
		{
			
			ex.printStackTrace();
			
		}
		
	}
	
	
	public boolean isRhyme(String rhyme1, String rhyme2)
	{

		int index=0;
		ArrayList<String>sound1=new ArrayList<String>(wordToSound.get(rhyme1.toUpperCase()));
		ArrayList<String>sound2=new ArrayList<String>(wordToSound.get(rhyme2.toUpperCase()));
				
		Collections.reverse(sound1);
		Collections.reverse(sound2);
		
		if(sound1.size()<sound2.size())
		{
			
			index=sound1.size();
			
		}
		else if(sound2.size()<sound1.size())
		{
			
			index=sound2.size();
			
		}
		else {
			index=sound1.size();
		}
				
		for(int i=0; i<index; i++)
		{

			if(sound1.get(i).contains("A")||sound1.get(i).contains("E")||sound1.get(i).contains("I")||sound1.get(i).contains("O")||sound1.get(i).contains("U"))
			{
				String vowel1=sound1.get(i);
				String vowel2=sound2.get(i);
												
				if(vowel1.contains("0"))
					vowel1=vowel1.replace("0", "");
				if(vowel1.contains("1"))
					vowel1=vowel1.replace("1", "");
				if(vowel1.contains("2"))
					vowel1=vowel1.replace("2", "");
				if(vowel2.contains("0"))
					vowel2=vowel2.replace("0", "");
				if(vowel2.contains("1"))
					vowel2=vowel2.replace("1", "");
				if(vowel2.contains("2"))
					vowel2=vowel2.replace("2", "");
								
				if(vowel1.equals(vowel2)) {
					return true;
				}
				else { return false;}
			}
			
			else if(!(sound1.get(i).equals(sound2.get(i))))
			{
				
				return false;
				
			}
			
		}
		
		return false;
		
	}
	
	
	public String randomWord()
	{
		
		Collections.shuffle(this.words);
		return this.words.get(0);
		
	}
	
	
	public ArrayList<String> getChoices(String reference)
	{
		
		reference=reference.toUpperCase();
		ArrayList<String> rhymingList=new ArrayList<String>();
		ArrayList<String> otherList=new ArrayList<String>();
		ArrayList<String> returnList=new ArrayList<String>();
		
		for(int i=0; i<this.words.size(); i++)
		{
			//BUG: On second call of existing RhymingDictionary object, conditional statements execute despite incorrect truth value.
			
			String currentWord=this.words.get(i);
			boolean conditional=isRhyme(currentWord, reference);
			
			if(conditional)
				rhymingList.add(currentWord);
			else 
				otherList.add(currentWord);
			
		}
		
		Collections.shuffle(rhymingList);
		Collections.shuffle(otherList);
		
		int index=0;
		String otherWord1=otherList.get(0);
		String otherWord2=otherList.get(1);
		String otherWord3=otherList.get(2);
		String rhymingWord=rhymingList.get(index);
		
		if(rhymingWord.equals(reference))
			rhymingWord=rhymingList.get(index+1);
		
		if(!(isRhyme(reference,rhymingWord)))
			rhymingWord=rhymingList.get(index+2);
		
		returnList.add(rhymingWord);
		returnList.add(otherWord1);
		returnList.add(otherWord2);
		returnList.add(otherWord3);
		Collections.shuffle(returnList);
				
		return returnList;
		
	}
	
	
}
