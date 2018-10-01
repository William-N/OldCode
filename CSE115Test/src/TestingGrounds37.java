import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestingGrounds37 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0037 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public class named AcquisitionMouseListener that implements the MouseListener 
     * interface. This class will have a public constructor that takes a JComponent as a 
     * parameter and stores it in an instance variable. Implement the appropriate MouseListener 
     * methods such that the foreground color of the stored JComponent will change to Color.WHITE 
     * when the mouse enters the component, Color.GRAY when the mouse exits the component, and 
     * Color.PINK when the component is clicked. After the component has been clicked is should 
     * remain with a foreground of Color.PINK regardless of any mouse actions in the future 
     * (Hint: You can do this with a boolean instance variable that tracks whether of not the 
     * component has been clicked).
     * 
     * Then write a public method in the Problem Set class named mouseComponents_607 that takes 
     * no parameters and returns a new JPanel containing a new JComboBox, JTextField, and a 
     * JLabel each with a different instance of AcquisitionMouseListener added to it with itself 
     * as the JComponent for the listener. That is, when calling the constructor for 
     * AcquisitionMouseListener the input should be the component to which the instance will be 
     * added.
     * 
     * You can/should add this JPanel to a JFrame in your main method to verify the proper 
     * functionality
     */
    public class AcquisitionMouseListener implements MouseListener
    {
    		
    		private JComponent component;
    		private boolean check=true;
    	
    		public AcquisitionMouseListener(JComponent component)
    		{
    			
    			this.component=component;
    			
    		}

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				this.component.setBackground(Color.pink);
				check=false;				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				if(check)
				{
					
					this.component.setBackground(Color.white);				

				}
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				if(check)
				{
					
					this.component.setBackground(Color.gray);			
					
				}
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) 
			{
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) 
			{
				
			}
    		
    }
    
    
    public JPanel mouseComponents_607()
    {
    		
		JPanel panel=new JPanel();
		JComboBox comboBox=new JComboBox();
		JTextField textfield=new JTextField();
		JLabel label=new JLabel();
		
		comboBox.addMouseListener(new AcquisitionMouseListener(comboBox));
		textfield.addMouseListener(new AcquisitionMouseListener(textfield));
		label.addMouseListener(new AcquisitionMouseListener(label));
		
		panel.add(comboBox);
		panel.add(textfield);
		panel.add(label);
		
		return panel;
    		
    }
    
    
    /**
     * q2: Write a public abstract class named MentorAbstractClass with a constructor that takes 
     * 1 double as a parameter and stores this value in a protected (as opposed to private) 
     * instance variable, and 2 public methods named "launch" and "brush" both of which take no 
     * parameters and have return type double. The launch method must be implemented in 
     * MentorAbstractClass to return the square root of the double provided in the constructor, 
     * while brush must be abstract. Then write a public class named MobileExtendingClass that 
     * extends MentorAbstractClass. In MobileExtendingClass implement the brush method to return 
     * the tangent of the double provided in the constructor.
     * 
     * Note that since MobileExtendingClass extend MentorAbstractClass it will inherit both the 
     * constructor and instance variable (since the variable is protected instead of private) so 
     * there is no need to code these in MobileExtendingClass. However since there is no default 
     * constructor you must explicitly define a constructor that takes a double and calls 
     * super(x) where x is the parameter double
     */
    public abstract class MentorAbstractClass
    {
    		
    		protected double one;
    		
	    	MentorAbstractClass(double one)
	    	{
	    		
	    		this.one=one;
	    		
	    	}
	    	
	    	public double launch()
	    	{
	    		
	    		return Math.sqrt(this.one);
	    		
	    	}
	    	
	    	abstract public double brush();

    		
    }
    
    
    public class MobileExtendingClass extends MentorAbstractClass
    {

		MobileExtendingClass(double x) 
		{
			super(x);
		}

		@Override
		public double brush() 
		{
			
			return Math.tan(this.one);
			
		}
	    	
    }
    
    
    
    /**
     * q3: Write a public static method named componentList_8 that takes no parameters and 
     * returns an ArrayList of JComponents containing a new JTextField, JTextArea, and a JButton
     */
    public static ArrayList<JComponent> componentList_8()
    {
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		
    		returnList.add(new JTextField());
    		returnList.add(new JTextArea());
    		returnList.add(new JButton());
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named addComponents_3 that takes an ArrayList of 
     * JComponents as a parameter and returns a new JPanel containing all the components from the 
     * input ArrayList and a new JButton, and a JTextArea
     */
    public static JPanel addComponents_3(ArrayList<JComponent> list)
    {
    		
    		JPanel panel=new JPanel();
    		
    		for(int i=0; i<list.size(); i++)
    		{
    			
    			panel.add(list.get(i));
    			
    		}
    		
    		panel.add(new JButton());
    		panel.add(new JTextArea());
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q5: Write a public interface named TeenagerInterface with abstract methods named "remain", 
     * "consume", "mark", "space", and "derive" all of which take no parameters and have return 
     * type int. Then write a public class named TeenagerComparator that implements the 
     * Comparator interface with TeenagerInterface as the type parameter. Then implement the 
     * compare method such that it will sort instances that implement TeenagerInterface by the 
     * return value of "remain" in increasing order when used as the comparator in a call to 
     * Collections.sort
     */
    public interface TeenagerInterface
    {
    		
    		abstract int remain();
    		abstract int consume();
    		abstract int mark();
    		abstract int space();
    		abstract int derive();
    		
    }
    
    public class TeenagerComparator implements Comparator<TeenagerInterface>
    {

		@Override
		public int compare(TeenagerInterface arg0, TeenagerInterface arg1) 
		{
			if(arg0.remain()>arg1.remain())
				return -1;
			else return 1;
			
		}
    		
    		
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0037 outerInstance = new ProblemSet_wfnichol_0037();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
	
	
	
}
