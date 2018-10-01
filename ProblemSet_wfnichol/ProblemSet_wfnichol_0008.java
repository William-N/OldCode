import java.util.HashMap;
import java.util.ArrayList;

public class ProblemSet_wfnichol_0008{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a new 
     * HashMap with keys of type String mapped to values of type Double containing the key-value 
     * pairs {"package":0.72, "threat":14.19, "recruit":10.51}
     */
    public static HashMap<String, Double> q1()
    {
    		HashMap<String, Double> hashBrown= new HashMap<String, Double>();
    		
    		hashBrown.put("package", 0.72);
    		hashBrown.put("threat", 14.19);
    		hashBrown.put("recruit", 10.51);
    		
    		return hashBrown;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values int the 
     * input ArrayList at indices 0, 17, 6, 10, and 14. You can assume the input ArrayList has 
     * size large enough to avoid an index out of bounds exception at these indices
     */
    public static int q2(ArrayList<Integer> praiseTheSun)
    {
    		int tourette=0;
    		
    		tourette=praiseTheSun.get(0);
    		tourette=tourette+praiseTheSun.get(17);
    		tourette=tourette+praiseTheSun.get(6);
    		tourette=tourette+praiseTheSun.get(10);
    		tourette=tourette+praiseTheSun.get(14);
    		
    		return tourette;
    }
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns an 
     * ArrayList of type String containing the values "few", "booth", "dose", "theory", and 
     * "warmth". The order of these values must be maintained
     */
    
    public static ArrayList<String> q3()
    {
    		ArrayList<String> praiseTheSun= new ArrayList<String>();
    		
    		praiseTheSun.add("few");
    		praiseTheSun.add("booth");
    		praiseTheSun.add("dose");
    		praiseTheSun.add("theory");
    		praiseTheSun.add("warmth");
    		
    		return praiseTheSun;
    }
    
    
    /**
     * q4: Write a public static method named q4 that takes a HashMap with Strings as keys and 
     * Strings as values as a parameter and returns a single String. The String returned will be 
     * the concatenation of the Strings "long", "favor", "roof", and "oxygen" followed by all of 
     * the values from the input HashMap. Each String concatenated into the return String must be 
     * separated by a single space
     */
    
    public static String q4(HashMap<String, String> HashBrown)
    {    		
    		String blah="long ";
    		blah=blah.concat("favor ");
    		blah=blah.concat("roof ");
    		blah=blah.concat("oxygen ");
    		
    		for (String key: HashBrown.keySet())
    		{
    			blah=blah.concat(HashBrown.get(key));    			
    		}
    		
    		return blah;
    }
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values int the 
     * input ArrayList at indices 1, 19, and 12. You can assume the input ArrayList has size 
     * large enough to avoid an index out of bounds exception at these indices
     */
    public static int q5(ArrayList<Integer> praiseTheSun)
    {	
		int tourette0=praiseTheSun.get(1);
		int tourette1=praiseTheSun.get(19);
		int tourette2=praiseTheSun.get(12);
		int tourette=tourette0+tourette1+tourette2;

		return tourette;
    }
    
    
    
    public static void main(String[] args){
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
