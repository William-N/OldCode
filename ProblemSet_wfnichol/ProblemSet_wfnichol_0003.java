public class ProblemSet_wfnichol_0003{
    
    
    /**
     * q1: Write a public static method named q1 that takes a double as a parameter and returns a 
     * double. The method will represent a line with slope -8.56 and y-intercept 4.87 by 
     * interpreting the input double as an x-value and returning the corresponding y-value on the 
     * line
     */
    public static double q1(double x)
    {
    		double slope=-8.56;
    		double y_int=4.87;
    		double y;
    		
    		y=slope*x+y_int;
    		
    		return y;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and returns a 
     * String. The method will return the input String with the adjective "false" appended to the 
     * beginning of it separated by a space. For example, if the input String is "casino" your 
     * method should return "false casino"
     */
    public static String q2(String blah)
    {
    		String falsch="false ";
    		blah=falsch+blah;
    		
    		return blah;
    }
    
    
    /**
     * q3: Write a public static method named q3 that takes a double as a parameter and returns a 
     * double. The method will represent a parabola written in standard form 
     * (https://www.desmos.com/calculator/zukjgk9iry) where a=10.43, b=9.68, and c=8.39 by 
     * interpreting the input double as an x-value and returning the corresponding y-value on the 
     * parabola
     */
    public static double q3(double x)
    {
    		double a=10.43;
    		double b=9.68;
    		double c=8.39;
    		double y;
    		
    		y=a*(x*x)+b*x+c;
    		
    		return y;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that prints the String "compound thing" to the 
     * screen
     */
    public static void q4()
    {
    		System.out.println("compound thing");
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that prints the number 291 to the screen
     */
    public static void q5()
    {
    		System.out.println(291);
    }
    
    
    
    public static void main(String[] args)
    {
        System.out.println(q1(5));
        System.out.println(q2("blah"));
        System.out.println(q3(5));
        q4();
        q5();
        /* Test your code here to verify it is correct before submitting */
        
    }
}
