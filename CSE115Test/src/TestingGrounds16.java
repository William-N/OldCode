import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TestingGrounds16 
{
    
    
    /**
     * q1: Write a public static method named q1 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain only 
     * the values from the input ArrayList that have a natural logarithm within 2.0 of 1.99 (ie. 
     * the difference of the natural logarithm and 1.99 is less than 2.0)
     */
    public static ArrayList<Double> q1(ArrayList<Double> praiseTheSun)
    {
    		ArrayList<Double> praiseTheReturn= new ArrayList<Double>();
    		
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			if(Math.log(praiseTheSun.get(i))-1.99<2.0)
    				praiseTheReturn.add(praiseTheSun.get(i));
    		}
    		
    		return praiseTheReturn;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a HashMap of type String to Character 
     * and returns a String. This method returns the *key mapping to* the maximum ascii among the 
     * values of the input
     */
    public static String q2(HashMap<String, Character> hashBrown)
    {
    		String returnString="";
    		
    		ArrayList<String> praiseTheSun= new ArrayList<String>();
    		
    		for(String key: hashBrown.keySet())
    		{
    			String tempString=""+hashBrown.get(key);
    			
    			praiseTheSun.add(tempString);
    		}
    		Collections.sort(praiseTheSun);
    		returnString=praiseTheSun.get(0);
    		
    		return returnString;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes a HashMap of type String to String 
     * and returns a String. This method returns the String that comes first alphabetically, 
     * ignoring case, from the values of the input
     */
    public static String q3(HashMap<String, String> hashBrown)
    {	
    		ArrayList<String> praiseTheSun= new ArrayList<String>();
    		
    		for(String key: hashBrown.keySet())
    		{
    			praiseTheSun.add(hashBrown.get(key).toLowerCase());
    		}
    		
    		Collections.sort(praiseTheSun);
    		
    		return praiseTheSun.get(0);
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a HashMap of type String to String 
     * and returns an int. This method returns the *number of times* a most significant value 
     * appears in the data where significant is defined as the  longest String among the values 
     * of the input
     */
    public static int q4(HashMap<String, String> hashBrown)
    {
    		int longestString=0;
    		int returnSig=0;
    		
    		for(String key: hashBrown.keySet())
    		{
    			if(hashBrown.get(key).length()>longestString)
    			{
    				longestString=hashBrown.get(key).length();
    				returnSig=0;
    			}
    			if(hashBrown.get(key).length()==longestString)
    				returnSig=returnSig+1;
    				
    		}
    		
    		return returnSig;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Integers as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the cube root of each element and compute the sum of all of these values. Your 
     * method will then return the cube root of this sum
     */
    public static double q5(ArrayList<Integer> praiseTheSun)
    {
    		double returnValue=0;
    		
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			returnValue=returnValue+Math.cbrt(praiseTheSun.get(i));
    		}
    		
    		return returnValue;
    }
    
    
    
    public static void main(String[] args)
    {
                
    }
}
