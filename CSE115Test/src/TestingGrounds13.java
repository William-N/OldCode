import java.util.ArrayList;
import java.util.HashMap;

public class TestingGrounds13 
{
    
    
    /**
     * q1: Write a public static method named q1 that takes an ArrayList of Doubles as a 			//////
     * parameters and returns a double. This method returns the value from the input ArrayList 	//////
     * that is closest to 24.64																	//////
     */
    public static double q1(ArrayList<Double> praiseTheSun)
    {
		double returnValue=Math.abs(praiseTheSun.get(0)-26.64);
		double difference=0;
		int returnIndex=0;
		
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{    			
    			difference=Math.abs(praiseTheSun.get(i)-24.64);
    			
    			if(returnValue>=difference)
    			{
    				returnValue=difference;
    				returnIndex=i;
    			}
    				
    		}
    		return praiseTheSun.get(returnIndex);
    }
    
    
    	
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Doubles as a 		/////
     * parameter and returns an int. This method returns the index of the first value in the 	/////
     * input that is in the range (-9.62, -5.569999999999999) and returns -1 if the input 	/////
     * contains no values in this range
     */
    public static int q2(ArrayList<Double> praiseTheSun)
    {
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			if(praiseTheSun.get(i)>=-9.62 && praiseTheSun.get(i)<=-5.569999999999999)
    			{
    				return i;
    			}
    		}
    		
    		return -1;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes a HashMap of type String to Character 
     * and returns a char. This method returns the char that comes last alphabetically, ignoring 	
     * case, from the values of the input														
     */
    public static char q3(HashMap<String, Character> hashBrown)
    {    
    		int index=0;
    		int returnIndex=0;
    	
    		ArrayList<Character> praiseTheSun= new ArrayList<Character>();
    		praiseTheSun.add('a');
    		praiseTheSun.add('b');
    		praiseTheSun.add('c');
    		praiseTheSun.add('d');
    		praiseTheSun.add('e');
    		praiseTheSun.add('f');
    		praiseTheSun.add('g');
    		praiseTheSun.add('h');
    		praiseTheSun.add('i');
    		praiseTheSun.add('j');
    		praiseTheSun.add('k');
    		praiseTheSun.add('l');
    		praiseTheSun.add('m');
    		praiseTheSun.add('n');
    		praiseTheSun.add('o');
    		praiseTheSun.add('p');
    		praiseTheSun.add('q');
    		praiseTheSun.add('r');
    		praiseTheSun.add('s');
    		praiseTheSun.add('t');
    		praiseTheSun.add('u');
    		praiseTheSun.add('v');
    		praiseTheSun.add('w');
    		praiseTheSun.add('x');
    		praiseTheSun.add('y');
    		praiseTheSun.add('z');
    	
    		for(String key: hashBrown.keySet())
    		{
    			char currentChar=hashBrown.get(key);
    			
    			if(praiseTheSun.contains(currentChar))
    			{
    				index=praiseTheSun.indexOf(currentChar);
    				
    				if(index>returnIndex)
    					returnIndex=index;
    			}
    		}
    		char returnChar=praiseTheSun.get(returnIndex);
    		
    		return returnChar;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes an ArrayList of Doubles as a 			/////
     * parameter and returns an int. This method returns the index of the first value in the 		/////
     * input that is in the range (0.73, 18.16) and returns -1 if the input contains no values in 	/////
     * this range
     */
    public static int q4(ArrayList<Double> praiseTheSun)
    {
    		for(int itteration=0; itteration<praiseTheSun.size(); itteration++)
    		{
    			if(praiseTheSun.get(itteration)>=0.73 && praiseTheSun.get(itteration)<=18.16)
    				return itteration;
    		}
    		
    		return -1;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of type Integer and 		
     * returns an int. This method returns the maximum result (do not return the original value) 	
     * of taking the absolute value of each value from the input									
     */
    
    
    
    public static int q5(ArrayList<Integer> praiseTheSun)
    {
    	int result=0;
    	
    		for(int itteration: praiseTheSun)
    		{
    			result=result+Math.abs(praiseTheSun.get(itteration));
    		}
    		
    	return result;
    }
    
    
    public static void test()
    {
    		String blah="blah";
    		String penis=blah.substring(0,1);
    		
    		System.out.println(penis);
    }
    
    
	public static void main(String[] args) 
	{
		ArrayList<Double> praiseTheSun= new ArrayList<Double>();
		praiseTheSun.add(20.0);
		praiseTheSun.add(67.5);
		praiseTheSun.add(18.16);

		test();
	}

}
