public class ProblemSet_wfnichol_0004{
	
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns 
     * an int. The return value is the length of the input String after removing each instance of 
     * "s", "c", and "y".
     * 
     * Hint: If the second argument of the replace method is "" the matching characters will be 
     * removed (Replaced with nothing)
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static int q1(String blah) 
    {
		blah=blah.replace("s","");
		blah=blah.replace("c","");
		blah=blah.replace("y","");
		
		int GucciGang=blah.length();
	
		return GucciGang;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the tangent of the first input added to the 
     * the sine of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q2(double savvage, double kodakBlack)
    {
    		double result=Math.tan(savvage)+Math.sin(kodakBlack);
    		
    		return result;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the sine of the first input subtracted by the 
     * the absolute value of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q3(double southpark, double familyguy)
    {
    		double theAnswer=Math.sin(southpark)-Math.abs(familyguy);
    		
    		return theAnswer;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all upper case 
     * letters then replace all instances of the character 'S' with the character 'I'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q4(String blah)
    {
    		blah=blah.toUpperCase();
    		
    		return blah;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all lower case 
     * letters then replace all instances of the character 'k' with the character 'x'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q5(String blah)
    {
    		blah=blah.toLowerCase();
    		blah=blah.replace("k","x");
    	
    		return blah;
    }
    
    
    
    public static void main(String[] args)
	{
		System.out.println(q1("Cynthia"));
		System.out.println(q2(30,40));
		System.out.println(q3(45,-69));
		System.out.println(q4("tiny characters"));
		System.out.println(q5("Karl the Dank"));
	}
}
