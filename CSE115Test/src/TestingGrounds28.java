import java.util.ArrayList;

public class TestingGrounds28 
{

    /**
     * Note: This problem set you will use inner classes by defining custom classes inside the 
     * ProblemSet_wfnichol_0028 class. This is only done so you can submit multiple classes a 
     * single java file on AutoLab. In most cases it is better practice to define each class in a 
     * separate file instead of using inner classes.
     * 
     * For labs and project you will write your classes in separate files and submit a single jar 
     * file containing your entire project
     */
    
    
    
    /**
     * q1: *If you haven't already done so in a previous question, write a public class named 
     * "PointXY" with 2 private instance variables named "x" and "y" both of type int. You may 
     * add any other functionality to this class you'd like including constructors, methods, and 
     * other instance variables*
     * 
     * Write a public method outside of PointXY (in the Problem Set class) named getPoints_563 
     * that takes no parameters and returns an ArrayList of PointXY containing the points 
     * [(-75,15), (31,-51), (12,65)]
     */
    public static class PointXY
    {
    	
    		private int x;
    		private int y;
    		
    		public PointXY(int x, int y)
    		{
    			
    			this.x=x;
    			this.y=y;
    			
    		}
    		
    }
    
    public static ArrayList<PointXY> getPoints_563()
    {
    		
    		ArrayList<PointXY> returnList= new ArrayList<PointXY>();
    	
    		PointXY input1= new PointXY(-75, 15);
    		PointXY input2= new PointXY(31, -51);
    		PointXY input3= new PointXY(12, 65);

    		returnList.add(input1);
    		returnList.add(input2);
    		returnList.add(input3);
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q2: Write a public class named Segment with the following.
     * -A public constructor that takes 2 doubles as inputs.
     * -A public method named compute that takes no parameters and returns the the tangent of the 
     * first constructor input multiplied by the the sine of the second constructor input as a 
     * double. You will need to store the constructor input in instance variables to be able to 
     * access them in the compute method
     */
    
    public class Segment
    {
    	
    		private double one;
    		private double two;
    	
    		public Segment(double input1, double input2)
    		{
    			this.one=input1;
    			this.two=input2;
    		}
    		
    		public double compute()
    		{
    			return Math.tan(this.one)*Math.sin(this.two);
    		}
    		
    }
    
    
    /**
     * q3: Write a public class named Aside with the following
     * -A public constructor that takes 4 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 't' from the instance variable storing the 
     * String that was the first parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the first String will not contain any instances of 't'
     */
    
    public class Aside
    {
    	
    		private String one;
    		private String two;
    		private String three;
    		private String four;
    	
    		public Aside(String one, String two, String three, String four)
    		{
    			
    			this.one=one;
    			this.two=two;
    			this.three=three;
    			this.four=four;
    			
    		}
    		
    		public void replaceChar()
    		{
    			this.one=this.one.replace("t", "");
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.one+" "+this.two+" "+this.three+" "+this.four; 
    		}
    		
    }
    
    
    /**
     * q4: *If you haven't already done so in a previous question, write a public class named 
     * "PointXY" with 2 private instance variables named "x" and "y" both of type int. You may 
     * add any other functionality to this class you'd like including constructors, methods, and 
     * other instance variables*
     * 
     * Write a public method outside of PointXY (in the Problem Set class) named closest_22_27 
     * that takes an ArrayList of PointXY as a parameter and returns the PointXY that is closest 
     * to the point (22,27). Use Euclidean distance for distance measurements
     */
    
    public PointXY closest_22_27(ArrayList<PointXY> input)
    {
    		
    		int desiredX=22;
    		int desiredY=27;
    		double returnDistance=Double.MAX_VALUE;
    		int marker=-1;
    		
    		for(int i=0; i<input.size(); i++)
    		{
    			PointXY current=input.get(i);
    			int currentX=current.x;
    			int currentY=current.y;
    			
    			double distance=Math.sqrt(Math.pow(currentX-desiredX,2)+Math.pow(currentY-desiredY,2));
    			
    			if(distance<returnDistance)
    			{
    				returnDistance=distance;
    				marker=i;
    			}
    			
    		}
    		
    		return input.get(marker);
    		
    }
    
    
    /**
     * q5: Write a public class named Cheer with the following
     * -A public constructor that takes 3 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'f' from the instance variable storing the 
     * String that was the second parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the second String will not contain any instances of 'f'
     */
    
    public class Cheer
    {
    	
    		private String one;
    		private String two;
    		private String three;
    	
    		public Cheer(String one, String two, String three)
    		{
    			this.one=one;
    			this.two=two;
    			this.three=three;
    				
    		}
    		
    		public void replaceChar()
    		{
    			this.two=this.two.replace("f","");
    		}
    		
    		
    		@Override
    		public String toString()
    		{
    			return this.one+" "+this.two+" "+this.three;
    		}
    }
	
	public static void main(String[] args)
	{

		
	}

}
