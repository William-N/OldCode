import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.client.fluent.Request;

public class TestingGrounds59 
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
    
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Integers as a 
     * parameter and returns a double. This method will first iterate over the ArrayList while 
     * computing the square of each element and compute the sum of all of these values. Your 
     * method will then return the square of this sum
     */
    public static double q2(ArrayList<Integer> array)
    {
    		
    		double amount=0.0;
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			double square=Math.pow(array.get(i), 2);
    			amount=amount+square;
    			
    		}
    		
    		return Math.pow(amount, 2);
    		
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
    
    
    
    
    /**
     * q4: Write a public class named XYPoint with 2 private instance variables named x and y 
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
    		//doesnt work :(
    		double x1=point1.getX();
    		double y1=point1.getY();
    		double x2=point2.getX();
    		double y2=point2.getY();
    		
    		double distanceX=x1-x2;											//find side of triangle on x-axis
    		double distanceY=y1-y2;											//find side on triangle on y-axis
    		    		
    		double distance=Math.sqrt(Math.pow(distanceX, 2)+Math.pow(distanceY, 2)); 	// hypotenuse = sqrt( distanceX^2 + distanceY^2 )
    		
    		if(distance<1)																//if distance from points less than 1
    		{
    			
    			point2.setX(point1.getX());												//make point 2
    			point2.setY(point1.getY());												//have values of point 1
    			
    			return;																	
    			
    		}
    		    
    		double ratio=1/distance;														//find ratio by dividing distance by new distance
    		
    		
    		double newX=distanceX*ratio;													//find ratio in relations to x
    		double newY=distanceY*ratio;													//find ratio in relations to y
    		
    		point2.setX(newX+x2);														//
    		point2.setY(newY+y2);
    		    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns a String. 
     * The returned String will be the response from the server after sending a GET request to 
     * the url "https://fury.cse.buffalo.edu/ps-api/type-one/bitter"
     */
    public static String q5()
    {
    		
    		String url="https://fury.cse.buffalo.edu/ps-api/type-one/bitter";
    		
    		return getRequest(url);
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Test your code here to verify it is correct before submitting */
    		//TestingGrounds59 test=new TestingGrounds59();
        //XYPoint point1=test.new XYPoint(3.3, 6.9);
        //XYPoint point2=test.new XYPoint(2.5, -7.2);
        
        //agro(point1, point2);
        
        //System.out.println(point2.getX());
        //System.out.println(point2.getY());
        
    }
	
}
