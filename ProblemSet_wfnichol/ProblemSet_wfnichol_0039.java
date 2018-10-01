import java.io.IOException;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

public class ProblemSet_wfnichol_0039
{
    
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
     * q1: Write a public static method named q1 that takes no parameters and returns a String. 
     * The returned String will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-one/next"
     */
    public static String q1()
    {
    		
    		return getRequest("https://fury.cse.buffalo.edu/ps-api/type-one/next");
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a POST request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-three" where the text in the body of the 
     * request is a CSV formatted string containing the values 42, 54, 89, and 1 as well as the 
     * int from the input of this method as the last value in the CSV String. The response from 
     * the server will be a String that is a well-formed int
     */
    public static int q2(int input)
    {
    	    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-three";
    		String request="42,54,89,1,"+input+"";
    		boolean json=false;
    		    		
    		return Integer.parseInt(postRequest(url, request, json));
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-two" with a query String containing 
     * "focus" with value 11, and "light" with value 72 as well as "input" with a value equal to 
     * the int from the input of this method. The response from the server will be a String that 
     * is a well-formed int
     */
    public static int q3(int input)
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-two";
    		String request="focus,11\nlight,72\ninput,"+input+"";
    		boolean json=false;
    		
    		return Integer.parseInt(postRequest(url, request, json));
    		
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a String. 
     * The returned String will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-one/truly"
     */
    public static String q4()
    {
    		
    		return getRequest("https://fury.cse.buffalo.edu/ps-api/type-one/truly");
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-two" with a query String containing 
     * "oxygen" with value 38, "streak" with value 33, and "powerful" with value 37 as well as 
     * "input" with a value equal to the int from the input of this method. The response from the 
     * server will be a String that is a well-formed int
     */
    public static int q5(int input)
    {
    		String url="https://fury.cse.buffalo.edu/ps-api/type-two";
    		String request="oxygen,38\nstreak,33\npowerful,37\ninput,"+input+"";
    		boolean json=false;
    		
    		return Integer.parseInt(postRequest(url, request, json));
    		
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
    		
    		
    }
}
