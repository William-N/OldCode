import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestingGrounds31 
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a JPanel. 
     * The panel will contain 1 JTextField with any number of columns, 1 JButton with any label, 
     * and 1 JLabel. The panel will have functionality such that when a user enters a number into 
     * the text field (we'll call this value x) and presses the button the label will display the 
     * y-value of a parabola in standard form (https://www.desmos.com/calculator/zukjgk9iry) 
     * where a=13.22, b=5.82, and c=-9.42 at the x-value from the text field
     * 
     * Hint: If you store y in the wrapper class Double instead of the primitive double you can 
     * call toString on it to convert it to a string that can be used as the text for the label
     * Tip: After clicking the button you may have to resize your window to see the result since 
     * the frame will not automatically resize to fit the new text
     */
    public static JPanel q1()
    {
    		
    		JPanel panel=new JPanel();
    		JTextField text=new JTextField("textfield");
    		JButton button=new JButton("button");
    		JLabel label=new JLabel();
    		
    		button.addActionListener(new ActionListener()
    				{
    			@Override
    			public void actionPerformed(ActionEvent e)
    			{
    				
    				String StringX=text.getText();
    				
    				try
    				{
    					
    					double x=Double.parseDouble(StringX);
    					double a=13.22;
    					double b=5.82;
    					double c=-9.42;
    					double parabola=a*Math.pow(x, 2)+b*x+c;
    					
    					String parabolaString=""+parabola;
    					
    					label.setText(parabolaString);
    				}
    				
    				catch(NumberFormatException ex)
    				{
    					
    				}
    			}
    			
    				});
    		
    		panel.add(text);
    		panel.add(button);
    		panel.add(label);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns a JPanel. 
     * The panel will contain 1 JTextField with any number of columns, 1 JButton with any text, 
     * and 1 JLabel which will implement a number guessing game with a secret number of 1. The 
     * panel will have functionality such that when a user enters an integer into the text field 
     * and presses the button the label will display "higher" if the user entered an int that is 
     * less than 1, "lower" if the user entered a number that is greater than 1 and "correct!" if 
     * the user entered exactly 1
     */
    public static JPanel q2()
    {
    		
    		JTextField text=new JTextField(5);
    		JButton button=new JButton("button");
    		JLabel label=new JLabel();
    		JPanel panel=new JPanel();
    		    		
    		button.addActionListener(new ActionListener()
    				{
    			@Override
    			public void actionPerformed(ActionEvent e)
    			{
    				if(Integer.parseInt(text.getText())>1)
    				{
    					label.setText("lower");
    				}
    				else if(Integer.parseInt(text.getText())<1)
    				{
    					label.setText("higher");
    				}
    				else if(Integer.parseInt(text.getText())==1)
    				{
    					label.setText("correct!");
    				}
    			}
    				});
    		
    		panel.add(text);
    		panel.add(button);
    		panel.add(label);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 2 input components as follows:
     * -A JTextArea with 6 rows and 13 columns
     * -A JTextArea with 8 rows and 18 columns
     */
    public static JPanel q3()
    {
    		
    		JPanel panel=new JPanel();
    		JTextArea text1=new JTextArea(6, 13);
    		JTextArea text2=new JTextArea(8, 18);
    		
    		panel.add(text1);
    		panel.add(text2);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain the following three Components: A JComboBox of Strings 
     * with the options "strengthen", "have", and "content" in this order, a JLabel, and a 
     * JButton that when clicked sets the text of the JLabel to the selected value of the 
     * JComboBox
     */
    public static JPanel q4()
    {
    		
    		JPanel panel=new JPanel();
		JComboBox<String> dropDown=new JComboBox<>();
		JLabel label=new JLabel();
		JButton button=new JButton("button");
		
		dropDown.addItem("strengthen");
		dropDown.addItem("have");
		dropDown.addItem("content");
		
		button.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				String setIt=(String) dropDown.getSelectedItem();
				label.setText(setIt);
			}
				});
		
		
		panel.add(dropDown);
		panel.add(button);
		panel.add(label);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 3 JLabels with the phrases "legitimate university" and 
     * "sneak nurse" each on a separate JLabel. The last JLabel will contain the image located at 
     * the url 
     * "https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png"
     */
    public static JPanel q5()
    {
    	
    		String longURL="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
    		ImageIcon image=null;
    		
    		JPanel panel=new JPanel();
    		JLabel label1=new JLabel();
    		JLabel label2=new JLabel();
    		
    		label1.setText("legitimate university");
    		label2.setText("sneak nurse");
    		
    		try
    		{
    			URL url=new URL(longURL);
    			image=new ImageIcon(url);
    		}
    		
    		catch(MalformedURLException ex)
    		{
    			ex.printStackTrace();
    		}

    		JLabel label3=new JLabel(image);

    		panel.add(label1);
    		panel.add(label2);
    		panel.add(label3);
    		
    		return panel;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
    		
    		
    }
}
