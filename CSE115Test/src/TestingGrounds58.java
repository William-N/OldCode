import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class TestingGrounds58 
{
    
    /**
     * q1: Write a public class named XYPoint with 2 private instance variables named x and y 
     * each of type double. You may add any other methods, variables, or constructors to this 
     * class. Then, in the Problem Set class, write a public method named agro that takes two 
     * XYPoints as parameters and has return type void. This method will "move" the second 
     * parameter point closer to the first parameter point by a distance of 1.0 in this 
     * 2-dimensional space. If the points are closer than 1.0 to each other then the second point 
     * should be moved to the location of the first point. For example if the input is (3.3, 6.9) 
     * and (2.5, -7.2) then the instance variables of the second point will be (2.5566, -6.2016) 
     * after the method executes
     */
    public class XYPoint
    {
    		
    		private double x;
    		private double y;
    		
    		public XYPoint(double x, double y)
    		{
    			
    			this.x=x;
    			this.y=y;
    			
    		}
    		
    		public double getX()
    		{
    			return this.x;
    		}
    		public double getY()
    		{
    			return this.y;
    		}
    		public void setX(double x)
    		{
    			this.x=x;
    		}
    		public void setY(double y)
    		{
    			this.y=y;
    		}
    		
    }
    
    
    public static void agro(XYPoint point1, XYPoint point2)
    {
    		//Works definetly
    		double x1=point1.getX();
    		double y1=point1.getY();
    		double x2=point2.getX();
    		double y2=point2.getY();
    		
    		double distanceX=x1-x2;
    		double distanceY=y1-y2;
    		double hypotenuse=Math.sqrt(Math.pow(distanceX, 2)+Math.pow(distanceY, 2)); // hypotenuse = sqrt( distanceX^2 + distanceY^2 )
    		double theta=Math.asin(distanceY / hypotenuse);
    		double newHypotenuse=hypotenuse-1;
    		
    		double newDistanceX=Math.cos(theta)*newHypotenuse;
    		double newDistanceY=Math.sin(theta)*newHypotenuse;
    		    		
    		double newX2=x1-newDistanceX;
    		double newY2=y1-newDistanceY;
    		
    		point2.setX(newX2);
    		point2.setY(newY2);
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Doubles as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the square of each element and compute the average of all of these values. Your 
     * method will then return the square of this average
     */
    public static double q2(ArrayList<Double> array)
    {
    		
    		double total=0.0;
    		int size=array.size();
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			total=total+array.get(i);
    			
    		}
    		
    		double average=total/size;
    		return average;
    		
    }
    
    
    
    /**
     * q3: Write a public class named XYPoint with 2 private instance variables named x and y 
     * each of type double. You may add any other methods, variables, or constructors to this 
     * class. Then, in the Problem Set class, write a public method named agro that takes two 
     * XYPoints as parameters and has return type void. This method will "move" the second 
     * parameter point closer to the first parameter point by a distance of 1.0 in this 
     * 2-dimensional space. If the points are closer than 1.0 to each other then the second point 
     * should be moved to the location of the first point. For example if the input is (3.3, 6.9) 
     * and (2.5, -7.2) then the instance variables of the second point will be (2.5566, -6.2016) 
     * after the method executes
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
    
    
    public class fromJson implements Comparable<fromJson>
    {
    		
    		private String name;
    		private int magnitude;
    		
    		public fromJson(String name, int magnitude)
    		{
    			
    			this.name=name;
    			this.magnitude=magnitude;
    			
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.name+": "+this.magnitude;
    		}
    		
    		public int getIt()
    		{
    			return this.magnitude;
    		}

			@Override
			public int compareTo(fromJson arg0) 
			{
				
				if(this.magnitude>arg0.getIt())
				{
					return 1;
				}
				else if(this.magnitude<arg0.getIt())
				{
					return -1;
				}
				else
				{
					return 0;
				}
				
			}

    		
    }
    
    
    public static ArrayList<fromJson> getAndSort(int input)
    {
    		//TODO: Switch for ProblemSet_wfnichol_0058
    		ArrayList<fromJson> returnList=new ArrayList<fromJson>();
    		String postURL="https://fury.cse.buffalo.edu/ps-api/final";
    		JsonObject postThis=new JsonObject();
    		postThis.add("record_number", input);
    		JsonValue postThisValue=postThis;
    		String postBody=postThisValue+"";
    		
    		System.out.println(postThis);
    		System.out.println(postThisValue);
    		System.out.println(postBody);
    		
    		String postReturn=postRequest(postURL, postBody, true);
    		
    		JsonValue postReturnValue=Json.parse(postReturn);
    		JsonArray postReturnArray=postReturnValue.asArray();
    		
    		System.out.println(postReturn);
    		
    		for(int i=0; i<postReturnArray.size(); i++)
    		{
    			
    			JsonValue currentValue=postReturnArray.get(i);
    			JsonObject currentObject=currentValue.asObject();
    			String currentName=currentObject.get("name").asString();
    			int currentMagnitude=currentObject.get("magnitude").asInt();
    			
    			
    			//TODO: Switch to ProblemSet_wfnichol_0058
    			TestingGrounds58 test = new TestingGrounds58();
    			fromJson toPut=test.new fromJson(currentName, currentMagnitude);
    			
    			returnList.add(toPut);
    			
    		}
    		
    		Collections.sort(returnList);
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named getAndSort that takes an int as a parameter and 
     * returns an ArrayList of any type you choose (Hint: You may want to write your own class 
     * and return an ArrayList of instances of your class). This method will make a POST request 
     * to a server with the url "https://fury.cse.buffalo.edu/ps-api/final" with body text of a 
     * Json string as a properly formatted Json object containing one key with name 
     * "record_number" and value equal to the input parameter of this method. The response from 
     * the server will be a Json array of objects where each object is in the format 
     * {"name":"challenge", "magnitude":11} where magnitude is always an integer. The returned 
     * ArrayList will return instances of any type created by these Json objects such that 1. 
     * They are sorted by "magnitude" in increasing order and 2. When their toString method is 
     * called they return a String in the exact format "name: magnitude" (note the space after 
     * the colon). For example, the instance created by the Json object {"name":"challenge", 
     * "magnitude":11} would return "challenge: 11"
     */
    
    
    
    
    /**
     * q5: Write a public static method named getAndSort that takes an int as a parameter and 
     * returns an ArrayList of any type you choose (Hint: You may want to write your own class 
     * and return an ArrayList of instances of your class). This method will make a POST request 
     * to a server with the url "https://fury.cse.buffalo.edu/ps-api/final" with body text of a 
     * Json string as a properly formatted Json object containing one key with name 
     * "record_number" and value equal to the input parameter of this method. The response from 
     * the server will be a Json array of objects where each object is in the format 
     * {"name":"challenge", "magnitude":11} where magnitude is always an integer. The returned 
     * ArrayList will return instances of any type created by these Json objects such that 1. 
     * They are sorted by "magnitude" in increasing order and 2. When their toString method is 
     * called they return a String in the exact format "name: magnitude" (note the space after 
     * the colon). For example, the instance created by the Json object {"name":"challenge", 
     * "magnitude":11} would return "challenge: 11"
     */
    
    
    
    
    public static void main(String[] args)
    {
        
        /* Test your code here to verify it is correct before submitting */
        TestingGrounds58 test=new TestingGrounds58();
        XYPoint point1=test.new XYPoint(-4.93, -1.8);
        XYPoint point2=test.new XYPoint(4.54, -1.82);
        
        agro(point1, point2);
        
        System.out.println(point2.getX());
        System.out.println(point2.getY());
    		
    		
    		
    }
	
}
