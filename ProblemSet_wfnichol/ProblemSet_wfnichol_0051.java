import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_wfnichol_0051
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and has return type 
     * void. In this method, you may assume there is a file named "properties.csv" with lines in 
     * the format "name,consecutive,sophisticated,bay,understanding" where "name" is a String and 
     * all other values are well-formed integers. There is no header line in this file. This 
     * method will create a new file named "output.csv" in the format "name,understanding" 
     * containing only these two columns from "properties.csv" and only for lines with a name of 
     * "execution", "reply", or "mentor"
     */
    public static void q1()
    {
    		
    		String fileName="src/properties.csv";
    		String newFileName="src/output.csv";
    		String toWrite="";
    		
    		try
    		{
    			
        		for(String line: Files.readAllLines(Paths.get(fileName)))
        		{
        			
        			String[] currentValues=line.split(";");
        			
        			if(currentValues[0].equals("execution")||currentValues[0].equals("reply")||currentValues[0].equals("mentor"))
        			{
        				
            			toWrite=toWrite+currentValues[0]+","+currentValues[4]+"\n";        				
        				
        			}
        			
        		}    			
    			
    		}
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    		try
    		{
    			
    			Files.write(Paths.get(newFileName), toWrite.getBytes());
    			
    		}
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of type Character and 
     * returns an int. This method returns the *number of times* a most significant value appears 
     * in the data where significant is defined as the char that comes first alphabetically, 
     * ignoring case, from the values of the input (hint: The Character class has static methods 
     * that convert chars to upper or lower case. In java, chars are represented as ints so you 
     * can use < and > to compare them)
     */
    public static int q2(ArrayList<Character> array)
    {
    		
    		int counter=0;
    		char firstISH='z';
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			if(Character.toLowerCase(array.get(i))<firstISH)
    			{
    				
    				firstISH=array.get(i);
    				counter=1;
    				
    			}
    			
    			if(Character.toLowerCase(array.get(i))==firstISH)
    			{
    				
    				counter++;
    				
    			}
    			
    		}
    		
    		return counter;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a HashMap 
     * of Integers to Doubles. The returned HashMap should contain all the integers from 5 to 16 
     * as keys mapping to their cube root as values. The output should be inclusive of the end 
     * points
     */
    public static HashMap<Integer, Double> q3()
    {
    		
    		HashMap<Integer, Double> returnList=new HashMap<Integer, Double>();
    		
    		for(int i=5; i<17; i++)
    		{
    			
    			returnList.put(i, Math.cbrt(i));
    			
    		}
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a HashMap of type String to Integer 
     * and returns a double. This method returns the maximum result (do not return the original 
     * value) of taking the cosine of each value from the input while considering only positive 
     * numbers from the inputs
     */
    public static double q4(HashMap<String, Integer> map)
    {
    		
    		double max=0;
    		
    		for(String key: map.keySet())
    		{
    			
    			if(map.get(key)>-1)
    			{
    				
        			double currentValue=Math.abs(Math.cos(map.get(key)));
        			
        			if(currentValue>max)
        			{
        				
        				max=currentValue;
        				
        			}    				
    				
    			}

    			
    		}
    		
    		return max;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of type Character and 
     * returns an int. This method returns the *index of* the char that comes last 
     * alphabetically/lexicographically (case sensitive ordering) from the values of the input 
     * (hint: In java, chars are represented as ints that preserve this ordering. You can use < 
     * and >)
     */
    public static int q5(ArrayList<Character> array)
    {
    		
    		int index=0;
    		char lastChar='a';
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			if(array.get(i)>lastChar)
    			{
    				
    				lastChar=array.get(i);
    				index=i;
    				
    			}
    			
    		}
    		
    		return index;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Test your code here to verify it is correct before submitting */
    		
    		
    }
}
