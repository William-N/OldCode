import java.util.HashMap;
import java.util.ArrayList;

public class ProblemSet_wfnichol_0026
{
    
    
    /**
     * Note: This problem set you will use inner classes by defining custom classes inside the 
     * ProblemSet_wfnichol_0026 class. This is only done so you can submit multiple classes a 
     * single java file on AutoLab. In most cases it is better practice to define each class in a 
     * separate file instead of using inner classes.
     * 
     * For labs and project you will write your classes in separate files and submit a single jar 
     * file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public class named Call with the following
     * -A public constructor that takes 2 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'u' from the instance variable storing the 
     * String that was the first parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the first String will not contain any instances of 'u'
     */
    public class Call
    {
    		
    		private String blah;
    		private String brat;
    		
    		public Call(String blah, String brat)
    		{
    			
    			this.blah=blah;
    			this.brat=brat;
    		}
    		
    		public void replaceChar()
    		{
    			this.blah=this.blah.replace("u", "");
    			
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.blah+" "+this.brat;
    		}
    }
    
    
    
    /**
     * q2: Write a public class named Delay with the following
     * -A public constructor that takes 2 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'f' from the instance variable storing the 
     * String that was the second parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the second String will not contain any instances of 'f'
     */
    public class Delay
    {
    	
    		private String blah;
    		private String brat;
    		
    		public Delay(String blah, String brat)
    		{
    			this.blah=blah;
    			this.brat=brat;
    		}
    		
    		public void replaceChar()
    		{
    			this.brat=this.brat.replace("f", "");
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.blah+" "+this.brat;
    		}
    		
    }
    
    
    
    /**
     * q3: Write a public class named Nutrient with the following.
     * -A public constructor that takes 2 doubles as inputs.
     * -A public method named compute that takes no parameters and returns the the tangent of the 
     * first constructor input multiplied by the the tangent of the second constructor input as a 
     * double. You will need to store the constructor input in instance variables to be able to 
     * access them in the compute method
     */
    public class Nutrient
    {
    	
    		private double one;
    		private double two;
    		
    		public Nutrient(double one, double two)
    		{
    			this.one=one;
    			this.two=two;
    		}
    		
    		public double compute()
    		{
    			return Math.tan(one)*Math.tan(two);
    		}
    		
    }
    
    
    
    /**
     * q4: Write a public class named Pale with the following public getter (accessor) and setter 
     * (modifier) methods in the standard format shown in class such that after calling one of 
     * the setter methods with a particular value the corresponding getter method will return the 
     * same value in each instance (object) of the class. You will need to create instance 
     * variables in the Pale class to achieve this functionality.
     * getter: "getBright"  setter: "setBright"  type: "double"
     * getter: "getUnhappy"  setter: "setUnhappy"  type: "String"
     * getter: "getMajor"  setter: "setMajor"  type: "double"
     */
    public class Pale
    {
    	
    		private double bright;
    		private String unhappy;
    		private double major;
    		
    		public void setBright(double bright)
    		{
    			this.bright=bright;
    		}
    		
    		public double getBright()
    		{
    			return this.bright;
    		}
    		
    		public void setUnhappy(String unhappy)
    		{
    			this.unhappy=unhappy;
    		}
    		
    		public String getUnhappy()
    		{
    			return this.unhappy;
    		}
    		
    		public void setMajor(double major)
    		{
    			this.major=major;
    		}
    		
    		public double getMajor()
    		{
    			return this.major;
    		}
    		
    }
    
    
    
    /**
     * q5: Write a public class named Hold with the following public getter (accessor) and setter 
     * (modifier) methods in the standard format shown in class such that after calling one of 
     * the setter methods with a particular value the corresponding getter method will return the 
     * same value in each instance (object) of the class. You will need to create instance 
     * variables in the Hold class to achieve this functionality.
     * getter: "getLegislative"  setter: "setLegislative"  type: "HashMap<String, Double>"
     * getter: "getFleet"  setter: "setFleet"  type: "ArrayList<Double>"
     */
    public class Hold
    {
    		
    		private HashMap<String, Double> legislative;
    		private ArrayList<Double> fleet;
    		
    		public HashMap<String, Double> getLegislative()
    		{
    			return this.legislative;
    		}
    		
    		public void setLegislative(HashMap<String, Double> legislative)
    		{
    			this.legislative=legislative;
    		}
    		
    		public ArrayList<Double> getFleet()
    		{
    			return this.fleet;
    		}
    		
    		public void setFleet(ArrayList<Double> fleet)
    		{
    			this.fleet=fleet;
    		}
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
    	ProblemSet_wfnichol_0026 outerInstance = new ProblemSet_wfnichol_0026();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
