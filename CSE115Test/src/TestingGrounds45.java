import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class TestingGrounds45 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0045 class. This is only done so you can submit multiple 
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
     * int. The returned int will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-two" with a query String containing 
     * "power" with value 37, and "fleet" with value 45 as well as "input" with a value equal to 
     * the int from the input of this method. The response from the server will be a String that 
     * is a well-formed int
     */
    public static int q1(int input)
    {
    		
    		String getURL="https://fury.cse.buffalo.edu/ps-api/type-two?power=37&fleet=45&input="+input;
    		return Integer.parseInt(getRequest(getURL));
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a POST request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-three" where the text in the body of the 
     * request is a CSV formatted string containing the values 4, 50, 97, and 22 as well as the 
     * int from the input of this method as the last value in the CSV String. The response from 
     * the server will be a String that is a well-formed int
     */
    public static int q2(int input)
    {
    		
    		String postURL="https://fury.cse.buffalo.edu/ps-api/type-three";
    		String postText="4,50,97,22,"+input;
    		
    		return Integer.parseInt(postRequest(postURL, postText, false));
    		
    }
    
    
    
    /**
     * q3: Write a public class named SheetFive with private instance variables named "epidemic" 
     * of type boolean, "unlike" of type double, "complete" of type double, "rank" of type 
     * double, and "religious" of type double.
     * 
     * Then write a public method inside the Problem Set class named "parseSheetFive" that takes 
     * a String as a parameter and returns an ArrayList of SheetFive. This method will parse the 
     * input String as a properly formatted Json array of objects where each object represents 
     * the values for the instance of SheetFive where the keys of each Json object are the 
     * instance variable names and the values are the values to which they should be set. Return 
     * an ArrayList of instances of SheetFive with the instance variables matching the values 
     * from the Json objects. The order of instances in the ArrayList must match the order of 
     * objects in the Json array
     */
    public class SheetFive
    {
    		
    		private boolean epidemic;
    		private double unlike;
    		private double complete;
    		private double rank;
    		private double religious;
    		
    		public SheetFive(boolean epidemic, double unlike, double complete, double rank, double religious)
    		{
    			
    			this.epidemic=epidemic;
    			this.unlike=unlike;
    			this.complete=complete;
    			this.rank=rank;
    			this.religious=religious;
    			
    		}
    		
    }
    
    
    public ArrayList<SheetFive> parseSheetFive(String input)
    {
    		
    		ArrayList<SheetFive> returnList=new ArrayList<SheetFive>();
		JsonValue inputValue=Json.parse(input);
		JsonArray inputArray=inputValue.asArray();
		
		for(int i=0;i<inputArray.size();i++)
		{
			
			JsonObject currentObject=inputArray.get(i).asObject();
					
			boolean current1=currentObject.get("epidemic").asBoolean();
			double current2=currentObject.get("unlike").asDouble();
			double current3=currentObject.get("complete").asDouble();
			double current4=currentObject.get("rank").asDouble();
			double current5=currentObject.get("religious").asDouble();
			
			SheetFive toPut=new SheetFive(current1,current2,current3,current4,current5);
			returnList.add(toPut);
			
		}
		
		return returnList;
    		
    }
    
    
    /**
     * q4: Write a public static method named q4 that takes an int as a parameter and returns an 
     * int. This method will first send a GET request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-four" and a query String with three int values 
     * of 86, 30 and the input parameter of this method in this order with names of "first", 
     * "second", and "third" respectively. The response from the server will be a CSV formatted 
     * String with two well-formed ints as values. Then make a POST request to the same url (no 
     * query String) where the text in the body of the request is a CSV String containing the 
     * same two values from the response of the GET request but in the reverse order. For 
     * example, if the response from the GET request was "75,36", then the body of your POST 
     * request should be "36,75". The response from the POST request will again be a CSV String 
     * with two well-formed ints. Finally, return the sum of the two ints in the response of the 
     * POST request
     */
    public static int q4(int input)
    {
    		
    		String getURL="https://fury.cse.buffalo.edu/ps-api/type-four?first=86&second=30&third="+input;
    		String postURL="https://fury.cse.buffalo.edu/ps-api/type-four";
    		String recieved=getRequest(getURL);
    		
    		String[] recievedArray=new String[2];
    		recievedArray=recieved.split(",");
    		String recievedReverse=recievedArray[0]+","+recievedArray[1];
    		
    		String postMessage=postRequest(postURL,recievedReverse,false);
    		
    		String[] returnIt=new String[2];
    		returnIt=postMessage.split(",");
    		
    		return Integer.parseInt(returnIt[1])+Integer.parseInt(returnIt[0]);
    		
    }
    
    
    
    /**
     * q5: Write a public class named SubstanceThree with private instance variables named 
     * "social" of type boolean, "used" of type int, "pregnant" of type int, and "fighting" of 
     * type int. Then write a public method inside the SubstanceThree class named "toJsonString" 
     * that takes no parameters and returns a String. The returned String will be a properly 
     * formatted Json object representing this instance of SubstanceThree where the keys of the 
     * Json object are the instance variable names and the values are their current values
     */
    public class SubstanceThree
    {
    		
    		private boolean social;
    		private int used;
    		private int pregnant;
    		private int fighting;
    		
    		public SubstanceThree(boolean social, int used, int pregnant, int fighting)
    		{
    			
    			this.social=social;
    			this.used=used;
    			this.pregnant=pregnant;
    			this.fighting=fighting;
    			
    		}
    		
    		
    		public String toJsonString()
    		{
    			
    			JsonObject returnObject=new JsonObject();
    			returnObject.add("social", this.social);
    			returnObject.add("used", this.used);
    			returnObject.add("pregnant", this.pregnant);
    			returnObject.add("fighting", this.fighting);
    			
    			String returnString=returnObject+"";
    			
    			return returnString;
    			
    		}
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0045 outerInstance = new ProblemSet_wfnichol_0045();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
