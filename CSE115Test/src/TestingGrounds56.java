import java.util.ArrayList;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class TestingGrounds56 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0056 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public class named FaultThree with private instance variables named "modern" 
     * of type boolean, "relevant" of type String, "exotic" of type int, and "alien" of type int. 
     * Then write a public method inside the FaultThree class named "toJsonString" that takes no 
     * parameters and returns a String. The returned String will be a properly formatted Json 
     * object representing this instance of FaultThree where the keys of the Json object are the 
     * instance variable names and the values are their current values
     */
    public class FaultThree
    {
    		
    		private boolean modern;
    		private String relevant;
    		private int exotic;
    		private int alien;
    		
    		public FaultThree(boolean modern, String relevant, int exotic, int alien)
    		{
    			
    			this.modern=modern;
    			this.relevant=relevant;
    			this.exotic=exotic;
    			this.alien=alien;
    			
    		}
    		
    		public String toJsonString()
    		{
    			
    			JsonObject object=new JsonObject();
    			object.add("modern", this.modern);
    			object.add("relevant", this.relevant);
    			object.add("exotic", this.exotic);
    			object.add("alien", this.alien);
    			
    			return object+"";
    			
    		}
    		
    }
    
    
    
    /**
     * q2: Write a public class named AchievementFour with private instance variables named 
     * "cold" of type int, "stable" of type int, "preliminary" of type int, "elderly" of type 
     * int, and "correspondent" of type int. Then write a public method inside the 
     * AchievementFour class named "fromJsonString" that takes a String as a parameter and has 
     * return type void. This method will parse the input String as a properly formatted Json 
     * object representing the values for the instance of AchievementFour where the keys of the 
     * Json object are the instance variable names and the values are the values to which they 
     * should be set
     */
    public class AchievementFour
    {
    		
    		private int cold;
    		private int stable;
    		private int preliminary;
    		private int elderly;
    		private int correspondent;
    		
    		public AchievementFour(int cold, int stable, int preliminary, int elderly, int correspondent)
    		{
    			
    			this.cold=cold;
    			this.stable=stable;
    			this.preliminary=preliminary;
    			this.elderly=elderly;
    			this.correspondent=correspondent;
    			
    		}
    		
    		public void setCold(int cold)
    		{
    			this.cold=cold;
    		}
    		public void setStable(int stable)
    		{
    			this.stable=stable;
    		}
    		public void setPreliminary(int preliminary)
    		{
    			this.preliminary=preliminary;
    		}
    		public void setElderly(int elderly)
    		{
    			this.elderly=elderly;
    		}
    		public void setCorrespondent(int correspondent)
    		{
    			this.correspondent=correspondent;
    		}
    		
    		
    		public void fromJsonString(String jsonString)
    		{
    			
    			JsonValue jsonValue=Json.parse(jsonString);
    			JsonObject jsonObject=jsonValue.asObject();
    			
    			setCold(jsonObject.get("cold").asInt());
    			setStable(jsonObject.get("stable").asInt());
    			setPreliminary(jsonObject.get("preliminary").asInt());
    			setElderly(jsonObject.get("elderly").asInt());
    			setCorrespondent(jsonObject.get("correspondent").asInt());
    			
    		}
    		
    }
    
    
    
    /**
     * q3: Write a public static method named jsonArray_452 that takes no parameters and returns 
     * a String. The returned String will be a properly formatted JSON string representing an 
     * array with the values false of type boolean, "early insert" of type string, -7.27 of type 
     * number, and false of type boolean in this order
     */
    public static String jsonArray_452()
    {
    		
    		JsonArray array=new JsonArray();
    		array.add(false);
    		array.add("early insert");
    		array.add(-7.27);
    		array.add(false);
    		
    		return array+"";
    		
    }
    
    
    
    /**
     * q4: Write a public class named FoldFive with private instance variables named "civil" of 
     * type double, "fresh" of type int, and "uncertain" of type int.
     * 
     * Then write a public method inside the Problem Set class named "parseFoldFive" that takes a 
     * String as a parameter and returns an ArrayList of FoldFive. This method will parse the 
     * input String as a properly formatted Json array of objects where each object represents 
     * the values for the instance of FoldFive where the keys of each Json object are the 
     * instance variable names and the values are the values to which they should be set. Return 
     * an ArrayList of instances of FoldFive with the instance variables matching the values from 
     * the Json objects. The order of instances in the ArrayList must match the order of objects 
     * in the Json array
     */
    public class FoldFive
    {
    		
    		private double civil;
    		private int fresh;
    		private int uncertain;
    		
    		public FoldFive(double civil, int fresh, int uncertain)
    		{
    			
    			this.civil=civil;
    			this.fresh=fresh;
    			this.uncertain=uncertain;
    			
    		}
    		
    }
    
    
    public ArrayList<FoldFive> parseFoldFive(String jsonString)
    {
    		
    		ArrayList<FoldFive> returnList=new ArrayList<FoldFive>();
    		JsonValue jsonValue=Json.parse(jsonString);
    		JsonArray jsonArray=jsonValue.asArray();
    		
    		for(int i=0; i<jsonArray.size(); i++)
    		{
    			
    			JsonObject jsonObject=jsonArray.get(i).asObject();
    			double civil=jsonObject.get("civil").asDouble();
    			int fresh=jsonObject.get("fresh").asInt();
    			int uncertain=jsonObject.get("uncertain").asInt();
    			
    			FoldFive currentObject=new FoldFive(civil, fresh, uncertain);
    			returnList.add(currentObject);
    		}
    		
    		return returnList;
    		
    }
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of Strings as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the length of each element and compute the sum of all of these values. Your 
     * method will then return the cube root of this sum
     */
    public static double q5(ArrayList<String> array)
    {
    		
    		double length=0;
    	
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			if(array.get(i).length()>length)
    			{
    				
    				length=length+array.get(i).length();
    				
    			}
    			
    		}
    		
    		return Math.cbrt(length);
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0056 outerInstance = new ProblemSet_wfnichol_0056();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
