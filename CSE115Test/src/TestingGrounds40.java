import java.io.IOException; 

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

public class TestingGrounds40 
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
     * q1: Write a public static method named q1 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-two" with a query String containing 
     * "streak" with value 34, and "wilderness" with value 54 as well as "input" with a value 
     * equal to the int from the input of this method. The response from the server will be a 
     * String that is a well-formed int
     */
    public static int q1(int input)  //complete
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-two?streak=34&wilderness=54&input="+input;
    		    		
    		return Integer.parseInt(getRequest(url));
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns a String. 
     * The returned String will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-one/negative"
     */
    public static String q2()  //complete
    {
    		
    		return getRequest("https://fury.cse.buffalo.edu/ps-api/type-one/negative");
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-two" with a query String containing 
     * "counter" with value 62, "lucky" with value 21, and "powerful" with value 42 as well as 
     * "input" with a value equal to the int from the input of this method. The response from the 
     * server will be a String that is a well-formed int
     */
    public static int q3(int input)  //complete
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-two?counter=62&lucky=21&powerful=42&input="+input;
    		
    		return Integer.parseInt(getRequest(url));
    		
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a POST request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-three" where the text in the body of the 
     * request is a CSV formatted string containing the values 7, 51, 21, and 43 as well as the 
     * int from the input of this method as the last value in the CSV String. The response from 
     * the server will be a String that is a well-formed int
     */
    public static int q4(int input)  //complete
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-three";
    		String request="7,51,21,43,"+input;
    		boolean json=false;
    		
    		return Integer.parseInt(postRequest(url, request, json));
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-two" with a query String containing 
     * "data" with value 11, and "oxygen" with value 20 as well as "input" with a value equal to 
     * the int from the input of this method. The response from the server will be a String that 
     * is a well-formed int
     */
    public static int q5(int input)
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-two?data=11&oxygen=20&input="+input;
    		
    		return Integer.parseInt(getRequest(url));
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
    		
    	
    }
}
