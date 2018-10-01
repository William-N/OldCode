import java.util.HashMap;
import java.util.ArrayList;

public class TestingGrounds17 
{
    
    
    /**
     * q1: Write a public static method named q1 that takes a HashMap of type String to Double 
     * and returns a double. This method returns the maximum result (do not return the original 
     * value) of taking the tangent of each value from the input while considering only positive 
     * numbers from the inputs
     */
    public static double q1(HashMap<String, Double> gook)
    {
    		double returnTangent=Double.MIN_VALUE;
    		
    		for(String key: gook.keySet())
    		{
    			if(gook.get(key)>0)
    			{
    				double tangent=Math.tan(gook.get(key));
    				
    				if(tangent>returnTangent)
    					returnTangent=tangent;
    			}
    		}
    		
    		return returnTangent;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of type Integer and 
     * returns an int. This method returns the *index of* the maximum result of taking the cosine 
     * of each value from the input
     */
    public static int q2(ArrayList<Integer> array)
    {
    		double maxCos=Math.cos(array.get(0));
    		int returnIndex=0;
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			if(Math.cos(array.get(i))>maxCos)
    			{
    				maxCos=Math.cos(array.get(i));
    				returnIndex=i;
    			}
    		}
    		
    		return returnIndex;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an ArrayList of Doubles as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the square root of each element and compute the average of all of these values. 
     * Your method will then return the square of this average
     */
    public static double q3(ArrayList<Double> vaginalJuices)
    {
    		double returnSqrt=0;
    		
    		for(int i=0; i<vaginalJuices.size(); i++)
    		{
    			returnSqrt=returnSqrt+Math.sqrt(vaginalJuices.get(i));
    		}
    		
    		return Math.pow(returnSqrt/vaginalJuices.size(), 2);
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes an ArrayList of Doubles as a 
     * parameters and returns a double. This method returns the value from the input ArrayList 
     * that is closest to -5.12
     */
    public static double q4(ArrayList<Double> blahBratBrat)
    {
    		double beFound=-5.12;
    		double found=0;
    		double returnDistance=Double.MAX_VALUE;
    	
    		for(int i=0; i<blahBratBrat.size(); i++)
    		{
    			double testV=blahBratBrat.get(i);
    			double difference=beFound-testV;
    			double distance=Math.abs(difference);
    			
    			if(distance<returnDistance)
    			{
    				returnDistance=distance;
    				found=blahBratBrat.get(i);
    			}
    		}
    		
    		return found;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Doubles as a 
     * parameter and returns an int. This method returns the index of the first value in the 
     * input that is in the range (6.42, 21.369999999999997) and returns -1 if the input contains 
     * no values in this range
     */
    public static int q5(ArrayList<Double> viagara)
    {
    		for(int i=0; i<viagara.size(); i++)
    		{
    			if(viagara.get(i)>=6.42 && viagara.get(i)<=21.369999999999997)
    			{
    				return i;
    			}
    		}
    		return -1;
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
