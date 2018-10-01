import java.awt.Color;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestingGrounds38 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0038 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: Write a public interface named EmphasisInterface with abstract methods named "post", 
     * "format", and "people" all of which take no parameters and have return type int. Then 
     * write a public class named EmphasisComparator that implements the Comparator interface 
     * with EmphasisInterface as the type parameter. Then implement the compare method such that 
     * it will sort instances that implement EmphasisInterface by the return value of "people" in 
     * increasing order when used as the comparator in a call to Collections.sort
     */
    public interface EmphasisInterface
    {
    		
    		public abstract int post();
    		public abstract int format();
    		public abstract int people();
    		
    }
    
    public class EmphasisComparator implements Comparator<EmphasisInterface>
    {

		@Override
		public int compare(EmphasisInterface arg0, EmphasisInterface arg1) 
		{
			if(arg0.people()<arg1.people())
			{
				return -1;
			}
			else if(arg0.people()>arg1.people())
			{
				return 1;
			}
			else
			{
				return 0;
			}
			
		}
    		
    		
    		
    }
    
    
    
    /**
     * q2: Write a public class named GoatMouseListener that implements the MouseListener 
     * interface. This class will have a public constructor that takes a JComponent as a 
     * parameter and stores it in an instance variable. Implement the appropriate MouseListener 
     * methods such that the foreground color of the stored JComponent will change to Color.BLACK 
     * when the mouse enters the component, Color.PINK when the mouse exits the component, and 
     * Color.MAGENTA when the component is clicked. After the component has been clicked is 
     * should remain with a foreground of Color.MAGENTA regardless of any mouse actions in the 
     * future (Hint: You can do this with a boolean instance variable that tracks whether of not 
     * the component has been clicked).
     * 
     * Then write a public method in the Problem Set class named mouseComponents_952 that takes 
     * no parameters and returns a new JPanel containing a new JLabel, JComboBox, and a 
     * JTextField each with a different instance of GoatMouseListener added to it with itself as 
     * the JComponent for the listener. That is, when calling the constructor for 
     * GoatMouseListener the input should be the component to which the instance will be added.
     * 
     * You can/should add this JPanel to a JFrame in your main method to verify the proper 
     * functionality
     */
    public class GoatMouseListener implements MouseListener
    {
    		
    		private JComponent componet;
    		private boolean check=true;
    		
    		public GoatMouseListener(JComponent component)
    		{
    			
    			this.componet=component;
    			
    		}

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				this.componet.setForeground(Color.MAGENTA);
				this.check=false;
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				if(check)
				this.componet.setForeground(Color.black);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				if(check)
				this.componet.setForeground(Color.pink);
				
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
    
    public JPanel mouseComponents_952()
    {
    		
		JPanel panel=new JPanel();
		JComboBox comboBox=new JComboBox();
		JTextField textfield=new JTextField();
		JLabel label=new JLabel();
		
		comboBox.addMouseListener(new GoatMouseListener(comboBox));
		textfield.addMouseListener(new GoatMouseListener(textfield));
		label.addMouseListener(new GoatMouseListener(label));
		
		panel.add(comboBox);
		panel.add(textfield);
		panel.add(label);
		
		return panel;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named keyComponents_11 that takes a KeyListener as a 
     * parameter and returns an ArrayList of JComponents containing a new JTextArea, JComboBox, 
     * and a JButton each with the input KeyListener added to it
     */
    public static ArrayList<JComponent> keyComponents_11(KeyListener keyListener)
    {
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		JTextArea textArea=new JTextArea();
    		JComboBox comboBox=new JComboBox();
    		JButton button=new JButton();
    		
    		textArea.addKeyListener(keyListener);
    		comboBox.addKeyListener(keyListener);
    		button.addKeyListener(keyListener);
    		
    		returnList.add(textArea);
    		returnList.add(button);
    		returnList.add(comboBox);
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q4: Write a public abstract class named CasinoAbstractClass with a constructor that takes 
     * 1 double as a parameter and stores this value in a protected (as opposed to private) 
     * instance variable, and 2 public methods named "trade" and "drain" both of which take no 
     * parameters and have return type double. The trade method must be implemented in 
     * CasinoAbstractClass to return the sine of the double provided in the constructor, while 
     * drain must be abstract. Then write a public class named BulkExtendingClass that extends 
     * CasinoAbstractClass. In BulkExtendingClass implement the drain method to return the 
     * tangent of the double provided in the constructor.
     * 
     * Note that since BulkExtendingClass extend CasinoAbstractClass it will inherit both the 
     * constructor and instance variable (since the variable is protected instead of private) so 
     * there is no need to code these in BulkExtendingClass. However since there is no default 
     * constructor you must explicitly define a constructor that takes a double and calls 
     * super(x) where x is the parameter double
     */
    public abstract class CasinoAbstractClass
    {
    		
    		protected double one;
    	
    		public CasinoAbstractClass(double one)
    		{
    			
    			this.one=one;
    			
    		}
    		
    		public double trade()
    		{
    			
    			return Math.sin(this.one);
    			
    		}
    		
    		public abstract double drain();
    		
    }
    
    public class BulkExtendingClass extends CasinoAbstractClass
    {

		public BulkExtendingClass(double one) 
		{
			super(one);

		}

		@Override
		public double drain() 
		{

			return Math.tan(this.one);
			
		}
    		
    		
    		
    }
    
    
    
    /**
     * q5: Write a public class named GrantMouseListener that implements the MouseListener 
     * interface. This class will have a public constructor that takes a JComponent as a 
     * parameter and stores it in an instance variable. Implement the appropriate MouseListener 
     * methods such that the foreground color of the stored JComponent will change to Color.GREEN 
     * when the mouse enters the component, Color.WHITE when the mouse exits the component, and 
     * Color.DARK_GRAY when the component is clicked. After the component has been clicked is 
     * should remain with a foreground of Color.DARK_GRAY regardless of any mouse actions in the 
     * future (Hint: You can do this with a boolean instance variable that tracks whether of not 
     * the component has been clicked).
     * 
     * Then write a public method in the Problem Set class named mouseComponents_570 that takes 
     * no parameters and returns a new JPanel containing a new JComboBox, and a JLabel each with 
     * a different instance of GrantMouseListener added to it with itself as the JComponent for 
     * the listener. That is, when calling the constructor for GrantMouseListener the input 
     * should be the component to which the instance will be added.
     * 
     * You can/should add this JPanel to a JFrame in your main method to verify the proper 
     * functionality
     */
    public class GrantMouseListener implements MouseListener
    {
    		
    		private JComponent component;
    		private boolean check=true;
    		
    		public GrantMouseListener(JComponent component)
    		{
    			
    			this.component=component;
    			
    		}
    		
		@Override
		public void mouseClicked(MouseEvent arg0) 
		{
			this.component.setForeground(Color.DARK_GRAY);
			check=false;
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) 
		{
			if(check)
			this.component.setForeground(Color.green);
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) 
		{
			if(check)
			this.component.setForeground(Color.white);
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) 
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) 
		{
			// TODO Auto-generated method stub
			
		}
    		
    		
    		
    }
    
    public JPanel mouseComponents_570()
    {
    		
    		JPanel panel=new JPanel();
    		JComboBox comboBox=new JComboBox();
    		JLabel label=new JLabel();
    		
    		comboBox.addMouseListener(new GrantMouseListener(comboBox));
    		label.addMouseListener(new GrantMouseListener(label));
    		
    		panel.add(comboBox);
    		panel.add(label);
    		
    		return panel;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0038 outerInstance = new ProblemSet_wfnichol_0038();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
