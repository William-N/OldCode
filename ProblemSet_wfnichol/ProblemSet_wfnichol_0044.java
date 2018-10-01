import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class ProblemSet_wfnichol_0044
{
	

    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0044 class. This is only done so you can submit multiple 
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
     * q1: Write a public static method named q1 that takes an int as a parameter and returns an 
     * int. This method will first send a GET request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-four" and a query String with three int values 
     * of 94, 71 and the input parameter of this method in this order with names of "first", 
     * "second", and "third" respectively. The response from the server will be a CSV formatted 
     * String with two well-formed ints as values. Then make a POST request to the same url (no 
     * query String) where the text in the body of the request is a CSV String containing the 
     * same two values from the response of the GET request but in the reverse order. For 
     * example, if the response from the GET request was "75,36", then the body of your POST 
     * request should be "36,75". The response from the POST request will again be a CSV String 
     * with two well-formed ints. Finally, return the sum of the two ints in the response of the 
     * POST request
     */
    public static int q1(int input)
    {
    		
    		String getURL="https://fury.cse.buffalo.edu/ps-api/type-four"+"?first=94&second=71&third="+input;
    		String postURL="https://fury.cse.buffalo.edu/ps-api/type-four";
    		String response=getRequest(getURL);
    		
    		String[] responseArray=new String[2];
    		responseArray=response.split(",");
    		String reverseResponse=responseArray[1]+","+responseArray[0];
    		
    		String postResponse=postRequest(postURL,reverseResponse,false);
    		
    		String[] postResponseArray=new String[2];
    		postResponseArray=postResponse.split(",");
    		
    		return Integer.parseInt(postResponseArray[0])+Integer.parseInt(postResponseArray[1]);
    		
    }
    
    
    
    /**
     * q2: Write a public class named PlanetFour with private instance variables named 
     * "reasonable" of type boolean, "gentle" of type int, "still" of type int, and "next" of 
     * type String. Then write a public method inside the PlanetFour class named "fromJsonString" 
     * that takes a String as a parameter and has return type void. This method will parse the 
     * input String as a properly formatted Json object representing the values for the instance 
     * of PlanetFour where the keys of the Json object are the instance variable names and the 
     * values are the values to which they should be set
     */
    public class PlanetFour
    {
    		
    		private boolean reasonable;
    		private int gentle;
    		private int still;
    		private String next;
    		
    		public PlanetFour(boolean reasonable, int gentle, int still, String next)
    		{
    			
    			this.reasonable=reasonable;
    			this.gentle=gentle;
    			this.still=still;
    			this.next=next;
    			
    		}
    		
    		public void fromJsonString(String input)
    		{
    			
    			JsonValue inputValue=Json.parse(input);
    			JsonObject inputObject=inputValue.asObject();
    			
    			this.reasonable=inputObject.get("reasonable").asBoolean();
    			this.gentle=inputObject.get("gentle").asInt();
    			this.still=inputObject.get("still").asInt();
    			this.next=inputObject.get("next").asString();
    			
    		}
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a String. 
     * The returned String will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-one/anger"
     */
    public static String q3()
    {
    		
    		String getURL="https://fury.cse.buffalo.edu/ps-api/type-one/anger";
    		
    		return getRequest(getURL);
    		
    }
    
    
    
    /**
     * q4: Write a public class named LearningFive with private instance variables named "like" 
     * of type String, "suspect" of type boolean, "certain" of type String, and "intellectual" of 
     * type boolean.
     * 
     * Then write a public method inside the Problem Set class named "parseLearningFive" that 
     * takes a String as a parameter and returns an ArrayList of LearningFive. This method will 
     * parse the input String as a properly formatted Json array of objects where each object 
     * represents the values for the instance of LearningFive where the keys of each Json object 
     * are the instance variable names and the values are the values to which they should be set. 
     * Return an ArrayList of instances of LearningFive with the instance variables matching the 
     * values from the Json objects. The order of instances in the ArrayList must match the order 
     * of objects in the Json array
     */
    public class LearningFive
    {
    		
    		private String like;
    		private boolean suspect;
    		private String certain;
    		private boolean intellectual;
    		
    		public LearningFive(String like, boolean suspect, String certain, boolean intellectual)
    		{
    			
    			this.like=like;
    			this.suspect=suspect;
    			this.certain=certain;
    			this.intellectual=intellectual;
    			
    		}
    		
    		public ArrayList<LearningFive> parseLearningFive(String input)
    		{
    			
    			ArrayList<LearningFive> returnList=new ArrayList<LearningFive>();
        		JsonValue inputValue=Json.parse(input);
        		JsonArray inputArray=inputValue.asArray();
        		
        		for(int i=0;i<inputArray.size();i++)
        		{
        			
        			JsonObject currentObject=inputArray.get(i).asObject();
        					
        			String current1=currentObject.get("like").asString();
        			boolean current2=currentObject.get("suspect").asBoolean();
        			String current3=currentObject.get("certain").asString();
        			boolean current4=currentObject.get("intellectual").asBoolean();
        			
        			LearningFive toPut=new LearningFive(current1,current2,current3,current4);
        			returnList.add(toPut);
        			
        		}
        		
        		return returnList;

    			
    		}
    		
    }
    
    
    
    /**
     * q5: Write a public class named EveningThree with private instance variables named "armed" 
     * of type int, "nuclear" of type int, "sunny" of type int, "rare" of type double, and 
     * "stable" of type double. Then write a public method inside the EveningThree class named 
     * "toJsonString" that takes no parameters and returns a String. The returned String will be 
     * a properly formatted Json object representing this instance of EveningThree where the keys 
     * of the Json object are the instance variable names and the values are their current values
     */
    public class EveningThree
    {
    	
    		private int armed;
    		private int nuclear;
    		private int sunny;
    		private double rare;
    		private double stable;
    		
    		public String toJsonString()
    		{
    			
    			JsonObject makeString=new JsonObject();
    			makeString.add("armed", this.armed);
    			makeString.add("nuclear", this.nuclear);
    			makeString.add("sunny", this.sunny);
    			makeString.add("rare", this.rare);
    			makeString.add("stable", this.stable);
    			
    			String returnString=makeString.asString();
    			
    			return returnString;
    			
    		}
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0044 outerInstance = new ProblemSet_wfnichol_0044();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
