import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestingGrounds33 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0033 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public class named SharkListener that implements the ActionListener interface. 
     * This class will have a public constructor that takes a JTextField and a JLabel as 
     * parameters and stores these in instance variables. Override the actionPerformed method to 
     * interpret the text on the JTextField as an x-value (as a double) and display the 
     * corresponding y-value on the JLabel for the line with slope -1.17 and y-intercept 14.98.
     * 
     * Note that creating classes that implement listener interfaces we can add the same 
     * functionality to multiple components by creating multiple instances of this class. For 
     * example, if we want 3 buttons that will compute y-values for this line with x-values from 
     * different text fields we can instantiate this class 3 times and attach each instance to a 
     * different button.
     */
    public class SharkListener implements ActionListener
    {

    		private JTextField text;
    		private JLabel label;
    		
    		public SharkListener(JTextField text, JLabel label)
    		{
    			
    			this.text=text;
    			this.label=label;
    			
    		}
    		
    		
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{

			try
			{
				double x=Double.parseDouble(text.getText());
				double y=0.0;
				double slope=-1.17;
				double y_int=14.98;
				
				y=(slope*x)+y_int;
				
				label.setText(""+y);				
			}
			catch(NumberFormatException ex)
			{
				
			}

			
		}
    		
    		
    		
    }
    
    
    
    /**
     * q2: Create a public class named "Housing" with private instance variables "perceived" and 
     * "liberal" each of type int. You may add any other methods and variables you'd like to this 
     * class.
     * 
     * Outside of Housing (in the Problem Set class) write a public static method named 
     * "sortHousing" that takes an ArrayList of Housings as a parameter and returns void. This 
     * method will sort the input by the variable "liberal" in increasing order
     */
    public class Housing implements Comparable<Housing>
    {
    		
    		private int perceived;
    		private int liberal;
    		
    		public Housing(int one, int two)
    		{
    			perceived=one;
    			liberal=two;
    		}
    		
    		@Override
    		public int compareTo(Housing arg0) 
    		{
    			
    			if(this.liberal<arg0.getLiberal()) 
    			{
    				System.out.println(this.toString() + " was less than " + arg0.toString());
//    				return this.starting;
    				return -1;
    			}
    			else 
    			{
    				System.out.println(this.toString() + " was bigger than " + arg0.toString());
//    				return arg0.starting;
    				return 1;
    			}
    		}
    		
    		public int getLiberal()
    		{
    			return this.liberal;
    		}
    		
    		public int getPerceived()
    		{
    			return this.perceived;
    		}
    		
    		public String toString()
    		{
    			return ""+this.liberal;
    		}
    		
    }
    
    
    
    public static void sortHousing(ArrayList<Housing> toSort)
	{
		Collections.sort(toSort);
		
		for (Housing r : toSort)
		{
			System.out.println(r);
		}

	}
    
    
    
    /**
     * q3: Write a public class named ReaderMouseListener that implements the MouseListener 
     * interface. This class will have a public constructor that takes a JTextField and a JLabel 
     * as parameters and stores these in instance variables. Override the mouseEntered method to 
     * display the text from the JTextField on the JLabel in all upper case letters. Then, 
     * override the mousePressed method to display the text from the JTextField on the JLabel in 
     * all lower case letters. The other three methods from the MouseListener interface can be 
     * left empty
     */
    public class ReaderMouseListener implements MouseListener
    {
    		
    		private JTextField text;
    		private JLabel label;
    		
    		public ReaderMouseListener(JTextField text, JLabel label)
    		{
    			
    			this.text=text;
    			this.label=label;
    			
    		}

		@Override
		public void mouseClicked(MouseEvent arg0) 
		{
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) 
		{
			
			label.setText(text.getText().toUpperCase());
			
		}

		@Override
		public void mouseExited(MouseEvent arg0)
		{
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) 
		{
			
			label.setText(text.getText().toLowerCase());
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) 
		{
			
		}
    		
    }
    
    
    
    /**
     * q4: Write a public interface named ConservationInterface with 2 abstract methods named 
     * "fuel" and "belly" both of which take no parameters and have return type double. Then 
     * write a public class named FeelImplementingClass that implements ConservationInterface. In 
     * the FeelImplementingClass class write a constructor that takes 1 double as a parameter and 
     * stores this value in an instance variable, implement the fuel method to return the sine of 
     * this double, and implement the belly method to return the square of this double. Both 
     * methods should be public
     */
    public interface ConservationInterface
    {
    		
    		public abstract double fuel();
    		public abstract double belly();
    		
    }
    
    
    public class FeelImplementingClass implements ConservationInterface
    {

    		private double one;
    		
    		FeelImplementingClass(double one)
    		{
    			this.one=one;
    		}
    		
		@Override
		public double fuel() 
		{
			return Math.sin(this.one);
		}

		@Override
		public double belly() 
		{
			return Math.sqrt(this.one);
		}
    		
    		
    		
    }
    
    
    /**
     * q5: Write a public abstract class named DrinkingAbstractClass with a constructor that 
     * takes 1 double as a parameter and stores this value in a protected (as opposed to private) 
     * instance variable, and 2 public methods named "steel" and "contrast" both of which take no 
     * parameters and have return type double. The steel method must be implemented in 
     * DrinkingAbstractClass to return the absolute value of the double provided in the 
     * constructor, while contrast must be abstract. Then write a public class named 
     * ProcessingExtendingClass that extends DrinkingAbstractClass. In ProcessingExtendingClass 
     * implement the contrast method to return the sine of the double provided in the 
     * constructor.
     * 
     * Note that since ProcessingExtendingClass extend DrinkingAbstractClass it will inherit both 
     * the constructor and instance variable (since the variable is protected instead of private) 
     * so there is no need to code these in ProcessingExtendingClass. However since there is no 
     * default constructor you must explicitly define a constructor that takes a double and calls 
     * super(x) where x is the parameter double
     */
    public abstract class DrinkingAbstractClass
    {
    		
    		protected double one;
    		
    		DrinkingAbstractClass(double one)
    		{
    			this.one=one;
    		}
    		
    		public double steel()
    		{
    			return Math.abs(this.one);
    		}
    		
    		public abstract double contrast();
    		
    }
    
    public class ProcessingExtendingClass extends DrinkingAbstractClass
    {

		ProcessingExtendingClass(double one) 
		{
			
			super(one);
			
		}
    		
    		public double contrast()
    		{
    			
    			return Math.sin(this.one);
    			
    		}
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
		/* Use the following syntax to instantiate your inner class for testing */
		TestingGrounds33 outerInstance = new TestingGrounds33();
		//InnerClassName innerInstance = outerInstance.new InnerClassName();
		Housing innerInstance=outerInstance.new Housing(3,3);
		Housing innerInstance1=outerInstance.new Housing(5,5);
		Housing innerInstance2=outerInstance.new Housing(2,2);
		Housing innerInstance3=outerInstance.new Housing(1,1);
		Housing innerInstance4=outerInstance.new Housing(8,8);
		/* Test your code here to verify it is correct before submitting */
		ArrayList<Housing> sortIt=new ArrayList<Housing>();
		sortIt.add(innerInstance);
		sortIt.add(innerInstance1);
		sortIt.add(innerInstance2);
		sortIt.add(innerInstance3);
		sortIt.add(innerInstance4);
		
		System.out.println(sortIt);
		
		sortHousing(sortIt);
		
		System.out.println(sortIt);
        
    }

}
