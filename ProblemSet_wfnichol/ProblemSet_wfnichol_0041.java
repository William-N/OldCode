import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

public class ProblemSet_wfnichol_0041
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0041 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public class named DropThree with private instance variables named "off" of 
     * type int, "legitimate" of type int, "explicit" of type int, and "odd" of type double. Then 
     * write a public method inside the DropThree class named "toJsonString" that takes no 
     * parameters and returns a String. The returned String will be a properly formatted Json 
     * object representing this instance of DropThree where the keys of the Json object are the 
     * instance variable names and the values are their current values
     */
    public class DropThree
    {
    		
    		private int off;
    		private int legitimate;
    		private int explicit;
    		private double odd;
    		
    		public DropThree(int off, int legitimate, int explicit, double odd)
    		{
    			
    			this.off=off;
    			this.legitimate=legitimate;
    			this.explicit=explicit;
    			this.odd=odd;
    			
    			
    		}
    		
    		public String toJsonString()
    		{
    			
    			JsonObject json=new JsonObject();
    			json.add("off", this.off);
    			json.add("legitimate", this.legitimate);
    			json.add("explicit", this.explicit);
    			json.add("odd", this.odd);
    			
    			String returnString=json+"";
        		return returnString;
    			
    		}
    		
    }
    
    
    
    /**
     * q2: Write a public static method named jsonArray_871 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * array with the values -16.9 of type number, "least constant" of type string, and -5.23 of 
     * type number in this order
     */
    public static String jsonArray_871()
    {
    		
    		JsonArray array=new JsonArray();
    		
    		array.add(-16.9);
    		array.add("least constant");
    		array.add(-5.23);
    		
    		String returnString=array+"";
    		return returnString;    		
    }
    
    
    
    /**
     * q3: Write a public static method named jsonObject_442 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * object with key-value pairs named "dear" with value -4.28 of type number, "bitter" with 
     * value "neat eye" of type string, "military" with value true of type boolean, "underlying" 
     * with value -5.54 of type number, and "inevitable" with value true of type boolean
     */
    public static String jsonObject_442()
    {
    		
		JsonObject json=new JsonObject();
		json.add("dear", -4.28);
		json.add("bitter", "neat eye");
		json.add("military",true);
		json.add("underlying", -5.54);
		json.add("inevitable", true);
		
		String returnString=json+"";
		return returnString;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named jsonObject_26 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * object with key-value pairs named "three" with value false of type boolean, "holy" with 
     * value -11.2 of type number, "star" with value -1.6 of type number, and "longtime" with 
     * value false of type boolean
     */
    public static String jsonObject_26()
    {
    		
    		JsonObject json=new JsonObject();
    		json.add("three", false);
    		json.add("holy", -11.2);
    		json.add("star", -1.6);
    		json.add("longtime", false);
    		
    		String returnString=json+"";
    		return returnString;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named jsonArray_522 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * array with the values true of type boolean, "religious output" of type string, "creative 
     * consideration" of type string, and "initial romance" of type string in this order
     */
    public static String jsonArray_522()
    {
    		
    		JsonArray array=new JsonArray();
    		array.add(true);
    		array.add("religious output");
    		array.add("creative consideration");
    		array.add("initial romance");
    		
    		String returnString=array+"";
    		return returnString;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        ProblemSet_wfnichol_0041 outerInstance = new ProblemSet_wfnichol_0041();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
    		/* Test your code here to verify it is correct before submitting */
        
    }
}
