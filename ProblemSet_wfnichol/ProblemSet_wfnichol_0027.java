import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_wfnichol_0027
{
    
    
    /**
     * Note: This problem set you will use inner classes by defining custom classes inside the 
     * ProblemSet_wfnichol_0027 class. This is only done so you can submit multiple classes a 
     * single java file on AutoLab. In most cases it is better practice to define each class in a 
     * separate file instead of using inner classes.
     * 
     * For labs and project you will write your classes in separate files and submit a single jar 
     * file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public class named Compound with the following
     * -A public constructor that takes 4 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'b' from the instance variable storing the 
     * String that was the second parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the second String will not contain any instances of 'b'
     */
    public class Compound
    {
    	
    		private String one;
    		private String two;
    		private String three;
    		private String four;
    		
    		public Compound(String one, String two, String three, String four)
    		{
    			
    			this.one=one;
    			this.two=two;
    			this.three=three;
    			this.four=four;
    			
    		}
    		
    		public void replaceChar()
    		{
    			this.two=this.two.replace("b","");
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.one+" "+this.two+" "+this.three+" "+this.four;
    		}
    	
    }
    
    
    
    /**
     * q2: Write a public class named Foreigner with the following public getter (accessor) and 
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
    		
    		public int getOn()
    		{
    			return this.on;
    		}
    		
    		public void setOn(int on)
    		{
    			this.on=on;
    		}
    		
    		public HashMap<String, Double> getSunny()
    		{
    			return this.sunny;
    		}
    		
    		public void setSunny(HashMap<String, Double> sunny)
    		{
    			this.sunny=sunny;
    		}
    		
    		public ArrayList<Integer> getCenter()
    		{
    			return this.center;
    		}
    		
    		public void setCenter(ArrayList<Integer> center)
    		{
    			this.center=center;
    		}
    }
    
    
    
    /**
     * q3: Write a public class named Corner with the following
     * -A public constructor that takes 3 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'j' from the instance variable storing the 
     * String that was the second parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the second String will not contain any instances of 'j'
     */
    public class Corner
    {
    	
    		private String one;
    		private String two;
    		private String three;
    		
    		public void replaceChar()
    		{
    			this.two=this.two.replace("j", "");
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.one+" "+this.two+" "+this.three;
    		}
    		
    }
    
    
    
    /**
     * q4: Write a public class named Associate with the following public getter (accessor) and 
     * setter (modifier) methods in the standard format shown in class such that after calling 
     * one of the setter methods with a particular value the corresponding getter method will 
     * return the same value in each instance (object) of the class. You will need to create 
     * instance variables in the Associate class to achieve this functionality.
     * getter: "getSacred"  setter: "setSacred"  type: "double"
     * getter: "getFundamental"  setter: "setFundamental"  type: "String"
     * getter: "getUncomfortable"  setter: "setUncomfortable"  type: "HashMap<String, Double>"
     */
    public class Associate
    {
    	
    		private double sacred;
    		private String fundamental;
    		private HashMap<String, Double> uncomfortable;
    		
    		public void setSacred(double sacred)
    		{
    			this.sacred=sacred;
    		}
    		
    		public double getSacred()
    		{
    			return this.sacred;
    		}
    		
    		public void setFundamental(String fundamental)
    		{
    			this.fundamental=fundamental;
    		}
    		
    		public String getFundamental()
    		{
    			return this.fundamental;
    		}
    		
    		public void setUncomfortable(HashMap<String, Double> uncomfortable)
    		{
    			this.uncomfortable=uncomfortable;
    		}
    		
    		public HashMap<String, Double> getUncomfortable()
    		{
    			return this.uncomfortable;
    		}
    		
    }
    
    
    
    /**
     * q5: Write a public class named Landing with the following.
     * -A public constructor that takes 2 doubles as inputs.
     * -A public method named compute that takes no parameters and returns the the tangent of the 
     * first constructor input subtracted by the the sine of the second constructor input as a 
     * double. You will need to store the constructor input in instance variables to be able to 
     * access them in the compute method
     */
    public class Landing
    {
    		
    		private double one;
    		private double two;
    		
    		public Landing(double one, double two)
    		{
    			this.one=one;
    			this.two=two;
    		}
    		
    		public double compute()
    		{
    			return Math.tan(one)-Math.sin(two);
    		}
    		
    		
    }
    
    
    
    public static void main(String[] args){
        
        /* Use the following syntax to instantiate your inner class for testing */
        ProblemSet_wfnichol_0027 outerInstance = new ProblemSet_wfnichol_0027();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }

}
