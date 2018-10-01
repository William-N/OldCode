import java.util.HashMap;
import java.util.ArrayList;

public class ProblemSet_wfnichol_0010{
    
    
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 3 characters, return "short"
     * If the input String has 3 or more characters but less than 12, return "medium"
     * If the input String has greater than or equal to 12 characters, return "long"
     * If the input String contains any instances of the letter 'u', return "found u" regardless 
     * of the length of the input
     */
    
	public static String q1(String blah)
    {
    	
    		if (blah.indexOf("u")>=0)
    			{
    				return"found u";
    			}
    	
    		if (blah.length()==0)
    			{
    				return"empty";
    			}
    		if (blah.length()<3 && blah.length()!=0)
    			{
    				return"short";
    			}
    		if (blah.length()<12 && blah.length()>=3)
    			{
    				return"medium";
    			}
    		if (blah.length()>=12)
    			{
    				return"long";
    			}
    		return "error";
    }
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns void. The 
     * method should print all the integers from 0 to 97 to the screen. The output should be 
     * inclusive of these end points
     */
    
	public static void q2()
	{
		for(int i=0; i<98; i++)
			{
				System.out.println(i);
			}
	}
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a HashMap 
     * of Integers to Doubles. The returned HashMap should contain all the integers from 9 to 55 
     * as keys mapping to their cube root as values. The output should be inclusive of the end 
     * points
     */
	public static HashMap<Integer, Double> q3()
	{
		HashMap<Integer, Double> hashBrown= new HashMap<Integer, Double>();
		
		for(int i=9; i<56; i++)
			{
				double cubeRoot = Math.cbrt(i);
				
				hashBrown.put(i, cubeRoot);
			}
		return hashBrown;
	}
    
    
    
    /**
     * q4: Write a public static method named q4 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is less than 26 and the second parameter is equal to 5
     */
	public static boolean q4(int little, int uzi)
	{
		if(little<26&&uzi==5)
			return true;
		
		return false;
	}
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain all 
     * values from the input ArrayList except those that have a square root within 4.0 of 0.64 
     * (ie. the difference of the square root and 0.64 is less than 4.0)
     */
	public static ArrayList<Double> q5(ArrayList<Double> praiseTheSun)
	{
		int size=praiseTheSun.size();
		
		System.out.println(praiseTheSun);
		
		for(int i=0; i<size; i++)
			{
				if (Math.sqrt(i)-0.64<4)
				{
					praiseTheSun.remove(i);
					size--;
				}
			}
		return praiseTheSun;
	}
    
    
    
    public static void main(String[] args){
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
