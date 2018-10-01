package preLab8;
//import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PreLab8 
{
	
	public static void runGUI()
	{
		JFrame frame=new JFrame();
		
		//String dictionaryFileName="words_alpha.txt";
		
		//GameLogic game=new GameLogic(dictionaryFileName);
		//GUI gui=new GUI(game);
		
		//frame.getContentPane().add(gui.scorePanel(), BorderLayout.NORTH);
		//frame.getContentPane().add(gui.wordPanel(), BorderLayout.CENTER);
		//frame.getContentPane().add(gui.optionsPanel(), BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
	
}
