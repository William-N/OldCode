import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ProblemSet_wfnichol_0032
{


	/**
	 * Note: In this problem set level you will use inner classes by defining custom classes 
	 * inside the ProblemSet_wfnichol_0032 class. This is only done so you can submit multiple 
	 * classes in a single java file on AutoLab. In most cases it is better practice to define 
	 * each class in a separate file instead of using inner classes.
	 * 
	 * For labs and projects you will write your classes in separate files and submit a single 
	 * jar file containing your entire project
	 */



	/**
	 * q1: Write a public class named ThumbMouseListener that implements the MouseListener 
	 * interface. This class will have a public constructor that takes a JTextArea and a JLabel 
	 * as parameters and stores these in instance variables. Override the mouseEntered method to 
	 * display the text from the JTextArea on the JLabel in all upper case letters. Then, 
	 * override the mouseReleased method to display the text from the JTextArea on the JLabel in 
	 * all lower case letters. The other three methods from the MouseListener interface can be 
	 * left empty
	 */
	public class ThumbMouseListener implements MouseListener
	{

		private JTextArea text=new JTextArea();
		private JLabel label=new JLabel();

		public ThumbMouseListener(JTextArea text, JLabel label)
		{

			this.text=text;
			this.label=label;

		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			label.setText(text.getText().toUpperCase());
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			label.setText(text.getText().toLowerCase());
		}

		@Override
		public void mouseClicked(MouseEvent arg0) 
		{

		}

		@Override
		public void mouseExited(MouseEvent arg0) 
		{

		}

		@Override
		public void mousePressed(MouseEvent arg0) 
		{

		}

	}



	/**
	 * q2: Write a public class named JurorListener that implements the ActionListener interface. 
	 * This class will have a public constructor that takes a JTextField and a JLabel as 
	 * parameters and stores these in instance variables. Override the actionPerformed method to 
	 * interpret the text on the JTextField as an x-value (as a double) and display the 
	 * corresponding y-value on the JLabel for the line with slope -0.62 and y-intercept -1.4.
	 * 
	 * Note that creating classes that implement listener interfaces we can add the same 
	 * functionality to multiple components by creating multiple instances of this class. For 
	 * example, if we want 3 buttons that will compute y-values for this line with x-values from 
	 * different text fields we can instantiate this class 3 times and attach each instance to a 
	 * different button.
	 */
	public class JurorListener implements ActionListener
	{

		private JTextField text;
		private JLabel label;

		public JurorListener(JTextField text, JLabel label)
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
				double slope=-0.62;
				double y_int=-1.4;

				y=(slope*x)+y_int;

				label.setText(""+y);

			}
			catch(NumberFormatException ex)
			{

			}


		}



	}



	/**
	 * q3: Write a public class named SackMouseListener that implements the MouseListener 
	 * interface. This class will have a public constructor that takes a JTextArea and a JLabel 
	 * as parameters and stores these in instance variables. Override the mouseReleased method to 
	 * display the text from the JTextArea on the JLabel in all upper case letters. Then, 
	 * override the mouseClicked method to display the text from the JTextArea on the JLabel in 
	 * all lower case letters. The other three methods from the MouseListener interface can be 
	 * left empty
	 */
	public class SackMouseListener implements MouseListener
	{

		private JTextArea text;
		private JLabel label;


		public SackMouseListener(JTextArea text, JLabel label)
		{

			this.text=text;
			this.label=label;

		}

		@Override
		public void mouseClicked(MouseEvent arg0) 
		{

			this.label.setText(this.text.getText().toLowerCase());
		}

		@Override
		public void mouseEntered(MouseEvent arg0) 
		{


		}

		@Override
		public void mouseExited(MouseEvent arg0) 
		{


		}

		@Override
		public void mousePressed(MouseEvent arg0) 
		{


		}

		@Override
		public void mouseReleased(MouseEvent arg0) 
		{

			this.label.setText(this.text.getText().toUpperCase());
		}



	}



	/**
	 * q4: Create a public class named "Relation" with private instance variables "beautiful" and 
	 * "starting" each of type int. You may add any other methods and variables you'd like to 
	 * this class.
	 * 
	 * Outside of Relation (in the Problem Set class) write a public static method named 
	 * "sortRelation" that takes an ArrayList of Relations as a parameter and returns void. This 
	 * method will sort the input by the variable "starting" in increasing order
	 */
	public class Relation implements Comparable<Relation>
	{

		private int beautiful;
		private int starting;

		public Relation(int one, int two)
		{
			beautiful=one;
			starting=two;
		}

		@Override
		public int compareTo(Relation arg0) 
		{
			
			if(this.starting<arg0.getStarting()) 
			{
				System.out.println(this.toString() + " was less than " + arg0.toString());
//				return this.starting;
				return -1;
			}
			else 
			{
				System.out.println(this.toString() + " was bigger than " + arg0.toString());
//				return arg0.starting;
				return 1;
			}
		}

		public int getStarting()
		{
			return this.starting;
		}
		
		public int getBeautiful()
		{
			return this.beautiful;
		}
		
		public String toString()
		{
			return ""+this.starting;
		}
		
	}


	public static void sortRelation(ArrayList<Relation> toSort)
	{
		Collections.sort(toSort);
		for (Relation r : toSort)
		{
			System.out.println(r);
		}

	}


	/**
	 * q5: Write a public class named CoalListener that implements the ActionListener interface. 
	 * This class will have a public constructor that takes a JTextField and a JLabel as 
	 * parameters and stores these in instance variables. Override the actionPerformed method to 
	 * interpret the text on the JTextField as an x-value (as a double) and display the 
	 * corresponding y-value on the JLabel for the line with slope -3.64 and y-intercept -2.83.
	 * 
	 * Note that creating classes that implement listener interfaces we can add the same 
	 * functionality to multiple components by creating multiple instances of this class. For 
	 * example, if we want 3 buttons that will compute y-values for this line with x-values from 
	 * different text fields we can instantiate this class 3 times and attach each instance to a 
	 * different button.
	 */
	public class CoalListener implements ActionListener
	{

		private JTextField text;
		private JLabel label;

		public CoalListener(JTextField text, JLabel label)
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
				double slope=-3.64;
				double y_int=-2.83;

				y=(slope*x)+y_int;

				label.setText(""+y);

			}
			catch(NumberFormatException e)
			{

			}
		}

	}



	public static void main(String[] args)
	{

		/* Use the following syntax to instantiate your inner class for testing */
		ProblemSet_wfnichol_0032 outerInstance = new ProblemSet_wfnichol_0032();
		//InnerClassName innerInstance = outerInstance.new InnerClassName();
		Relation innerInstance=outerInstance.new Relation(0,3);
		Relation innerInstance1=outerInstance.new Relation(0,5);
		Relation innerInstance2=outerInstance.new Relation(0,2);
		Relation innerInstance3=outerInstance.new Relation(0,1);
		Relation innerInstance4=outerInstance.new Relation(0,8);
		/* Test your code here to verify it is correct before submitting */
		ArrayList<Relation> sortIt=new ArrayList<Relation>();
		sortIt.add(innerInstance);
		sortIt.add(innerInstance1);
		sortIt.add(innerInstance2);
		sortIt.add(innerInstance3);
		sortIt.add(innerInstance4);
		
		System.out.println(sortIt);
		
		sortRelation(sortIt);
		
		System.out.println(sortIt);
	}
}
