import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class TestingGrounds42 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0042 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public class named HuntFour with private instance variables named "weekly" of 
     * type int, "waste" of type int, "round" of type double, and "various" of type int. Then 
     * write a public method inside the HuntFour class named "fromJsonString" that takes a String 
     * as a parameter and has return type void. This method will parse the input String as a 
     * properly formatted Json object representing the values for the instance of HuntFour where 
     * the keys of the Json object are the instance variable names and the values are the values 
     * to which they should be set
     */
    public class HuntFour
    {
    		
    		private int weekly;
    		private int waste;
    		private double round;
    		private int various;
    		
    		public HuntFour(int weekly, int waste, double round, int various)
    		{
    			
    			this.weekly=weekly;
    			this.waste=waste;
    			this.round=round;
    			this.various=various;
    			
    		}
    		
    		public void fromJsonString(String blah)
    		{
    			
    			JsonValue value=Json.parse(blah);
    			JsonObject json=value.asObject();
    			
    			this.weekly=json.get("weekly").asInt();
    			this.waste=json.get("waste").asInt();
    			this.round=json.get("round").asDouble();
    			this.various=json.get("various").asInt();
    			
    		}
    		
    }
    
    
    
    /**
     * q2: Write a public class named FrequencyThree with private instance variables named 
     * "normal" of type String, "aware" of type boolean, "integrated" of type boolean, 
     * "unexpected" of type boolean, and "complicated" of type int. Then write a public method 
     * inside the FrequencyThree class named "toJsonString" that takes no parameters and returns 
     * a String. The returned String will be a properly formatted Json object representing this 
     * instance of FrequencyThree where the keys of the Json object are the instance variable 
     * names and the values are their current values
     */
    public class FrequencyThree
    {
    		
    		private String normal;
    		private boolean aware;
    		private boolean integrated;
    		private boolean unexpected;
    		private int complicated;
    		
    		public FrequencyThree(String normal, boolean aware, boolean integrated, boolean unexpected, int complicated)
    		{
    			
    			this.normal=normal;
    			this.aware=aware;
    			this.integrated=integrated;
    			this.unexpected=unexpected;
    			this.complicated=complicated;
    			
    		}
    		
    		public String toJsonString()
    		{
    			
    			JsonObject json=new JsonObject();
    			json.add("normal", this.normal);
    			json.add("aware", this.aware);
    			json.add("integrated", this.integrated);
    			json.add("unexpected", this.unexpected);
    			json.add("complicated", this.complicated);
    			
    			String returnString=""+json;
    			return returnString;
    			
    		}
    		
    }
    
    
    
    /**
     * q3: Write a public static method named jsonObject_898 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * object with key-value pairs named "future" with value "favorable entrepreneur" of type 
     * string, "special" with value 14 of type number, "variable" with value 11.56 of type 
     * number, "suspicious" with value 4.98 of type number, and "devastating" with value 16.78 of 
     * type number
     */
    public static String jsonObject_898()
    {
    		
    		JsonObject json=new JsonObject();
    		json.add("future", "favorable entrepreneur");
    		json.add("special", 14);
    		json.add("variable", 11.56);
    		json.add("suspicious", 4.98);
    		json.add("devastating", 16.78);
    		
    		String returnString=""+json;
    		return returnString;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named jsonArray_927 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * array with the values false of type boolean, "elementary minimum" of type string, true of 
     * type boolean, and -8.54 of type number in this order
     */
    public static String jsonArray_927()
    {
    		
    		JsonArray array=new JsonArray();
    		array.add(false);
    		array.add("elementary minimum");
    		array.add(true);
    		array.add(-8.54);
    		
    		String returnString=""+array;
    		return returnString;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named jsonObject_904 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * object with key-value pairs named "multiple" with value 17.05 of type number, "wonderful" 
     * with value true of type boolean, "progressive" with value true of type boolean, and 
     * "inevitable" with value false of type boolean
     */
    public static String jsonObject_904()
    {
    		
    		JsonObject json=new JsonObject();
    		json.add("multiple", 17.05);
    		json.add("wonderful", true);
    		json.add("progressive", true);
    		json.add("inevitable", false);
    		
    		String returnString=""+json;
    		return returnString;
    		
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
    		//ProblemSet_wfnichol_0042 outerInstance = new ProblemSet_wfnichol_0042();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
