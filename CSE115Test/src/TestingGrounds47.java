import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestingGrounds47 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0047 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Create a public class named "Record" with private instance variables "existing", 
     * "blanket", and "traditional" each of type int. You may add any other methods and variables 
     * you'd like to this class.
     * 
     * Outside of Record (in the Problem Set class) write a public static method named 
     * "sortRecord" that takes an ArrayList of Records as a parameter and returns void. This 
     * method will sort the input by the variable "traditional" in increasing order
     */
    public class Record
    {
    		
    		private int existing;
    		private int blanket;
    		private int traditional;
    		
    		public int getTraditional()
    		{
    			
    			return this.traditional;
    			
    		}
    		
    }
    
    
    public static void sortRecord(ArrayList<Record> input)
    {
    		
    		ArrayList<Integer> toSort=new ArrayList<Integer>();
    		ArrayList<Record> returnList=new ArrayList<Record>();
    		
    		for(int i=0; i<input.size(); i++)
    		{
    			
    			toSort.add(input.get(i).getTraditional());
    			
    		}
    		
    		Collections.sort(toSort);
    		
    		for(int i=0; i<toSort.size(); i++)
    		{
    			
    			for(int j=0; j<input.size(); j++)
    			{
    				
    				if(toSort.get(i)==input.get(j).getTraditional())
    				{
    					
    					returnList.add(input.get(j));
    					
    				}
    				
    			}
    			
    		}
    		
    		input=returnList;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 4 JLabels with the phrases "corporate investor", "remote 
     * bush", and "awful highway" each on a separate JLabel. The last JLabel will contain the 
     * image located at the url 
     * "https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png"
     */
    public static JPanel q2()
    {
    		
    		JPanel returnPanel=new JPanel();
    		String url="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
    		ImageIcon image = null;
    		
    		try {
				URL link=new URL(url);
				image=new ImageIcon(url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
    		
    		JLabel label1=new JLabel();
    		JLabel label2=new JLabel();
    		JLabel label3=new JLabel();
    		JLabel label4=new JLabel(image);
    		
    		label1.setText("corporate investor");
    		label2.setText("remote bush");
    		label3.setText("awful highway");
    		
    		returnPanel.add(label1);
    		returnPanel.add(label2);
    		returnPanel.add(label3);
    		returnPanel.add(label4);
    		
    		return returnPanel;
    		
    }
    
    
    
    /**
     * q3: Write a public class named ChaosMouseListener that implements the MouseListener 
     * interface. This class will have a public constructor that takes a JTextArea and a JLabel 
     * as parameters and stores these in instance variables. Override the mouseEntered method to 
     * display the text from the JTextArea on the JLabel in all upper case letters. Then, 
     * override the mouseExited method to display the text from the JTextArea on the JLabel in 
     * all lower case letters. The other three methods from the MouseListener interface can be 
     * left empty
     */
    public class ChaosMouseListener implements MouseListener
    {
    		
    		private JTextArea textArea;
    		private JLabel label;
    		
    		public ChaosMouseListener(JTextArea textArea, JLabel label)
    		{
    			
    			this.textArea=textArea;
    			this.label=label;
    			
    		}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				this.label.setText(this.textArea.getText().toUpperCase());
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				this.label.setText(this.textArea.getText().toLowerCase());
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
    		
    }
    
    
    
    /**
     * q4: Write a public interface named OperationInterface with 2 abstract methods named "dam" 
     * and "edge" both of which take no parameters and have return type double. Then write a 
     * public class named FocusImplementingClass that implements OperationInterface. In the 
     * FocusImplementingClass class write a constructor that takes 1 double as a parameter and 
     * stores this value in an instance variable, implement the dam method to return the cube of 
     * this double, and implement the edge method to return the square root of this double. Both 
     * methods should be public
     */
    public interface OperationInterface
    {
    		
    		abstract double dam();
    		abstract double edge();
    		
    }
    
    
    public class FocusImplementingClass implements OperationInterface
    {
    	
    		private double input;
    		
    		public FocusImplementingClass(double input)
    		{
    			
    			this.input=input;
    			
    		}
    		
    	
		@Override
		public double dam() {
			return Math.cbrt(this.input);
		}

		@Override
		public double edge() {
			return Math.sqrt(this.input);
		}
    		
    		
    		
    }
    
    
    /**
     * q5: Write a public abstract class named AllyAbstractClass with a constructor that takes 1 
     * double as a parameter and stores this value in a protected (as opposed to private) 
     * instance variable, and 2 public methods named "catalog" and "mix" both of which take no 
     * parameters and have return type double. The catalog method must be implemented in 
     * AllyAbstractClass to return the square root of the double provided in the constructor, 
     * while mix must be abstract. Then write a public class named WarExtendingClass that extends 
     * AllyAbstractClass. In WarExtendingClass implement the mix method to return the cube of the 
     * double provided in the constructor.
     * 
     * Note that since WarExtendingClass extend AllyAbstractClass it will inherit both the 
     * constructor and instance variable (since the variable is protected instead of private) so 
     * there is no need to code these in WarExtendingClass. However since there is no default 
     * constructor you must explicitly define a constructor that takes a double and calls 
     * super(x) where x is the parameter double
     */
    public abstract class AllyAbstractClass
    {
    		
    		protected double input;
    		
    		public AllyAbstractClass(double input)
    		{
    			
    			this.input=input;
    			
    		}
    		
    		public double catalog()
    		{
    			
    			return Math.sqrt(this.input);
    			
    		}
    		
    		abstract public double mix();
    		
    }
    
    
    public class WarExtendingClass extends AllyAbstractClass
    {

		public WarExtendingClass(double input) {
			super(input);
		}

		@Override
		public double mix() {
			return Math.cbrt(this.input);
		}
    		
    		
    		
    }
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0047 outerInstance = new ProblemSet_wfnichol_0047();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
