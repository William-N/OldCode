import java.util.ArrayList;

public class ProblemSet_wfnichol_0011
{	
	/**
     * q1: Write a public static method named q1 that takes no parameters and returns void. The 
     * method should print all the integers from 0 to 153 to the screen. The output should be 
     * inclusive of these end points
     */
	public static void q1()
	{
		for(int i=0; i<154; i++)
			{
				System.out.println(i);
			}
	}
	
	
	/**
     * q2: Write a public static method named q2 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain all 
     * values from the input ArrayList except those that have a cube root within 2.0 of 4.64 (ie. 
     * the difference of the cube root and 4.64 is less than 2.0)
     */
	public static ArrayList<Double> q2(ArrayList<Double> praiseTheSun)
	{
		int size=praiseTheSun.size();
		
		for(int i=0; i<size; i++)
			{
				if (Math.cbrt(i)-4.64<2.0)
				{
					praiseTheSun.remove(i);
					size--;
				}
			}
		return praiseTheSun;
	}
	
	
	/**
     * q3: Write a public static method named q3 that takes an ArrayList of Integers as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the square of each element and compute the average of all of these values. Your 
     * method will then return the cube root of this average
     */
	public static double q3(ArrayList<Integer> praiseTheSun)
	{
		int size=praiseTheSun.size();
		double totalOfValues=0;
		
		for(int i=0; i<size; i++)
			{
				totalOfValues=totalOfValues+praiseTheSun.get(i);
			}
		
		double average =totalOfValues/size;
		
		return average;
	}
	
	
	/**
     * q4: Write a public static method named q4 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is less than 19 and the second parameter is less than or equal to 4
     */
	public static boolean q4(int little, int uzi)
	{
		if(little<19 && uzi<=4)
			return true;
		return false;
	}
	
	
	/**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 3 characters, return "short"
     * If the input String has 3 or more characters but less than 7, return "medium"
     * If the input String has greater than or equal to 7 characters, return "long"
     * If the input String contains any instances of the letter 'v', return "found v" regardless 
     * of the length of the input
     */
	public static String q5(String blah)
    {
    		if (blah.indexOf("v")>=0)
    			{
    				return"found v";
    			}
    	
    		if (blah.length()==0)
    			{
    				return"empty";
    			}
    		if (blah.length()<3 && blah.length()!=0)
    			{
    				return"short";
    			}
    		if (blah.length()<7 && blah.length()>=3)
    			{
    				return"medium";
    			}
    		if (blah.length()>=7)
    			{
    				return"long";
    			}
    		return "error";
    }
	
    public static void main(String[] args)
    {
                
    }
}
