public class ProblemSet_wfnichol_0009{
    
    
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns a 
     * String. The returned String is based on the input String as follows:
     * 
     * If the input String has no characters, return "empty"
     * If the input String has less than 3 characters, return "short"
     * If the input String has 3 or more characters but less than 6, return "medium"
     * If the input String has greater than or equal to 6 characters, return "long"
     * If the input String contains any instances of the letter 'w', return "found w" regardless 
     * of the length of the input
     */
	public static String q1(String blah)
    {
    	
    		if (blah.indexOf("w")>=0)
    			{
    				return"found w";
    			}
    	
    		if (blah.length()==0)
    			{
    				return"empty";
    			}
    		if (blah.length()<3 && blah.length()!=0)
    			{
    				return"short";
    			}
    		if (blah.length()<6 && blah.length()>=3)
    			{
    				return"medium";
    			}
    		if (blah.length()>=6)
    			{
    				return"long";
    			}
    		return "error";
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is less than -10 or the second parameter is equal to 9
     */
    public static boolean q2(int little, int uzi)
    {
    		if (little<-10||uzi==9)
    			return true;
    		
    		return false;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes two ints as parameters and returns a 
     * boolean. The output should be the evaluation of the boolean expression: The first 
     * parameter is greater than -7 and the second parameter is not equal to 5
     */
    public static boolean q3(int little, int uzi)
    {
    		if (little>-7&&uzi!=5)
    		{
    			return true;
    		}
    		
    		return false;
    }

    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns void. The 
     * method should print all the integers from 14 to 131 to the screen. The output should be 
     * inclusive of these end points
     */
    public static void q4()
    {
    		for(int i=14; i<132; i++)
    		{
    			System.out.println(i);
    		}
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns void. The 
     * method should print all the integers from -10 to 100 to the screen. The output should be 
     * inclusive of these end points
     */
    public static void q5()
    {
    		for(int i=-10; i<101; i++)
		{
			System.out.println(i);
		}
    }
    
    
    
    public static void main(String[] args){
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
