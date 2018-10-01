package submission;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main
{
	
	public static void runGUI()
	{
		String APIAddress="https://fury.cse.buffalo.edu/chat/test/";
		ChatGUI chatRoom=new ChatGUI(APIAddress);
		JFrame frame=new JFrame();

		frame.add(chatRoom.getChatPanel(), BorderLayout.NORTH);
		frame.add(chatRoom.getControlPanel(), BorderLayout.SOUTH);
		frame.pack();
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
