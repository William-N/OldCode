import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;


public class ProblemSet_wfnichol_0060
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0060 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
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
    
	
	public static String getRequest(String url){
	    String response = "";

	    try{
	        response = Request.Get(url).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }

	    return response;
	}
	
    
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns 
     * an int. This method will first send a POST request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-five" where the text in the body of the request 
     * is a CSV formatted string containing the Strings "course" then the String from the input 
     * of this method (do not include any quotes or spaces in your request String). The response 
     * from the server will be a CSV formatted String with either three or four values that are 
     * well formed ints. Parse these values and send them back to the server in a GET request to 
     * the same url but with a query String with the values from the first server response and 
     * names corresponding to the value positions as "first", "second", "third", or "fourth". For 
     * example, if the POST response is "6,32,1,28" then your query String for the GET request 
     * should be "first=6&second=32&third=1&fourth=28". Finally, return the server's response to 
     * the GET request which will be a well-formed int
     */
    public static int q1(String input)
    {
    		
    		ArrayList<Integer> arrayList=new ArrayList<Integer>();
    		String url="https://fury.cse.buffalo.edu/ps-api/type-five";
    		String send="course,"+input;
    		String postText=postRequest(url,send,false);
    		String[] array=postText.split(",");
    		
    		for(int i=0; i<array.length; i++)
    		{
    			
    			int currentValue=Integer.parseInt(array[i]);
    			arrayList.add(currentValue);
    			
    		}
    		
    		String query="?first="+arrayList.get(0)+"&second="+arrayList.get(1)+"&third="+arrayList.get(2);
    		
    		if(arrayList.size()==4)
    		{
    			query=query+"&fourth="+arrayList.get(3);
    		}
    		
    		String request=getRequest(url+query);
    		
    		return Integer.parseInt(request);
    		
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a POST request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-three" where the text in the body of the 
     * request is a CSV formatted string containing the values 73, and 65 as well as the int from 
     * the input of this method as the last value in the CSV String. The response from the server 
     * will be a String that is a well-formed int
     */
    public static int q2(int input)
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-three";
    		String body="73,65,"+input;
    	
    		String postText=postRequest(url,body,false);
    		
    		return Integer.parseInt(postText);
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an int as a parameter and returns an 
     * int. The returned int will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-two" with a query String containing 
     * "super" with value 93, and "wilderness" with value 45 as well as "input" with a value 
     * equal to the int from the input of this method. The response from the server will be a 
     * String that is a well-formed int
     */
    public static int q3(int input)
    {
    	
    		String getIt=getRequest("https://fury.cse.buffalo.edu/ps-api/type-two?super=93&wilderness=45&input="+input);
    		return Integer.parseInt(getIt);
    		
    }
    
    
    
    /**
     * q4: Write a public static method named componentList_92 that takes no parameters and 
     * returns an ArrayList of JComponents containing a new JLabel, and a JTextArea
     */
    public static ArrayList<JComponent> componentList_92()
    {
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		returnList.add(new JLabel());
    		returnList.add(new JTextArea());
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an int as a parameter and returns an 
     * int. This method will first send a GET request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-four" and a query String with three int values 
     * of 40, 44 and the input parameter of this method in this order with names of "first", 
     * "second", and "third" respectively. The response from the server will be a CSV formatted 
     * String with two well-formed ints as values. Then make a POST request to the same url (no 
     * query String) where the text in the body of the request is a CSV String containing the 
     * same two values from the response of the GET request but in the reverse order. For 
     * example, if the response from the GET request was "75,36", then the body of your POST 
     * request should be "36,75". The response from the POST request will again be a CSV String 
     * with two well-formed ints. Finally, return the sum of the two ints in the response of the 
     * POST request
     */
    public static int q5(int input)
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-four";
    		String query="?first=40&second=44&third="+input;
    		
    		String getIt=getRequest(url+query);
    		
    		
    		String[] values=getIt.split(",");
    		String postText=values[1]+","+values[0];
    		
    		String postIt=postRequest(url,postText,false);
    		
    		String[] postValues=postIt.split(",");
    		
    		int sum=0;
    		
    		for(int i=0; i<postValues.length; i++)
    		{
    			
    			sum=sum+Integer.parseInt(postValues[i]);
    			
    		}
    		
    		return sum;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        ProblemSet_wfnichol_0060 outerInstance = new ProblemSet_wfnichol_0060();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        /* Test your code here to verify it is correct before submitting */
    	
    		//System.out.println(q5(4));
        
    }
}
