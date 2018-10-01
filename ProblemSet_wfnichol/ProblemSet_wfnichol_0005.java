public class ProblemSet_wfnichol_0005{
    
    
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all upper case 
     * letters then replace all instances of the character 'P' with the character 'H'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q1(String blah)
    {
    		blah=blah.toUpperCase();
    		blah=blah.replace("P", "H");
    		
    		return blah;
    }
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and returns a 
     * String. To compute the return String, first convert the input String to all upper case 
     * letters then replace all instances of the character 'E' with the character 'W'.
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static String q2(String blah)
    {
    		blah=blah.toUpperCase();
    		blah=blah.replace("E","W");
    		
    		return blah;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes two doubles as parameters and returns 
     * a double. The returned double should be the the sine of the first input subtracted by the 
     * the sine of the second input. 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q3(double hipHop, double rock)
    {
    		double result=Math.sin(hipHop)-Math.sin(rock);
    		
    		return result;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a String as a parameter and returns 
     * an int. The return value is the total number of times "c" and "f" appear in the input 
     * String.
     * 
     * Hint: If the second argument of the replace method is "" the matching characters will be 
     * removed (Replaced with nothing)
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary) for a 
     * complete list of methods contained in the String class. You may call any of these methods 
     * in your method
     */
    public static int q4(String blah)
    {
    		int counter, counter0, counter1, counter2;
    	
    		blah=blah.toLowerCase();
    		counter0=blah.length();
    		counter1=blah.replace("c","").length();
    		counter2=blah.replace("f","").length();
    		counter1=counter0-counter1;
    		counter2=counter0-counter2;
    		counter=counter1+counter2;
    		
    		return counter;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns 
     * an int. The return value is the length of the input String after removing each instance of 
     * "c", "e", and "v".
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
    		int counter=0;
    	
    		blah=blah.replace("c","");
    		blah=blah.replace("e","");
    		blah=blah.replace("v","");
    		
    		counter=blah.length();
    		
    		return counter;
    		
    }
    
    
    
	public static void main(String[] args) 
	{
		System.out.println(q1("Pennis"));
		System.out.println(q2("Eilliam"));
		System.out.println(q3(30,50));
		System.out.println(q4("Fucking Cunt"));
		System.out.println(q5("cev666"));

	}
}
