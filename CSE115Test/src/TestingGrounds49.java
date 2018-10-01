import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestingGrounds49 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0049 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 3 JLabels with the phrases "talented steel" and "fixed 
     * small" each on a separate JLabel. The last JLabel will contain the image located at the 
     * url 
     * "https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png"
     */
    public static JPanel q1()
    {
    		
    		ImageIcon image=null;
    		String urlString="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
    		JPanel panel=new JPanel();
    		JLabel label1=new JLabel();
    		JLabel label2=new JLabel();
    		
    		try
    		{
    			
        		URL url=new URL(urlString);
        		image=new ImageIcon(url);
	
    		}
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    		JLabel label3=new JLabel(image);
    		label1.setText("talented steel");
    		label2.setText("fixed small");
    		
    		panel.add(label1);
    		panel.add(label2);
    		panel.add(label3);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain the following three Components: A JComboBox of Strings 
     * with the options "consume", "mess", "broadcast", and "horn" in this order, a JLabel, and a 
     * JButton that when clicked sets the text of the JLabel to the selected value of the 
     * JComboBox
     */
    public static JPanel q2()
    {
    		
    		JPanel panel=new JPanel();
    		JComboBox<String> comboBox=new JComboBox<String>();
    		String consume="consume";
    		String mess="mess";
    		String broadcast="broadcast";
    		String horn="horn";
    		    		
    		comboBox.addItem(consume);
    		comboBox.addItem(mess);
    		comboBox.addItem(broadcast);
    		comboBox.addItem(horn);
    		
    		JLabel label=new JLabel();
    		JButton button=new JButton();
    		button.addActionListener(new ActionListener()
    				{

					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
						
						String currentOption=comboBox.getItemAt(comboBox.getSelectedIndex());
						label.setText(currentOption);
						
					}
    			
    				});
    		
    		panel.add(comboBox);
    		panel.add(label);
    		panel.add(button);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a JPanel. 
     * The panel will contain 1 JTextField with any number of columns, 1 JButton with any label, 
     * and 1 JLabel. The panel will have functionality such that when a user enters a number into 
     * the text field (we'll call this value x) and presses the button the label will display the 
     * y-value of a parabola in standard form (https://www.desmos.com/calculator/zukjgk9iry) 
     * where a=10.3, b=-4.19, and c=-8.25 at the x-value from the text field
     * 
     * Hint: If you store y in the wrapper class Double instead of the primitive double you can 
     * call toString on it to convert it to a string that can be used as the text for the label
     * Tip: After clicking the button you may have to resize your window to see the result since 
     * the frame will not automatically resize to fit the new text
     */
    public static JPanel q3()
    {
    		
    		JPanel panel=new JPanel();
    		JTextField textField=new JTextField();
    		JButton button=new JButton("blah");
    		JLabel label=new JLabel();
    		
    		button.addActionListener(new ActionListener()
    				{

						@Override
						public void actionPerformed(ActionEvent arg0) {
							label.setText(textField.getText());
						}
    			
    			
    			
    				});
    		
    		panel.add(textField);
    		panel.add(label);
    		panel.add(button);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q4: Create a public class named "Interview" with private instance variables "soft", 
     * "patient", and "illegal" each of type int. You may add any other methods and variables 
     * you'd like to this class.
     * 
     * Outside of Interview (in the Problem Set class) write a public static method named 
     * "sortInterview" that takes an ArrayList of Interviews as a parameter and returns void. 
     * This method will sort the input by the variable "soft" in decreasing order
     */
    public class Interview
    {
    		
    		private int soft;
    		private int patient;
    		private int illegal;
    		
    		public Interview(int soft,int patient, int illegal)
    		{
    			
    			this.soft=soft;
    			this.patient=patient;
    			this.illegal=illegal;
    			
    		}
    		
    }
    
    
    public static void sortInterview(ArrayList<Interview> input)
    {
    		
    		Collections.sort(input, new Comparator<Interview>()
    				{
    			
    			@Override
    			public int compare(Interview arg0, Interview arg1)
    			{
    				
    				if(arg0.soft>arg1.soft)
    				{
    					return -1;
    				}
    				else if(arg0.soft<arg1.soft)
    				{
    					return 1;
    				}
    				else
    					return 0;
    				
    			}
    			
    				});
    		
    }
    
    
    /**
     * q5: Write a public abstract class named ActiveAbstractClass with a constructor that takes 
     * 1 double as a parameter and stores this value in a protected (as opposed to private) 
     * instance variable, and 2 public methods named "shell" and "move" both of which take no 
     * parameters and have return type double. The shell method must be implemented in 
     * ActiveAbstractClass to return the sine of the double provided in the constructor, while 
     * move must be abstract. Then write a public class named BarrierExtendingClass that extends 
     * ActiveAbstractClass. In BarrierExtendingClass implement the move method to return the 
     * square of the double provided in the constructor.
     * 
     * Note that since BarrierExtendingClass extend ActiveAbstractClass it will inherit both the 
     * constructor and instance variable (since the variable is protected instead of private) so 
     * there is no need to code these in BarrierExtendingClass. However since there is no default 
     * constructor you must explicitly define a constructor that takes a double and calls 
     * super(x) where x is the parameter double
     */
    public abstract class ActiveAbstractClass
    {
    		
    		protected double value;
    		
    		public ActiveAbstractClass(double input)
    		{
    			
    			this.value=input;
    			
    		}
    		
    		public double shell()
    		{
    			
    			return Math.sin(this.value);
    			
    		}
    		
    		abstract public double move();
    		
    }
    
    
    public class BarrierExtendingClass extends ActiveAbstractClass
    {

		public BarrierExtendingClass(double input) {
			super(input);
		}

		@Override
		public double move() {
			return Math.pow(this.value, 2);
		}
    		
    		
    		
    }
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0049 outerInstance = new ProblemSet_wfnichol_0049();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
