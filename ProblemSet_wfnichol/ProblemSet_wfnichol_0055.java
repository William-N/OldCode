import java.util.ArrayList;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class ProblemSet_wfnichol_0055
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0055 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public static method named q1 that takes a double as a parameter and returns a 
     * double. The method will represent a parabola written in standard form 
     * (https://www.desmos.com/calculator/zukjgk9iry) where a=-1.55, b=-7.62, and c=-6.09 by 
     * interpreting the input double as an x-value and returning the corresponding y-value on the 
     * parabola
     */
    public static double q1(double x)
    {
  
    		double a=-1.55;
    		double b=-7.62;
    		double c=-6.09;
    		System.out.println(a*Math.pow(x, 2)+b*x+c);
    		return a*Math.pow(x, 2)+b*x+c;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named jsonArray_417 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * array with the values -7.12 of type number, 19.26 of type number, true of type boolean, 
     * false of type boolean, and false of type boolean in this order
     */
    public static String jsonArray_417()
    {
    		
    		JsonArray array=new JsonArray();
    		array.add(-7.12);
    		array.add(19.26);
    		array.add(true);
    		array.add(false);
    		array.add(false);
    		
    		JsonValue value=array;
    		
    		return value.asString();
    		
    		
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes two ints as parameters representing a 
     * 2d point (The first parameter is the x-value, second is the y-value) and returns a double. 
     * The return value shall be the Euclidean distance between the input point and the point 
     * (-5, 24). 
     * 
     * See (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary) for a 
     * complete list of methods contained in the Math class. You may call any of these methods in 
     * your method
     */
    public static double q3(int x, int y)
    {
    	
    		double x1=new Double(x);
    		double y1=new Double(y);
    		double x2=-5.0;
    		double y2=24;
    		
    		double theX=Math.pow(x1-x2, 2);
    		double theY=Math.pow(y1-y2, 2);
    		
    		double blah=Math.sqrt(theX+theY);
    		return blah;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named jsonObject_606 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * object with key-value pairs named "premium" with value true of type boolean, "quality" 
     * with value -8.19 of type number, "steady" with value false of type boolean, "prime" with 
     * value false of type boolean, and "impressive" with value false of type boolean
     */
    public static String jsonObject_606()
    {
    		
    		JsonObject object=new JsonObject();
    		object.add("premium", true);
    		object.add("quality", -8.19);
    		object.add("steady", false);
    		object.add("prime", false);
    		object.add("impressive", false);
    		
    		JsonValue returnThis=object;
    		
    		
    		return returnThis+"";
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Integers as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the cube of each element and compute the sum of all of these values. Your method 
     * will then return the cube root of this sum
     */
    public static double q5(ArrayList<Integer> array)
    {
    		
    		double returnThis=0.0;
    	
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			returnThis=returnThis+Math.pow(array.get(i), 3);
    			
    		}
    		
    		return returnThis;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0055 outerInstance = new ProblemSet_wfnichol_0055();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        /* Test your code here to verify it is correct before submitting */
    		ArrayList<Integer> array=new ArrayList<Integer>();
    		array.add(3);
    		array.add(4);
    		System.out.println(q5(array));
    	
    }
}
