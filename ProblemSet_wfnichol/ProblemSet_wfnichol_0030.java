import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ProblemSet_wfnichol_0030 
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a JPanel. 
     * The panel will contain 1 JTextField with any number of columns, 1 JButton with any label, 
     * and 1 JLabel. The panel will have functionality such that when a user enters a number into 
     * the text field (we'll call this value x) and presses the button the label will display the 
     * y-value of a parabola in standard form (https://www.desmos.com/calculator/zukjgk9iry) 
     * where a=-6.29, b=-3.18, and c=1.49 at the x-value from the text field
     * 
     * Hint: If you store y in the wrapper class Double instead of the primitive double you can 
     * call toString on it to convert it to a string that can be used as the text for the label
     * Tip: After clicking the button you may have to resize your window to see the result since 
     * the frame will not automatically resize to fit the new text
     */
    public static JPanel q1()
    {
    	
    		JPanel panel=new JPanel();
    		JTextField textField=new JTextField("textField");
    		JButton button=new JButton("button");
    		JLabel label=new JLabel("label");
    		
    		button.addActionListener(new ActionListener()
    				{
    			@Override
    			public void actionPerformed(ActionEvent e)
    			{
    				
    				String StringX=textField.getText();
    				
    				try
    				{
    					
    					double x=Double.parseDouble(StringX);
    					double a=-6.29;
    					double b=-3.18;
    					double c=1.49;
    					double parabola=a*Math.pow(x, 2)+b*x+c;
    					
    					String parabolaString=""+parabola;
    					
    					label.setText(parabolaString);
    				}
    				catch(NumberFormatException ex) 
    				{
    					
    				}
    				
    				
    			}
    				});
    		
    		panel.add(textField);
    		panel.add(button);
    		panel.add(label);
    		
    		return panel;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 3 JLabels with the phrases "legitimate policy" and 
     * "apparent adoption" each on a separate JLabel. The last JLabel will contain the image 
     * located at the url 
     * "https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png"
     */
    public static JPanel q2()
    {
    	
    		String longURL="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
		ImageIcon image=null;

		try 
		{
			URL url=new URL(longURL);
			image=new ImageIcon(url);

		}
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		

		JPanel panel=new JPanel();
		JLabel label1=new JLabel();
		JLabel label2=new JLabel();
		JLabel label3=new JLabel(image);
		
		label1.setText("legitimate policy");
		label2.setText("apparent adoption");
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 3 JLabels with the phrases "friendly cross" and 
     * "universal tragedy" each on a separate JLabel. The last JLabel will contain the image 
     * located at the url 
     * "https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png"
     */
    public static JPanel q3()
    {
    	
    		String longURL="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
    		ImageIcon image=null;
    		
    		try
    		{
    			URL url=new URL(longURL);
    			image=new ImageIcon(url);
    		}
    		catch(MalformedURLException ex)
    		{
    			ex.printStackTrace();
    		}
    	
    		JPanel panel=new JPanel();
    		JLabel label1=new JLabel();
    		JLabel label2=new JLabel();
    		JLabel label3=new JLabel(image);
    		
    		label1.setText("friendly cross");
    		label2.setText("universal tragedy");
    		
    		panel.add(label1);
    		panel.add(label2);
    		panel.add(label3);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 2 input components as follows:
     * -A JTextArea with 5 rows and 10 columns
     * -A JTextArea with 6 rows and 16 columns
     */
    public static JPanel q4()
    {
    	
    		JPanel panel=new JPanel();
    		JTextArea text1=new JTextArea(5,10);
    		JTextArea text2=new JTextArea(6,16);
    		
    		panel.add(text1);
    		panel.add(text2);
    		
    		return panel;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns a JPanel. 
     * The returned JPanel will contain 3 input components as follows:
     * -A JTextArea with 10 rows and 16 columns
     * -A JTextField with 8 columns
     * -A JTextArea with 10 rows and 12 columns
     */
    public static JPanel q5()
    {
    	
    		JPanel panel=new JPanel();
    		JTextArea text1=new JTextArea(10,16);
    		JTextField text2=new JTextField(8);
    		JTextArea text3=new JTextArea(10,12);
    		
    		panel.add(text1);
    		panel.add(text2);
    		panel.add(text3);
    		
    		return panel;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        
    }
}

