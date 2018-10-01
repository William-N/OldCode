import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestingGrounds34 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0034 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and has return type 
     * void. In this method, you may assume there is a file named "properties.csv" with lines in 
     * the format "name,representative,ready,fewer,blanket" where "name" is a String and all 
     * other values are well-formed integers. There is no header line in this file. This method 
     * will create a new file named "output.csv" in the format "name,ready" containing only these 
     * two columns from "properties.csv" and only for lines with a name of "get", "base", 
     * "trace", or "broker"
     */
    public static void q1()
    {
    	
    		String readFileName="properties.csv";
    		String writeFileName="output.csv";
    		String writeLineValues="";
    		
    		try
    		{
    			
        		for(String line: Files.readAllLines(Paths.get(readFileName)))
        		{
        			
        			String[] lineValues=new String[5];
        			lineValues=line.split(",");
        			
        			if(lineValues[0].equals("get")||lineValues[0].equals("base")||lineValues[0].equals("trace")||lineValues[0].equals("broker"))
        			{
        				
        				writeLineValues=writeLineValues+lineValues[0]+","+lineValues[2]+"\n";
        				
        			}
        			
        		}    			
    			
    		}

    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    		try
    		{
    			
    			Files.write(Paths.get(writeFileName), writeLineValues.getBytes());
    			
    		}
    		
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    }
    
    
    
    /**
     * q2: Create a public class named "Size" with private instance variables "away", 
     * "optimistic", and "democratic" each of type int. You may add any other methods and 
     * variables you'd like to this class.
     * 
     * Outside of Size (in the Problem Set class) write a public static method named "sortSize" 
     * that takes an ArrayList of Sizes as a parameter and returns void. This method will sort 
     * the input by the variable "optimistic" in decreasing order
     */
    public class Size implements Comparable<Size>
    {
    		
    		private int away;
    		private int optimistic;
    		private int democratic;
    		
			@Override
			public int compareTo(Size arg0) 
			{
				
				if(this.optimistic<arg0.getOptimistic())
				{
					
					return 1;
					
				}
				
				else
				{
					
					return -1;
					
				}
				
			}
			
			public int getOptimistic()
			{
				return this.optimistic;
			}
			
    		
    }
    
    public static void sortSize(ArrayList<Size> toSort)
    {
    		
		Collections.sort(toSort);
    		
    }
    
    
    
    /**
     * q3: Write a public interface named VeteranInterface with 2 abstract methods named "leaf" 
     * and "ruin" both of which take no parameters and have return type double. Then write a 
     * public class named InnovationImplementingClass that implements VeteranInterface. In the 
     * InnovationImplementingClass class write a constructor that takes 1 double as a parameter 
     * and stores this value in an instance variable, implement the leaf method to return the 
     * square root of this double, and implement the ruin method to return the absolute value of 
     * this double. Both methods should be public
     */
    public interface VeteranInterface
    {
    		
    		public double leaf();
    		public double ruin();
    		
    }
    
    public class InnovationImplementingClass implements VeteranInterface
    {
    		
    		private double one;
    		
    		public InnovationImplementingClass(double one)
    		{
    			
    			this.one=one;
    			
    		}
    		
		@Override
		public double leaf() 
		{
			
			return Math.sqrt(this.one);
			
		}

		@Override
		public double ruin() 
		{
			
			return Math.abs(this.one);
			
		}
    		
    		
    		
    }
    
    
    
    /**
     * q4: Write a public abstract class named DetailAbstractClass with a constructor that takes 
     * 1 double as a parameter and stores this value in a protected (as opposed to private) 
     * instance variable, and 2 public methods named "plan" and "love" both of which take no 
     * parameters and have return type double. The plan method must be implemented in 
     * DetailAbstractClass to return the absolute value of the double provided in the 
     * constructor, while love must be abstract. Then write a public class named 
     * DateExtendingClass that extends DetailAbstractClass. In DateExtendingClass implement the 
     * love method to return the square root of the double provided in the constructor.
     * 
     * Note that since DateExtendingClass extend DetailAbstractClass it will inherit both the 
     * constructor and instance variable (since the variable is protected instead of private) so 
     * there is no need to code these in DateExtendingClass. However since there is no default 
     * constructor you must explicitly define a constructor that takes a double and calls 
     * super(x) where x is the parameter double
     */
    public abstract class DetailAbstractClass
    {
    	
    		protected double one;
    		
    		DetailAbstractClass(double one)
    		{
    			
    			this.one=one;
    			
    		}
    		
    		public double plan()
    		{
    			
    			return Math.abs(this.one);
    			
    		}
    		
    		public abstract double love();
    		
    }
    
    public class DateExtendingClass extends DetailAbstractClass
    {

		DateExtendingClass(double one) 
		{
			
			super(one);
			
		}

		@Override
		public double love() 
		{
			return Math.sqrt(this.one);
		}
    		
    		
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 3 JLabels with the phrases "present confrontation" and 
     * "fundamental aisle" each on a separate JLabel. The last JLabel will contain the image 
     * located at the url 
     * "https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png"
     */
    public static JPanel q5()
    {
    		
    		JPanel panel=new JPanel();
    		String longURL="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
    		ImageIcon image=null;
    		
    		try
    		{
    			
    			URL url=new URL(longURL);
    			image=new ImageIcon(url);
    			
    		}
    		catch(MalformedURLException ex)
    		{
    			
    			
    			
    		}
    		
    		JLabel label1=new JLabel();
    		JLabel label2=new JLabel();
    		JLabel label3=new JLabel(image);
    		
    		label1.setText("present confrontation");
    		label2.setText("fundamental aisle");
    		
    		panel.add(label1);
    		panel.add(label2);
    		panel.add(label3);
    		
    		return panel;
    		
    }
    
    
    
	public static void main(String[] args)
	{
		
	}
	
}
