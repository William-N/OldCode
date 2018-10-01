import java.nio.file.StandardOpenOption; 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.HashMap;

public class TestingGrounds29 
{


    
    
    /**
     * Note: This problem set you will use inner classes by defining custom classes inside the 
     * ProblemSet_wfnichol_0029 class. This is only done so you can submit multiple classes a 
     * single java file on AutoLab. In most cases it is better practice to define each class in a 
     * separate file instead of using inner classes.
     * 
     * For labs and project you will write your classes in separate files and submit a single jar 
     * file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and has return type 
     * void. In this method, you may assume there is a file named "properties.csv" with lines in 
     * the format "name,front,negative" where "name" is a String and all other values are 
     * well-formed integers. There is no header line in this file. This method will create a new 
     * file named "output.csv" in the format "name,front" containing only these two columns from 
     * "properties.csv" and only for lines with a name of "lunch", "pace", or "onion"
     */
    
    public static void q1()
    {
    	
    		String fileName="properties.csv";
    		String returnFileName="output.csv";
    		    		
    		try
    		{
        		for(String line: Files.readAllLines(Paths.get(fileName)))
        		{
        			String[] blah=new String[3];
        			blah=line.split(",");
        			
        			if(blah[0].equals("lunch")||blah[0].equals("pace")||blah[0].equals("onion"))
        			{
        				if(Files.exists(Paths.get(returnFileName)))
        				{
        					String insert=blah[0]+","+blah[1];
        					
        					Files.write(Paths.get(returnFileName), insert.getBytes());
        				}
        				else
        				{
        					String insert=blah[0]+","+blah[1];
        					
        					Files.write(Paths.get(returnFileName), insert.getBytes(), StandardOpenOption.APPEND);
        				}
        			}
        		}
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    }
    
    
    /**
     * q2: Write a public class named Expense with the following public getter (accessor) and 
     * setter (modifier) methods in the standard format shown in class such that after calling 
     * one of the setter methods with a particular value the corresponding getter method will 
     * return the same value in each instance (object) of the class. You will need to create 
     * instance variables in the Expense class to achieve this functionality.
     * getter: "getElectric"  setter: "setElectric"  type: "int"
     * getter: "getProtective"  setter: "setProtective"  type: "HashMap<String, Double>"
     */
    
    public class Expense
    {
    	
    		private int electric;
    		private HashMap<String, Double> protective;
    		
    		public void setElectric(int electric)
    		{
    			this.electric=electric;
    		}
    		
    		public int getElectric()
    		{
    			return this.electric;
    		}
    		
    		public void setProtective(HashMap<String, Double> protective)
    		{
    			this.protective=protective;
    		}
    		
    		public HashMap<String, Double> getProtective()
    		{
    			return this.protective;
    		}
    		
    }
    
    
    /**
     * q3: Write a public class named Scramble with the following.
     * -A public constructor that takes 2 doubles as inputs.
     * -A public method named compute that takes no parameters and returns the the square root of 
     * the first constructor input divided by the the tangent of the second constructor input as 
     * a double. You will need to store the constructor input in instance variables to be able to 
     * access them in the compute method
     */
    
    public class Scramble
    {
    	
    		private double one;
    		private double two;
    		
    		public Scramble(double one, double two)
    		{
    			this.one=one;
    			this.two=two;
    		}
    		
    		public double compute()
    		{
    			return Math.sqrt(one)/Math.tan(two);
    		}
    		
    }
    
    
    /**
     * q4: Write a public class named Least with the following
     * -A public constructor that takes 3 Strings. The Strings should be stored in instance 
     * variables
     * -A public method named replaceChar that takes no parameters and has return type void. This 
     * method removes all instances of the character 'k' from the instance variable storing the 
     * String that was the third parameter in the constructor call
     * -An overridden toString method that returns the stored strings separated by spaces. This 
     * includes all the Strings from the constructor call and if replaceChar was called on this 
     * instance then the third String will not contain any instances of 'k'
     */
    
    public class Least
    {
    	
    		private String one;
    		private String two;
    		private String three;
    		
    		public Least(String one, String two, String three)
    		{
    			this.one=one;
    			this.two=two;
    			this.three=three;
    		}
    		
    		public void replaceChar()
    		{
    			this.three=this.three.replace("k", "");
    		}
    		
    		@Override
    		public String toString()
    		{
    			return this.one+" "+this.two+" "+this.three;
    		}
    		
    }
    
    
    /**
     * q5: Write a public static method named q5 that takes a String as a parameter and has 
     * return type int. The input String will be the name a csv file in the format 
     * "best,abstract,fundamental,powerful,crack,curious,impossible" where all values are 
     * well-formed integers. There is no header line in this file. This method will return the 
     * sum of the values in the "best" column as an int.
     */
    
    public static int q5(String fileName)
    {
    	
    		int returnValue=0;
    		
    		try
    		{
        		for(String line: Files.readAllLines(Paths.get(fileName)))
        		{
        			String[] blah=new String[7];
        			blah=line.split(",");
        			
        			returnValue=returnValue+Integer.parseInt(blah[0]);
        		}
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    		return returnValue;
    		
    }
	
}
