import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProblemSet_wfnichol_0050
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0050 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
    
    
    /**
     * q1: *If you haven't already done so in a previous question, write a public class named 
     * "PointXY" with 2 private instance variables named "x" and "y" both of type int. You may 
     * add any other functionality to this class you'd like including constructors, methods, and 
     * other instance variables*
     * 
     * Write a public method outside of PointXY (in the Problem Set class) named getPoints_1006 
     * that takes no parameters and returns an ArrayList of PointXY containing the points 
     * [(29,-33), (7,22), (-54,-47)]
     */
    public class PointXY
    {
    		
    		private int x;
    		private int y;
    		
    		public PointXY(int x, int y)
    		{
    			
    			this.x=x;
    			this.y=y;
    			
    		}
    		
    		public int getX()
    		{
    			
    			return this.x;
    			
    		}
    		
    		public int getY()
    		{
    			
    			return this.y;
    			
    		}
    		
    }
    
    
    public ArrayList<PointXY> getPoints_1006()
    {
    		
    		ArrayList<PointXY> returnList=new ArrayList<PointXY>();
    		
    		returnList.add(new PointXY(29,-33));
    		returnList.add(new PointXY(7,22));
    		returnList.add(new PointXY(-54, -47));
    		
    		return returnList;
    		
    }
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and returns a JPanel. 
     * The panel will contain 1 JTextField with any number of columns, 1 JButton with any text, 
     * and 1 JLabel which will implement a number guessing game with a secret number of 44. The 
     * panel will have functionality such that when a user enters an integer into the text field 
     * and presses the button the label will display "higher" if the user entered an int that is 
     * less than 44, "lower" if the user entered a number that is greater than 44 and "correct!" 
     * if the user entered exactly 44
     * 
     * *Do not create any JFrames in your problem set questions. Doing so will crash the 
     * auto-grader since the grading server does not have a screen to display the JFrame. 
     * Instead, only return the required JPanel in the problem set methods and test with a JFrame 
     * in your main method, or other helper methods that are not graded
     */
    public static JPanel q2()
    {
    	
    		JPanel panel=new JPanel();
    		JTextField text=new JTextField(5);
    		JButton button=new JButton("button");
    		JLabel label=new JLabel();
    		
    		button.addActionListener(new ActionListener()
			{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(Integer.parseInt(text.getText())>44)
			{
				label.setText("lower");
			}
			else if(Integer.parseInt(text.getText())<44)
			{
				label.setText("higher");
			}
			else if(Integer.parseInt(text.getText())==44)
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
     * q3: Write a public static method named q3 that takes a String as a parameter and has 
     * return type int. The input String will be the name a csv file in the format 
     * "desperate,prompt,ideological,suburban,good,running,brief" where all values are 
     * well-formed integers. There is no header line in this file. This method will return the 
     * sum of the values in the "prompt" column as an int.
     */
    public static int q3(String fileName)
    {
    		
    		int returnValue=0;
    	
    		try
    		{
    			
    			for(String line: Files.readAllLines(Paths.get(fileName)))
    			{
    				
    				String[] currentValues=line.split(",");
    				
    				returnValue=returnValue+Integer.parseInt(currentValues[1]);
    				
    				
    			}
    			
    		}
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    		return returnValue;
    		
    }
    
    
    
    /**
     * q4: *If you haven't already done so in a previous question, write a public class named 
     * "PointXY" with 2 private instance variables named "x" and "y" both of type int. You may 
     * add any other functionality to this class you'd like including constructors, methods, and 
     * other instance variables*
     * 
     * Write a public method outside of PointXY (in the Problem Set class) named closest_15_23 
     * that takes an ArrayList of PointXY as a parameter and returns the PointXY that is closest 
     * to the point (15,23). Use Euclidean distance for distance measurements
     */
    public PointXY closest_15_23(ArrayList<PointXY> array)
    {

    		int this_x=15;
    		int this_y=23;
    		double bestDistance=Double.MAX_VALUE;
    		PointXY returnThis=null;
    		
    		for(int i=0; i<array.size(); i++)
    		{
    			
    			int currentX=array.get(i).getX();
    			int currentY=array.get(i).getY();
    			
    			double currentDistance=Math.abs(Math.sqrt(Math.pow((this_x-currentX),2) + Math.pow((this_y-currentY), 2)));
    			
    			if(currentDistance<bestDistance)
    			{
    				
    				bestDistance=currentDistance;
    				returnThis=array.get(i);
    				
    			}
    			
    		}
    		
    		return returnThis;
    		
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns a JPanel. 
     * The panel will contain 1 JTextField with any number of columns, 1 JButton with any label, 
     * and 1 JLabel. The panel will have functionality such that when a user enters a number into 
     * the text field (we'll call this value x) and presses the button the label will display the 
     * y-value of a parabola in standard form (https://www.desmos.com/calculator/zukjgk9iry) 
     * where a=-4.76, b=10.1, and c=12.03 at the x-value from the text field
     * 
     * Hint: If you store y in the wrapper class Double instead of the primitive double you can 
     * call toString on it to convert it to a string that can be used as the text for the label
     * Tip: After clicking the button you may have to resize your window to see the result since 
     * the frame will not automatically resize to fit the new text
     * 
     * *Do not create any JFrames in your problem set questions. Doing so will crash the 
     * auto-grader since the grading server does not have a screen to display the JFrame. 
     * Instead, only return the required JPanel in the problem set methods and test with a JFrame 
     * in your main method, or other helper methods that are not graded
     */
    public static JPanel q5()
    {
    	
    		JPanel panel=new JPanel();
    		JTextField text=new JTextField(5);
    		JButton button=new JButton();
    		JLabel label=new JLabel();
    		    		
    		button.addActionListener(new ActionListener()
    				{
    				
    				@Override
    				public void actionPerformed(ActionEvent e)
    				{
    					
    					
    					try
    					{
    						
	    		    			double a=-4.76;
	    		    			double b=10.1;
	    		    			double c=12.03;
	    		    			double x=Double.parseDouble(text.getText());
	    		    			double parabola=a*Math.pow(x, 2)+b*x+c;
	    		    			String parabolaString=""+parabola;
	    		    			label.setText(parabolaString);
    						
    					}
    					catch(NumberFormatException ex)
    					{
    						
    						ex.printStackTrace();
    						
    					}

    		    			
    					
    				}
    				
    				});
    		
    		panel.add(text);
    		panel.add(label);
    		panel.add(button);
    		
    		return panel;
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        ProblemSet_wfnichol_0050 outerInstance = new ProblemSet_wfnichol_0050();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}
