import java.util.HashMap;
import java.util.ArrayList;

public class TestingGrounds25 
{

    /**
     * q1: Write a public class named Trail with the following.
     * -A public constructor that takes 2 doubles as inputs.
     * -A public method named compute that takes no parameters and returns the the sine of the 
     * first constructor input to the power of the the cosine of the second constructor input as 
     * a double. You will need to store the constructor input in instance variables to be able to 
     * access them in the compute method
     */
    public class Trail
    {
    		
    		private double chanceTheRapper;
    		private double logic;
    	
    		public Trail(double lilUzi, double lilUrt)
    		{
    			
    			chanceTheRapper=lilUzi;
    			logic=lilUrt;
    		}
    		
    		public double compute()
    		{
    			
    			return Math.pow(Math.sin(chanceTheRapper), Math.cos(logic));
    		}
    		
    }
    
    
    
    /**
     * q2: Write a public class named Grain with the following public getter (accessor) and 
     * setter (modifier) methods in the standard format shown in class such that after calling 
     * one of the setter methods with a particular value the corresponding getter method will 
     * return the same value in each instance (object) of the class. You will need to create 
     * instance variables in the Grain class to achieve this functionality.
     * getter: "getMiddle"  setter: "setMiddle"  type: "String"
     * getter: "getArmed"  setter: "setArmed"  type: "double"
     */
    public class Grain
    {
    	
    		private String middle;
    		private double armed;
    		
    		public String getMiddle()
    		{
    			return this.middle;
    		}
    		
    		public void setMiddle(String middle)
    		{
    			this.middle=middle;
    		}
    		
    		public double getArmed()
    		{
    			return this.armed;
    		}
    		
    		public void setArmed(double armed)
    		{
    			this.armed=armed;
    		}
    	
    }
    
    
    
    /**
     * q3: Write a public class named Journalist with the following
     * -A public constructor that takes 2 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'o' from the instance variable storing the 
     * String that was the second parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the second String will not contain any instances of 'o'
     */
    public class Journalist
    {
    	
    		private String blah;
    		private String brat;
    		
    		public Journalist(String blah, String brat)
    		{
    			this.blah=blah;
    			this.brat=brat;
    		}
    		
    		public void replaceChar()
    		{
    			this.brat=this.brat.replace("o", "");
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.blah+" "+this.brat;
    		}
    		
    }
    
    
    
    /**
     * q4: Write a public class named Challenge with the following
     * -A public constructor that takes 2 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'y' from the instance variable storing the 
     * String that was the second parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the second String will not contain any instances of 'y'
     */
    public class Challenge
    {
    	
    		private String blah;
    		private String brat;
    	
    		public Challenge(String blah, String brat)
    		{
    			
    			this.blah=blah;
    			this.brat=brat;
    			
    		}
    		
    		public void replaceChar()
    		{
    		
    			this.brat=this.brat.replace("y", "");
    			
    		}
    	
    		@Override
    		public String toString()
    		{
    			return this.blah+" "+this.brat;
    		}
    		
    }
    
    
    
    /**
     * q5: Write a public class named Foreigner with the following public getter (accessor) and 
     * setter (modifier) methods in the standard format shown in class such that after calling 
     * one of the setter methods with a particular value the corresponding getter method will 
     * return the same value in each instance (object) of the class. You will need to create 
     * instance variables in the Foreigner class to achieve this functionality.
     * getter: "getOn"  setter: "setOn"  type: "int"
     * getter: "getSunny"  setter: "setSunny"  type: "HashMap<String, Double>"
     * getter: "getCenter"  setter: "setCenter"  type: "ArrayList<Integer>"
     */
    public class Foreigner
    {
    	
    		private int on;
    		private HashMap<String, Double> sunny;
    		private ArrayList<Integer> center;
    		
    		public void setOn(int on)
    		{
    			this.on=on;
    		}
    		
    		public int getON()
    		{
    			return this.on;
    		}
    		
    		public void setSunny(HashMap<String, Double> sunny)
    		{
    			this.sunny=sunny;
    		}
    		
    		public HashMap<String, Double> getSunny()
    		{
    			return this.sunny;
    		}
    		
    		public void setCenter(ArrayList<Integer> center)
    		{
    			this.center=center;
    		}
    		
    		public ArrayList<Integer> getCenter()
    		{
    			return this.center;
    		}
    		
    }
    
    
    
	
	public static void main(String[] args) 
	{
		
	}

}
