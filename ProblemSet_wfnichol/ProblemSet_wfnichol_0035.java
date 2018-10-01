import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ProblemSet_wfnichol_0035
{


    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0035 class. This is only done so you can submit multiple 
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
    		
    		JLabel label=new JLabel();
    		JComboBox comboBox=new JComboBox();
    		JButton button=new JButton();
    		JTextField textField=new JTextField();
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		
    		returnList.add(label);
    		returnList.add(comboBox);
    		returnList.add(button);
    		returnList.add(textField);
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named addComponents_61 that takes an ArrayList of 
     * JComponents as a parameter and returns a new JPanel containing all the components from the 
     * input ArrayList and a new JLabel, JButton, and a JTextArea
     */
    public static JPanel addComponents_61(ArrayList<JComponent> blah)
    {
    		
    		JPanel returnPanel=new JPanel();
    		JLabel label=new JLabel();
    		JButton button=new JButton();
    		JTextArea textArea=new JTextArea();
    		
    		for(int i=0; i<blah.size(); i++)
    		{
    			
    			returnPanel.add(blah.get(i));
    			
    		}
    		
    		returnPanel.add(label);
    		returnPanel.add(button);
    		returnPanel.add(textArea);
    		
    		return returnPanel;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named addComponents_68 that takes an ArrayList of 
     * JComponents as a parameter and returns a new JPanel containing all the components from the 
     * input ArrayList and a new JLabel, JButton, and a JComboBox
     */
    public static JPanel addComponents_68(ArrayList<JComponent> blah)
    {
    		
		JPanel returnPanel=new JPanel();
		JLabel label=new JLabel();
		JButton button=new JButton();
		JComboBox comboBox=new JComboBox();
		
		for(int i=0; i<blah.size(); i++)
		{
			
			returnPanel.add(blah.get(i));
			
		}
		
		returnPanel.add(label);
		returnPanel.add(button);
		returnPanel.add(comboBox);
		
		return returnPanel;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named keyComponents_0 that takes a KeyListener as a 
     * parameter and returns an ArrayList of JComponents containing a new JTextArea, JComboBox, 
     * JLabel, and a JButton each with the input KeyListener added to it
     */
    public static ArrayList<JComponent> keyComponents_0(KeyListener blah)
    {
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		JTextArea textArea=new JTextArea();
    		JComboBox comboBox=new JComboBox();
    		JLabel label=new JLabel();
    		JButton button=new JButton();
    		
    		textArea.addKeyListener(blah);
    		comboBox.addKeyListener(blah);
    		label.addKeyListener(blah);
    		button.addKeyListener(blah);
    		
    		returnList.add(textArea);
    		returnList.add(comboBox);
    		returnList.add(label);
    		returnList.add(button);
    		
    		return returnList;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named componentList_16 that takes no parameters and 
     * returns an ArrayList of JComponents containing a new JComboBox, JTextField, JLabel, and a 
     * JButton
     */
    public static ArrayList<JComponent> componentList_16()
    {
    		
    		ArrayList<JComponent> returnList=new ArrayList<JComponent>();
    		JComboBox comboBox=new JComboBox();
    		JTextField textField=new JTextField();
    		JLabel label=new JLabel();
    		JButton button=new JButton();
    		
    		returnList.add(comboBox);
    		returnList.add(textField);
    		returnList.add(label);
    		returnList.add(button);
    		
    		return returnList;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        ProblemSet_wfnichol_0035 outerInstance = new ProblemSet_wfnichol_0035();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
