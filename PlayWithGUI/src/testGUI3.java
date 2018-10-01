import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class testGUI3 
{

	public static void runGUI()
	{
		
		JFrame frame=new JFrame();
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
		
		frame.add(panel);
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
