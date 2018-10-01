import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_wfnichol_0052
{
    
    
    /**
     * q1: Write a public static method named q1 that takes a HashMap of type String to Integer 
     * and returns an int. This method returns the *number of times* a most significant value 
     * appears in the data where significant is defined as the minimum result of taking the 
     * cosine of each value from the input while considering only positive numbers
     * 
     * Note that two values can both be the most significant even if they are not equal. You are 
     * returning the number of values that are tied as the most significant
     */
    public static int q1(HashMap<String, Integer> map)
    {
    		
    		int counter=0;
    		double min=Double.MAX_VALUE;
    	
    		for(String key: map.keySet())
    		{
    			
    			int currentValue=map.get(key);
    			
    			if(currentValue>-1)
    			{
    				
    				break;
    				
    			}
    			
    			else 
    			{
    				
    				if(Math.cos(currentValue)<min)
    				{
    					
    					min=currentValue;
    					counter=1;
    					
    				}
    				
    				if(Math.cos(currentValue)==min)
    				{
    					
    					counter++;
    					
    				}
    				
    			}
    			
    		}
    		
    		return counter;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain all 
     * values from the input ArrayList except those that have a square root within 2.0 of 0.33 
     * (ie. the target value of the square root is 0.33 and the allowed variance from this target 
     * is 2.0)
     */
    public static ArrayList<Double> q2(ArrayList<Double> array)
    {
    		
    		ArrayList<Double> returnList=new ArrayList<Double>();
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			double sqrtValue=Math.sqrt(array.get(i));
    			
    			if(sqrtValue<=2.0 && sqrtValue>=0.33)
    			{
    				
    				break;
    				
    			}
    			else
    			{
    				
    				returnList.add(array.get(i));
    				
    			}
    			
    		}
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and has return type 
     * void. In this method, you may assume there is a file named "properties.csv" with lines in 
     * the format "name,rear,two,presidential,holy,bush,technical" where "name" is a String and 
     * all other values are well-formed integers. There is no header line in this file. This 
     * method will create a new file named "output.csv" in the format "name,rear" containing only 
     * these two columns from "properties.csv" and only for lines with a name of "player", 
     * "east", "holy", or "aesthetic"
     */
    public static void q3()
    {
    		
    	String fileName="properties.csv";
		String newFileName="output.csv";
		String toWrite="";
		
		try
		{
			
    		for(String line: Files.readAllLines(Paths.get(fileName)))
    		{
    			
    			String[] currentValues=line.split(",");
    			String testIt=currentValues[0];
    			
    			if(testIt.equals("player")||testIt.equals("east")||testIt.equals("holy")||testIt.equals("aesthetic"))
    			{
    				
        			toWrite=toWrite+currentValues[0]+","+currentValues[1]+"\n";
    				
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
     * q4: Write a public static method named q4 that takes a HashMap of type String to Integer 
     * and returns a double. This method returns the maximum result (do not return the original 
     * value) of taking the cosine of each value from the input while considering only negative 
     * numbers from the inputs
     */
    public static double q4(HashMap<String, Integer> map)
    {
    		
    		double returnValue=Double.MIN_VALUE;
    		
    		for(String key: map.keySet())
    		{
    			
    			if(map.get(key)<0)
    			{
    				
    				int currentValue=map.get(key);
    				
    				if(Math.cos(currentValue)>returnValue)
    				{
    					
    					returnValue=currentValue;
    					
    				}
    				
    			}
    			
    			
    			
    		}
    		
    		return returnValue;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of type String and 
     * returns an int. This method returns the *index of* the String that comes first 
     * alphabetically, ignoring case, from the values of the input (hint: The String class has a 
     * method for comparing in this way)
     */
    public static int q5(ArrayList<String> array)
    {
    		
    		String first="z";
    		int index=0;
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			if(first.compareToIgnoreCase(array.get(i))>0)
    			{
    				
    				first=array.get(i);
    				index=i;
    				
    			}
    			
    		}
    		
    		return index;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Test your code here to verify it is correct before submitting */
    	
    		ArrayList<String> array=new ArrayList<String>();
    		array.add("blah");
    		array.add("booze");
    		array.add("zap");
    		array.add("map");
    		array.add("aaah");
    		
//    		q3();
//    		System.out.println(q5(array));
    	
    }
}
