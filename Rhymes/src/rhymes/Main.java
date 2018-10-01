package rhymes;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main 
{

	public static void runGUI()
	{
		
		JFrame frame=new JFrame();
		
		String dictionaryFileName="src/rhymingDictionary.txt";
		
		GameModel game=new GameModel(dictionaryFileName);
		GUI gui=new GUI(game);
		
		frame.getContentPane().add(gui.getWordPanel(), BorderLayout.NORTH);
		frame.getContentPane().add(gui.getChoicesPanel(), BorderLayout.CENTER);
		frame.getContentPane().add(gui.getScorePanel(), BorderLayout.SOUTH);
		
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
