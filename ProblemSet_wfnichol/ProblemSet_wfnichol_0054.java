import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_wfnichol_0054
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a new 
     * HashMap with keys of type String mapped to values of type Integer containing the key-value 
     * pairs {"nest":20, "offer":48, "ski":48, "retirement":-14}
     */
    public static HashMap<String,Integer> q1()
    {
    		
    		HashMap<String, Integer> map=new HashMap<String, Integer>();
    		
    		map.put("nest", 20);
    		map.put("offer", 48);
    		map.put("ski", 48);
    		map.put("retirement", -14);
    		
    		return map;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a HashMap with Strings as keys and 
     * Strings as values as a parameter and returns a single String. The String returned will be 
     * the concatenation of the Strings "residence", "economically", "just", and "residential" 
     * followed by all of the values from the input HashMap. Each String concatenated into the 
     * return String must be separated by a single space
     */
    public static String q2(HashMap<String,String> map)
    {
    		String returnString="residence "+"economically "+"just "+"residential";
    		
    		for(String key: map.keySet())
    		{
    			
    			returnString=returnString+" "+map.get(key);
    			
    		}
    		
    		return returnString;
    		
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values in the 
     * input ArrayList at indices 17, 13, and 15. You can assume the input ArrayList has size 
     * large enough to avoid an index out of bounds exception at these indices
     */
    public static int q3(ArrayList<Integer> array)
    {
    		
    		int returnIt=0;
    		
    		returnIt=returnIt+array.get(17);
    		returnIt=returnIt+array.get(13);
    		returnIt=returnIt+array.get(15);
    		
    		return returnIt;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes an ArrayList of type String and 
     * returns an int. This method returns the length of the longest String among the values of 
     * the input
     */
    public static int q4(ArrayList<String> array)
    {
    		
    		int length=0;
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			if(length<array.get(i).length())
    			{
    				
    				length=array.get(i).length();
    				
    			}
    			
    		}
    		
    		return length;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain only 
     * the values from the input ArrayList that have a cube root within 2.0 of 4.92 (ie. the 
     * target value of the cube root is 4.92 and the allowed variance from this target is 2.0)
     */
    public static ArrayList<Double> q5(ArrayList<Double> array)
    {
    		
    		ArrayList<Double> returnList=new ArrayList<Double>();
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			double currentRoot=Math.cbrt(array.get(i));
    			
    			if(currentRoot>=2.92 && currentRoot<=6.92)
    			{
    				
    				returnList.add(array.get(i));
    				
    			}
    			
    		}
    		
    		System.out.println(returnList);
    		return returnList;
    		
    }
    
    
    public static void main(String[] args)
    {
        
        /* Test your code here to verify it is correct before submitting */
    		ArrayList<Double> test=new ArrayList<Double>();
    		test.add(8.0);
    		test.add(3.0);
    		test.add(3.3);
    		test.add(9.0);
    		test.add(125.0);
    		    		
    		q5(test);
    		
        
    }
}
