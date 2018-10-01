public class ProblemSet_wfnichol_0006{
    
    
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns 
     * an int. The return value is the total number of times "n" and "v" appear in the input 
     * String.
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
    		blah=blah.toLowerCase();
    		int counter0=blah.length();
    		int counter1=counter0-blah.replace("n","").length();
    		int counter2=counter0-blah.replace("v","").length();
    		int poop=counter1+counter2;
    		return poop;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes two ints as parameters representing a 
     * 2d point (The first parameter is the x-value, second is the y-value) and returns a double. 
     * The return value shall be the Euclidean distance between the input point and the point 
     * (20, 13). 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q2(int x1, int y1)
    {
    		int x2=20, y2=13;
    		
    		double distance=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    		
    		return distance;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all lower case 
     * letters then replace all instances of the character 'l' with the character 'g'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q3(String blah)
    {
    		blah=blah.toLowerCase();
    		blah=blah.replace("l","g");
    		
    		return blah;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the sine of the first input divided by the the 
     * square root of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q4(double penis, double vagina)
    {
    		double result=Math.sin(penis)/Math.sqrt(vagina);
    		
    		return result;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns 
     * an int. The return value is the length of the input String after removing each instance of 
     * "x", "o", and "n".
     * 
     * Hint: If the second argument of the replace method is "" the matching characters will be 
     * removed (Replaced with nothing)
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static int q5(String blah)
    {
    		int result=0;
    	
    		blah=blah.replace("x","");
    		blah=blah.replace("o","");
    		blah=blah.replace("n","");
    		result=blah.length();
    		
    		return result;
    }
    
    
    
    public static void main(String[] args){
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
