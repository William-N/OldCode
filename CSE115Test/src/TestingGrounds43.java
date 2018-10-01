import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class TestingGrounds43 
{
	

    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0043 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
	public static String getRequest(String url){
	    String response = "";

	    try{
	        response = Request.Get(url).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }

	    return response;
	}
	

	public static String postRequest(String url, String body, boolean json){
	    String response = "";
	    try{
	        ContentType type = ContentType.DEFAULT_TEXT;
	        if(json){
	            type = ContentType.APPLICATION_JSON;
	        }
	        response = Request.Post(url).bodyString(body, type).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }
	    return response;
	}
    
    
    /**
     * q1: Write a public static method named jsonArray_84 that takes no parameters and returns a 
     * String. The returned String will be a properly formatted JSON string representing an array 
     * with the values "billion move" of type string, "okay servant" of type string, and false of 
     * type boolean in this order
     */
    public static String jsonArray_84()
    {
    		
    		JsonArray array=new JsonArray();
    		array.add("billion move");
    		array.add("okay servant");
    		array.add(false);
    		String returnString=""+array;
    		
    		return returnString;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named jsonObject_77 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * object with key-value pairs named "oral" with value true of type boolean, "residential" 
     * with value false of type boolean, and "star" with value 10.05 of type number
     */
    public static String jsonObject_77()
    {
    		
    		JsonObject json=new JsonObject();
    		json.add("oral", true);
    		json.add("residential", false);
    		json.add("star", 10.05);
    		String returnString=""+json;
    		
    		return returnString;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an int as a parameter and returns an 
     * int. This method will first send a GET request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-four" and a query String with three int values 
     * of 43, 49 and the input parameter of this method in this order with names of "first", 
     * "second", and "third" respectively. The response from the server will be a CSV formatted 
     * String with two well-formed ints as values. Then make a POST request to the same url (no 
     * query String) where the text in the body of the request is a CSV String containing the 
     * same two values from the response of the GET request but in the reverse order. For 
     * example, if the response from the GET request was "75,36", then the body of your POST 
     * request should be "36,75". The response from the POST request will again be a CSV String 
     * with two well-formed ints. Finally, return the sum of the two ints in the response of the 
     * POST request
     */
    public static int q3(int specialNumber)
    {
    		
    		String getUrl="https://fury.cse.buffalo.edu/ps-api/type-four?first=43&second=49&third="+specialNumber;
    		String postUrl="https://fury.cse.buffalo.edu/ps-api/type-four";
    		
    		String getIt=getRequest(getUrl);
    		String[] reverseIt=getIt.split(",");
    		String postIt=postRequest(postUrl,reverseIt[1]+reverseIt[0],false);
    		String[] returnIt=postIt.split(",");
    		
    		return Integer.parseInt(returnIt[0])+Integer.parseInt(returnIt[1]);
    		
    }
    
    
    
    /**
     * q4: Write a public class named PatternFive with private instance variables named 
     * "internal" of type boolean, "striking" of type int, "frozen" of type boolean, "eight" of 
     * type double, and "toxic" of type double.
     * 
     * Then write a public method inside the Problem Set class named "parsePatternFive" that 
     * takes a String as a parameter and returns an ArrayList of PatternFive. This method will 
     * parse the input String as a properly formatted Json array of objects where each object 
     * represents the values for the instance of PatternFive where the keys of each Json object 
     * are the instance variable names and the values are the values to which they should be set. 
     * Return an ArrayList of instances of PatternFive with the instance variables matching the 
     * values from the Json objects. The order of instances in the ArrayList must match the order 
     * of objects in the Json array
     */
    public class PatternFive
    {
    		
    		private boolean internal;
    		private int striking;
    		private boolean frozen;
    		private double eight;
    		private double toxic;
    		
    		public PatternFive(boolean internal, int striking, boolean frozen, double eight, double toxic)
    		{
    			
    			this.internal=internal;
    			this.striking=striking;
    			this.frozen=frozen;
    			this.eight=eight;
    			this.toxic=toxic;

    		}
    		
    }
    
    public ArrayList<PatternFive> parsePatternFive(String input)
    {
    		
    		ArrayList<PatternFive> returnList=new ArrayList<PatternFive>();
    		JsonValue inputValue=Json.parse(input);
    		JsonArray inputArray=inputValue.asArray();
    		
    		for(int i=0;i<inputArray.size();i++)
    		{
    			
    			JsonObject currentObject=inputArray.get(i).asObject();
    					
    			boolean current1=currentObject.get("internal").asBoolean();
    			int current2=currentObject.get("striking").asInt();
    			boolean current3=currentObject.get("frozen").asBoolean();
    			double current4=currentObject.get("eight").asDouble();
    			double current5=currentObject.get("toxic").asDouble();
    			
    			PatternFive toPut=new PatternFive(current1,current2,current3,current4,current5);
    			returnList.add(toPut);
    			
    		}
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and returns 
     * an int. This method will first send a POST request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-five" where the text in the body of the request 
     * is a CSV formatted string containing the Strings "meanwhile" then the String from the 
     * input of this method (do not include any quotes or spaces in your request String). The 
     * response from the server will be a CSV formatted String with either three or four values 
     * that are well formed ints. Parse these values and send them back to the server in a GET 
     * request to the same url but with a query String with the values from the first server 
     * response and names corresponding to the value positions as "first", "second", "third", or 
     * "fourth". For example, if the POST response is "6,32,1,28" then your query String for the 
     * GET request should be "first=6&second=32&third=1&fourth=28". Finally, return the server's 
     * response to the GET request which will be a well-formed int
     */
    public static int q5(String blah)
    {
    		
    		String postUrl="https://fury.cse.buffalo.edu/ps-api/type-five";
    		String postText="meanwhile,"+blah;
    		
    		String postIt=postRequest(postUrl,postText,false);
    		String[] splitIt=postIt.split(",");
    		
    		String getUrl="https://fury.cse.buffalo.edu/ps-api/type-five?first="+splitIt[0]+"&second="+splitIt[1]+"&third="+splitIt[2];
    		
    		if(splitIt.length==4)
    		{
    			
    			getUrl=getUrl+"&fourth="+splitIt[3];
    			
    		}
    		
    		return Integer.parseInt(getRequest(getUrl));
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0043 outerInstance = new ProblemSet_wfnichol_0043();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
    		
    	
    }
	
}
