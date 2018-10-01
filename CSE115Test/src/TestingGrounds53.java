import java.util.ArrayList;
import java.util.HashMap;

public class TestingGrounds53 
{
    
    
    /**
     * q1: Write a public static method named q1 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain only 
     * the values from the input ArrayList that have a natural logarithm within 3.0 of 4.44 (ie. 
     * the target value of the natural logarithm is 4.44 and the allowed variance from this 
     * target is 3.0)
     */
    public static ArrayList<Double> q1(ArrayList<Double> array)
    {
    		
    		ArrayList<Double> returnList=new ArrayList<Double>();
    	
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			if(Math.log(array.get(i))>=3.0 && Math.log(array.get(i))<=4.44)
    			{
    				
    				returnList.add(array.get(i));
    				
    			}
    			
    		}
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of type String and 
     * returns a String. This method returns the String that comes last 
     * alphabetically/lexicographically (case sensitive ordering) from the values of the input 
     * (hint: Use the compareTo method in the String class)
     */
    public static String q2(ArrayList<String> array)
    {
    		
    		String returnString=array.get(0);
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			if(returnString.compareTo(array.get(i))<0)
    			{
    				
    				returnString=array.get(i);
    				
    			}
    			
    		}
    		
    		System.out.println(returnString);
    		return returnString;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes a HashMap with Strings as keys and 
     * Strings as values as a parameter and returns a single String. The String returned will be 
     * the concatenation of the Strings "bush", "cheap", "close", "symbolic", and "loop" followed 
     * by all of the keys from the input HashMap. Each String concatenated into the return String 
     * must be separated by a single space
     */
    public static String q3(HashMap<String,String> map)
    {
    		
    		String returnString="bush "+"cheap "+"close "+"symbolic "+"loop";
    		
    		for(String key: map.keySet())
    		{
    			
    			returnString=returnString+" "+key;
    			
    		}
    		
    		return returnString;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a new 
     * HashMap with keys of type String mapped to values of type Double containing the key-value 
     * pairs {"pepper":-0.58, "training":6.44, "delight":-9.48, "meantime":-9.15}
     */
    public static HashMap<String, Double> q4()
    {
    		
    		HashMap<String, Double> returnList=new HashMap<String, Double>();
    		
    		returnList.put("pepper", -0.58);
    		returnList.put("training", 6.44);
    		returnList.put("delight", -9.48);
    		returnList.put("meantime", -9.15);
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values in the 
     * input ArrayList at indices 16, 7, and 10. You can assume the input ArrayList has size 
     * large enough to avoid an index out of bounds exception at these indices
     */
    public static int q5(ArrayList<Integer> array)
    {
    		
    		int returnValue=0;
    		
    		returnValue=returnValue+array.get(16);
    		returnValue=returnValue+array.get(7);
    		returnValue=returnValue+array.get(10);
    		
    		return returnValue;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Test your code here to verify it is correct before submitting */
    		ArrayList<String> array=new ArrayList<String>();
    		array.add("zzzzz");
    		array.add("aaaaaaz");
    		array.add("zzz");
    		
		q2(array);
    	
    }
}
