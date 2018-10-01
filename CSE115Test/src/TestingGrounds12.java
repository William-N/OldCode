import java.util.ArrayList;
import java.util.HashMap;

public class TestingGrounds12 
{
	/**
     * q1: Write a public static method named q1 that takes no parameters and returns a HashMap 
     * of Integers to Doubles. The returned HashMap should contain all the integers from 10 to 30 
     * as keys mapping to their square as values. The output should be inclusive of the end 
     * points
     */
    public static HashMap<Integer, Double> q1()
    {
    		HashMap<Integer, Double> hashBrown= new HashMap<Integer, Double>();
    		
    		for(int i=10; i<31; i++)
    		{
    			hashBrown.put(i, Math.sqrt(i));
    		}
    		
    		return hashBrown;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain only 
     * the values from the input ArrayList that have a square within 59.0 of 218.28 (ie. the 
     * difference of the square and 218.28 is less than 59.0)
     */
    public static ArrayList<Double> q2(ArrayList<Double> praiseTheSun)
    {
    		int size=praiseTheSun.size();
    		
    		for(int i=0; i<size; i++)
    		{
    			double sexyTime=praiseTheSun.get(i);
    			
    			if(Math.sqrt(sexyTime)-218.28<59)
    			{
    				
    			}
    			else
    			{
    				praiseTheSun.remove(i);
    			}
    		}
    		
    		return praiseTheSun;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an ArrayList of Strings as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the length of each element and compute the average of all of these values. Your 
     * method will then return the square of this average
     */
    public static double q3(ArrayList<String> praiseTheSun)
    {
    		int size=praiseTheSun.size();
    		double totalValue=0;
    		double average=0;
    		double theReturnValue=0;
    		
    		for(int i=0; i<size; i++)
    		{
    			totalValue=totalValue+praiseTheSun.get(i).length();
    		}
    		
    		average=totalValue/size;
    		theReturnValue=Math.sqrt(average);
    		
    		return theReturnValue;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes an ArrayList of Doubles as a 
     * parameter and returns an ArrayList of Doubles. The returned ArrayList will contain only 
     * the values from the input ArrayList that have a cube within 9505.0 of 386308.69 (ie. the 
     * difference of the cube and 386308.69 is less than 9505.0)
     */
    public static ArrayList<Double> q4(ArrayList<Double> praiseTheSun)
    {
		int size=praiseTheSun.size();
		
		for(int i=0; i<size; i++)
			{
			double value=praiseTheSun.get(i);
			
				if (Math.cbrt(value)-386308.69<9505.0)
				{
					praiseTheSun.remove(i);
					size--;
				}
			}
		return praiseTheSun;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns an 
     * ArrayList of type Double containing the values 10.7, 0.1, and 8.77. The order of these 
     * values must be maintained
     */
	public static ArrayList<Double> q5()
	{
		ArrayList<Double> praiseTheSun= new ArrayList<Double>();
		
		praiseTheSun.add(10.7);
		praiseTheSun.add(0.1);
		praiseTheSun.add(8.77);
		
		return praiseTheSun;
	}
	
	public static void main(String[] args)
	{
		System.out.println(q1());
	}
}
