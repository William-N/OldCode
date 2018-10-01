import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProblemSet_wfnichol_0036
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0036 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public static method named componentList_32 that takes no parameters and 
     * returns an ArrayList of JComponents containing a new JLabel, JComboBox, JButton, and a 
     * JTextField
     */
    public static ArrayList<JComponent> componentList_32()
    {
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		JLabel label=new JLabel();
    		JComboBox comboBox=new JComboBox();
    		JButton button=new JButton();
    		JTextField textField=new JTextField();
    		
    		returnList.add(label);
    		returnList.add(comboBox);
    		returnList.add(button);
    		returnList.add(textField);
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q2: Write a public interface named FlashInterface with abstract methods named "piece", 
     * "clue", "insert", "construct", and "kneel" all of which take no parameters and have return 
     * type int. Then write a public class named FlashComparator that implements the Comparator 
     * interface with FlashInterface as the type parameter. Then implement the compare method 
     * such that it will sort instances that implement FlashInterface by the return value of 
     * "construct" in decreasing order when used as the comparator in a call to Collections.sort
     */
    
    public interface FlashInterface
    {
    		
    		abstract int piece();
    		abstract int clue();
    		abstract int insert();
    		abstract int construct();
    		abstract int kneel();
    		
    }
    
    public class FlashComparator implements Comparator<FlashInterface>
    {

		@Override
		public int compare(FlashInterface arg0, FlashInterface arg1) 
		{
			
			return 0;
			
		}
    		
    		
    		
    }
    
    
    /**
     * q3: Write a public static method named keyComponents_69 that takes a KeyListener as a 
     * parameter and returns an ArrayList of JComponents containing a new JTextField, and a 
     * JComboBox each with the input KeyListener added to it
     */
    
    public static ArrayList<JComponent> keyComponents_69(KeyListener blah)
    {
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		JTextField textField=new JTextField();
    		JComboBox comboBox=new JComboBox();
    		
    		textField.addKeyListener(blah);
    		comboBox.addKeyListener(blah);
    		
    		returnList.add(textField);
    		returnList.add(comboBox);
    		
    		return returnList;
    		
    }
    
    
    /**
     * q4: Write a public class named BetMouseListener that implements the MouseListener 
     * interface. This class will have a public constructor that takes a JComponent as a 
     * parameter and stores it in an instance variable. Implement the appropriate MouseListener 
     * methods such that the foreground color of the stored JComponent will change to Color.WHITE 
     * when the mouse enters the component, Color.GRAY when the mouse exits the component, and 
     * Color.GREEN when the component is clicked. After the component has been clicked is should 
     * remain with a foreground of Color.GREEN regardless of any mouse actions in the future 
     * (Hint: You can do this with a boolean instance variable that tracks whether of not the 
     * component has been clicked).
     * 
     * Then write a public method in the Problem Set class named mouseComponents_1 that takes no 
     * parameters and returns a new JPanel containing a new JTextField, and a JLabel each with a 
     * different instance of BetMouseListener added to it with itself as the JComponent for the 
     * listener. That is, when calling the constructor for BetMouseListener the input should be 
     * the component to which the instance will be added.
     * 
     * You can/should add this JPanel to a JFrame in your main method to verify the proper 
     * functionality
     */
    public class BetMouseListener implements MouseListener
    {
    		
    		private JComponent component;
    		private boolean check=false;
    		
    		public BetMouseListener(JComponent blah)
    		{
    			this.component=blah;
    		}

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				
				this.component.setBackground(Color.green);
				check=true;
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				if(check==false)
				this.component.setBackground(Color.white);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				if(check==false)
				this.component.setBackground(Color.gray);				
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
    
    public JPanel mouseComponents_1()
    {
    		
    		JPanel panel=new JPanel();
    		JTextField textfield=new JTextField();
    		JLabel label=new JLabel();
    		
    		textfield.addMouseListener(new BetMouseListener(textfield));
    		label.addMouseListener(new BetMouseListener(label));
    		
    		panel.add(textfield);
    		panel.add(label);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named addComponents_36 that takes an ArrayList of 
     * JComponents as a parameter and returns a new JPanel containing all the components from the 
     * input ArrayList and a new JComboBox, JLabel, JTextField, and a JButton
     */
    public static JPanel addComponents_36(ArrayList<JComponent> blah)
    {
    		
    		JPanel panel=new JPanel();
    		
    		for(int i=0; i<blah.size(); i++)
    		{
    			
    			panel.add(blah.get(i));
    			
    		}
    		
    		panel.add(new JComboBox());
    		panel.add(new JLabel());
    		panel.add(new JTextField());
    		panel.add(new JButton());
    		
    		return panel;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        ProblemSet_wfnichol_0036 outerInstance = new ProblemSet_wfnichol_0036();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
