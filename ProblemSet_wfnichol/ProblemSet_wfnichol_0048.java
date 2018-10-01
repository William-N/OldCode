import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ProblemSet_wfnichol_0048
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0048 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 4 JLabels with the phrases "missionary wire", "billion 
     * retail", and "satellite singer" each on a separate JLabel. The last JLabel will contain 
     * the image located at the url 
     * "https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png"
     */
    public static JPanel q1()
    {
    		
    		JPanel returnPanel=new JPanel();
    		ImageIcon image=null;
    		
    		try
    		{
    			
    			String urlString="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
    			URL url=new URL(urlString);
    			image=new ImageIcon(url);
    			
    			
    		}
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    		
    		JLabel label1=new JLabel();
    		label1.setText("missionary wire");
    		JLabel label2=new JLabel();
    		label2.setText("billion retail");
    		JLabel label3=new JLabel();
    		JLabel label4=new JLabel(image);
    		
    		
    		returnPanel.add(label1);
    		returnPanel.add(label2);
    		returnPanel.add(label3);
    		returnPanel.add(label4);
    		
    		return returnPanel;
    		
    }
    
    
    
    /**
     * q2: Write a public interface named DuckInterface with 2 abstract methods named "rice" and 
     * "equip" both of which take no parameters and have return type double. Then write a public 
     * class named GazeImplementingClass that implements DuckInterface. In the 
     * GazeImplementingClass class write a constructor that takes 1 double as a parameter and 
     * stores this value in an instance variable, implement the rice method to return the cosine 
     * of this double, and implement the equip method to return the sine of this double. Both 
     * methods should be public
     */
    public interface DuckInterface
    {
    		
    		abstract double rice();
    		abstract double equip();
    		
    }
    
    
    public class GazeImplementingClass implements DuckInterface
    {
    		
    		private double input;
    		
    		public GazeImplementingClass(double input)
    		{
    			
    			this.input=input;
    			
    		}
    		
    		
		@Override
		public double rice() {
			return Math.cos(this.input);
		}

		@Override
		public double equip() {
			return Math.sin(this.input);
		}
    		
    		
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 2 input components as follows:
     * -A JTextField with 6 columns
     * -A JTextArea with 5 rows and 26 columns
     */
    public static JPanel q3()
    {
    		
    		JPanel returnPanel=new JPanel();
    		returnPanel.add(new JTextField(6));
    		returnPanel.add(new JTextArea(5,26));
    		
    		return returnPanel;
    		
    }
    
    
    
    /**
     * q4: Write a public abstract class named PublicationAbstractClass with a constructor that 
     * takes 1 double as a parameter and stores this value in a protected (as opposed to private) 
     * instance variable, and 2 public methods named "retail" and "till" both of which take no 
     * parameters and have return type double. The retail method must be implemented in 
     * PublicationAbstractClass to return the tangent of the double provided in the constructor, 
     * while till must be abstract. Then write a public class named SillyExtendingClass that 
     * extends PublicationAbstractClass. In SillyExtendingClass implement the till method to 
     * return the square root of the double provided in the constructor.
     * 
     * Note that since SillyExtendingClass extend PublicationAbstractClass it will inherit both 
     * the constructor and instance variable (since the variable is protected instead of private) 
     * so there is no need to code these in SillyExtendingClass. However since there is no 
     * default constructor you must explicitly define a constructor that takes a double and calls 
     * super(x) where x is the parameter double
     */
    public abstract class PublicationAbstractClass
    {
    		
    		protected double input;
    		
    		PublicationAbstractClass(double input)
    		{
    			
    			this.input=input;
    			
    		}
    		
    		public double retail()
    		{
    			
    			return Math.tan(this.input);
    			
    		}
    		
    		public abstract double till();
    		
    }
    
    
    public class SillyExtendingClass extends PublicationAbstractClass
    {

		SillyExtendingClass(double input) {
			super(input);
		}

		@Override
		public double till() {
			return Math.sqrt(this.input);
		}
    	
    		
    	
    }
    
    
    /**
     * q5: Create a public class named "Processing" with private instance variables "excited", 
     * "rubber", and "secure" each of type int. You may add any other methods and variables you'd 
     * like to this class.
     * 
     * Outside of Processing (in the Problem Set class) write a public static method named 
     * "sortProcessing" that takes an ArrayList of Processings as a parameter and returns void. 
     * This method will sort the input by the variable "rubber" in increasing order
     */
    public class Processing
    {
    		
    		private int rubber;
    		private int secure;
    		
    		public Processing(int rubber, int secure)
    		{
    			
    			this.rubber=rubber;
    			this.secure=secure;
    			
    		}
    		
    		public int getRubber()
    		{
    			return this.rubber;
    		}
    		public int getSecure()
    		{
    			return this.secure;
    		}
    }
    
    
    public static void sortProcessing(ArrayList<Processing> inputArray)
    {
    		
    		Collections.sort(inputArray, new Comparator<Processing>()
    				{
    			
    			public int compare(Processing element1, Processing element2)
    			{
    				
    				return Integer.compare(element1.getRubber(),(element2.getRubber()));
    				
    			}
    			
    				});
    		
    }
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        ProblemSet_wfnichol_0048 outerInstance = new ProblemSet_wfnichol_0048();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
