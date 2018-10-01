import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class ProblemSet_wfnichol_0057
{
    
    
    /**
     * q1: Write a public static method named topK that takes and ArrayList of Integers and an 
     * int (k) as a parameters and returns an ArrayList of Integers. 
     * 
     * The returned ArrayList will 
     * contain the top k largest values from the input ArrayList in order without duplicates. 
     * Example: If the input ArrayList contains [7,12,2,3,9,12,-4,7,7] and the int input is 3 
     * this method will return [12,9,7]
     */
    public static ArrayList<Integer> topK(ArrayList<Integer> array, int k)
    {
    		//TESTED!!!
    		ArrayList<Integer> returnList=new ArrayList<Integer>();
    		
    		Collections.sort(array);
    		Collections.reverse(array);
    		    		
    		for(int i=0; i<k; i++)
    		{
    			
    			if(returnList.contains(array.get(i)))
    			{
    				
    				k++;
    				
    			}
    			else
    			{
    				
    				returnList.add(array.get(i));
    				
    			}
    			
    		}
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q2: Write a public class named Person with two private instance variables named age of 
     * type int and opinionStrength of type double. You may add any other variables, methods, or 
     * constructors to this class. Then in the Problem Set class write a public method named 
     * generateHistogram that takes an ArrayList of people and a String as parameters and returns 
     * a HashMap of String to Integer. The returned HashMap will represent a histogram for an age 
     * demographic determined by the input String using the chart below
     * 
     * teen: 13-18
     * adult: 19-64
     * senior: 65+
     * 
     * For example, if the input String is "teen" then the method only considers people from age 
     * 13 through 18 in the histogram. Then categorize their opinion strengths in the HashMap 
     * according to this chart
     * 
     * low: < 40.0
     * medium: >= 40.0 and < 120.0
     * strong: >= 120.0 and < 180.0
     * extreme: >= 180.0
     * 
     * The returned HashMap with have these 4 Strings ("low", "medium", "strong", "extreme") as 
     * keys mapping to the number of people with each opinion strength in the target age 
     * demographic
     */
    public class Person
    {
    		//TESTED!!!
    		private int age;
    		private double opinionStrength;
    		
    		Person(int age, double opinionStrength)
    		{
    			
    			this.age=age;
    			this.opinionStrength=opinionStrength;
    			
    		}
    		
    		public int getAge()
    		{
    			return this.age;
    		}
    		
    		public double getOpinionStrength()
    		{
    			return this.opinionStrength;
    		}
    		
    }
    
    
    public HashMap<String, Integer> generateHistogram(ArrayList<Person> array, String ageGroup)
    {

    		int lowBound=0;
    		int highBound=0;
    		HashMap<String, Integer> returnList=new HashMap<String, Integer>();
    		int lowCounter=0;
    		int mediumCounter=0;
    		int strongCounter=0;
    		int extremeCounter=0;
    		
    		if(ageGroup.equals("teen"))
    		{
    			
    			lowBound=13;
    			highBound=18;
    			
    		}
    		else if(ageGroup.equals("adult"))
    		{
    			
    			lowBound=19;
    			highBound=64;
    			
    		}
    		else if(ageGroup.equals("senior"))
    		{
    			
    			lowBound=65;
    			highBound=Integer.MAX_VALUE;
    			
    		}
    		else 
    		{
    			return null;
    		}
    		
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			Person currentValue=array.get(i);
    			
    			if(currentValue.getAge()>=lowBound && currentValue.getAge()<=highBound)
    			{
    				
    				double opinion=array.get(i).getOpinionStrength();
    				
    				if(opinion<40.0)
    				{
    					lowCounter++;
    				}
    				else if(opinion>=40.0 && opinion<120.0)
    				{
    					mediumCounter++;
    				}
    				else if(opinion>=120.0 && opinion<180.0)
    				{
    					strongCounter++;
    				}
    				else if(opinion>=180)
    				{
    					extremeCounter++;
    				}
    				
    			}
    			
    			
    		}
    		
    		returnList.put("low", lowCounter);
    		returnList.put("medium", mediumCounter);
    		returnList.put("strong", strongCounter);
    		returnList.put("extreme", extremeCounter);
    		
    		return returnList;
    		
    }
    
    
    /**
     * q3: Write a public static method named getAndSort that takes an int as a parameter and 
     * returns an ArrayList of any type you choose (Hint: You may want to write your own class 
     * and return an ArrayList of instances of your class).
     * 
     *  This method will make a POST request 
     * to a server with the url "https://fury.cse.buffalo.edu/ps-api/final" with body text of a 
     * Json string as a properly formatted Json object containing one key with name 
     * "record_number" and value equal to the input parameter of this method. 
     * 
     * The response from 
     * the server will be a Json array of objects where each object is in the format 
     * {"name":"challenge", "magnitude":11} where magnitude is always an integer. 
     * 
     * The returned ArrayList will return instances of any type created by these Json objects such that: 
     * 
     * 1. They are sorted by "magnitude" in increasing order and,
     * 
     * 2. When their toString method is 
     * 	  called they return a String in the exact format "name: magnitude" (note the space after 
     * 	  the colon). For example, the instance created by the Json object {"name":"challenge", 
     *    "magnitude":11} would return "challenge: 11"
     */
    public static String getRequest(String url)
    {
    		
    		String response="";
    		
    		try
    		{
    			
    			response=Request.Get(url).execute().returnContent().asString();
    			
    		}
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    		return response;
    		
    }
    
    
    public static String postRequest(String url, String body, boolean json)
    {
    		
    		String response="";
    		
    		try
    		{
    			
    			ContentType type=ContentType.DEFAULT_TEXT;
    			if(json)
    			{
    				
    				type=ContentType.APPLICATION_JSON;
    				
    			}
    			
    			response=Request.Post(url).bodyString(body, type).execute().returnContent().asString();
    			
    			
    		}
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    		return response;
    		
    }
    
    
    public class fromJson
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
    		
    }
    
    
    public static ArrayList<fromJson> getAndSort(int parameter)
    {
    		//TODO: Switch for ProblemSet_wfnichol_0057
    		ArrayList<fromJson> returnList=new ArrayList<fromJson>();
    		String postURL="https://fury.cse.buffalo.edu/ps-api/final";
    		JsonObject postThis=new JsonObject();
    		postThis.add("record_number", parameter);
    		String postBody=postThis+"";
    		
    		String postReturn=postRequest(postURL, postBody, true);
    		
    		JsonValue postReturnValue=Json.parse(postReturn);
    		JsonArray postReturnArray=postReturnValue.asArray();
    		
    		for(int i=0; i<postReturnArray.size(); i++)
    		{
    			
    			JsonValue currentValue=postReturnArray.get(i);
    			JsonObject currentObject=currentValue.asObject();
    			String currentName=currentObject.get("name").asString();
    			int currentMagnitude=currentObject.get("magnitude").asInt();
    			
    			
    			//TODO: Switch to ProblemSet_wfnichol_0057
    			ProblemSet_wfnichol_0057 test = new ProblemSet_wfnichol_0057();
    			fromJson toPut=test.new fromJson(currentName, currentMagnitude);
    			
    			returnList.add(toPut);
    			
    		}
    		
    		return returnList;
    		
    }
    
    
    
    
    
    /**
     * q4: Write a public static method named modes that takes a String as a parameter and 
     * returns an ArrayList of Integers. The input String is the name of a CSV file with an 
     * unknown number of columns where every value is a well-formed int. There is no header line 
     * in this file. This method will return all modes from all the ints in this file.
     * 
     * Recall that mode is the value that appears most often in the data set, however it's 
     * possible that multiple values appear most often. In this method, all such modes will be 
     * returned. For example, if the input file contains
     * 
     * 3,5,4,1
     * 2,9,3,0
     * -6,5,14,0
     * 
     * This method would return an ArrayList with the values [3,0,5]
     */
    public static ArrayList<Integer> modes(String fileName)
    {
    		//TESTED!!!
    		HashMap<Integer,Integer> countNumbers=new HashMap<Integer,Integer>();
    		ArrayList<Integer> inFile=new ArrayList<Integer>();
    		ArrayList<Integer> returnList=new ArrayList<Integer>();
    		int highestAppearance=0;
    	
    		try
    		{
    			
    			for(String line: Files.readAllLines(Paths.get(fileName)))
    			{
    				
    				String[] currentValues=line.split(",");
    				
    				for(int ii=0; ii<currentValues.length; ii++)
    				{
    					
    					inFile.add(Integer.parseInt(currentValues[ii]));
    					
    				}
    				
    			}
    			
    		}
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    		
    		for(int i=0; i<inFile.size(); i++)
    		{
    			
    			if(!countNumbers.containsKey(inFile.get(i)))
    			{
    				countNumbers.put(inFile.get(i), 1);
    			}
    			else if(countNumbers.containsKey(inFile.get(i)))
    			{
    				int counter=countNumbers.get(inFile.get(i));
    				counter++;
    				
    				countNumbers.replace(inFile.get(i), counter);
    			}
    			
    		}
    		
    		
    		for(int key: countNumbers.keySet())
    		{
    			
    			if(highestAppearance<countNumbers.get(key))
    			{
    				
    				returnList=new ArrayList<Integer>();
        			highestAppearance=countNumbers.get(key);
        			returnList.add(key);
    				
    			}
    			else if(highestAppearance==countNumbers.get(key))
    			{
    				returnList.add(key);
    			}
    			
    		}
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q5: Write a public class named XYPoint with 2 private instance variables named x and y 
     * each of type double. You may add any other methods, variables, or constructors to this 
     * class. Then, in the Problem Set class, write a public method named agro that takes two 
     * XYPoints as parameters and has return type void. 
     * 
     * This method will "move" the second 
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
    		//NOT SURE IF IT WORKS LMAO...
    		double x1=point1.getX();
    		double y1=point1.getY();
    		double x2=point2.getX();
    		double y2=point2.getY();
    		
    		double distanceX=Math.abs(x1-x2);
    		double distanceY=Math.abs(y1-y2);
    		double hypotenuse=Math.sqrt(Math.pow(distanceX, 2)+Math.pow(distanceY, 2)); // hypotenuse = sqrt( distanceX^2 + distanceY^2 )
    		double theta=Math.asin(distanceY / hypotenuse);
    		double newHypotenuse=hypotenuse-1;
    		
    		System.out.println(hypotenuse);
    		System.out.println(distanceY);
    		System.out.println(theta);
    		
    		double newDistanceX=Math.cos(theta)*newHypotenuse;
    		double newDistanceY=Math.sin(theta)*newHypotenuse;
    		
    		System.out.println(newDistanceX);
    		System.out.println(newDistanceY);
    		
    		double newX2=newDistanceX-x1;
    		double newY2=newDistanceY-y1;
    		
    		point2.setX(newX2);
    		point2.setY(newY2);
    		
    }
    
    
    
    
    public static void main(String[] args)
    {
    		
    		ProblemSet_wfnichol_0057 outerInstance = new ProblemSet_wfnichol_0057();
    		
//    	ProblemSet_wfnichol_0057
    	
        /* Test your code here to verify it is correct before submitting */
    	
    		//Code for question 1, tested!!!
    		//ArrayList<Integer> array=new ArrayList<Integer>();
    		//array.add(5);
    		//array.add(12);
    		//array.add(-4);
    		//array.add(-43);
    		//array.add(23);
    		//array.add(23);
    		//array.add(12);
    		
    		//System.out.println(topK(array, 3));
    		
    		
    		//Code for question 3, tested!!!
    		//System.out.println(getAndSort(4));
        
    		
    		//Code for question 2, tested!!!
    		//ArrayList<Person> array2=new ArrayList<Person>();
    		//array2.add(test.new Person(18,23));
    		//array2.add(test.new Person(44,32));
    		//array2.add(test.new Person(22,54));
    		//array2.add(test.new Person(36,87));
    		//array2.add(test.new Person(87,85));
    		
    		//HashMap<String, Integer> testthis=generateHistogram(array2, "adult");
    		//System.out.println(testthis.get("low"));
    		
    		//Code for question 4, tested!!!
    		//System.out.println(modes("src/test.csv"));
    	
		//TestingGrounds57 test = new TestingGrounds57();
		//XYPoint point1 = test.new XYPoint(1.0, 1.0);
		//XYPoint point2 = test.new XYPoint(3.0, 3.0);
		
		//agro(point1,point2);
		
		//System.out.println(point2.getX());
		//System.out.println(point2.getY());
    		
    }
}
