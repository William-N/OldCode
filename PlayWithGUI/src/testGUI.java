import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class testGUI 
{

	public static void runGUI()
	{
		
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JTextField textField=new JTextField(5);
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
					frame.pack();
				}
				catch(NumberFormatException ex) 
				{
					
				}
				
				
			}
				});
		
		panel.add(textField);
		panel.add(button);
		panel.add(label);
		
		frame.setSize(600,400);
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable()
				{
			@Override
			public void run()
			{
				runGUI();
			}
				});
		
	}
}
