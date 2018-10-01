public class ProblemSet_wfnichol_0002{
    /**
     * q1: Write a public static method named q1 that prints the String "cold observer" to the 
     * screen
     */
    public static void q1()
    {
    		System.out.println("cold observer");
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and returns a 
     * String. The method will return the input String with the adjective "two" appended to the 
     * beginning of it separated by a space. For example, if the input String is "lower" your 
     * method should return "two lower"
     */
    public static String q2(String blah)
    {
    		return("two "+blah);
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that prints the String "flip writing" to the 
     * screen
     */
    public static void q3()
    {
    		System.out.println("flip writing");
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that prints the number 793 to the screen
     */
    public static void q4()
    {
    		System.out.println(793);
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes a double as a parameter and returns a 
     * double. The method will represent a line with slope 3.91 and y-intercept 11.95 by 
     * interpreting the input double as an x-value and returning the corresponding y-value on the 
     * line
     */
    public static double q5(double x)
    {
    		double slope=3.91;
    		double y_int=11.95;
    		double y;
    		
    		y=(x*slope)+y_int;
    		
    		return y;
    }
    
    
    
    public static void main(String[] args)
    {
    		q1();
    		System.out.println(q2("blah"));
    		q3();
    		q4();
        System.out.println(q5(5));
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
