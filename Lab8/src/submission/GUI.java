package submission;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI 
{
	
	private GameLogic gameLogic;
	private JLabel score;
	private JLabel givenWord;
	private JTextField input;
	
	public GUI(GameLogic gameLogic)
	{
		this.score=new JLabel();
		this.givenWord=new JLabel();
		this.input=new JTextField(5);
		this.gameLogic=gameLogic;
		refreshText();
		
	}
	
	private void refreshText()
	{
		this.score.setText(""+this.gameLogic.getScore());
		this.givenWord.setText(this.gameLogic.getGivenWord());
	}
	
	public JPanel scorePanel()
	{
		JPanel panel=new JPanel();
		panel.add(score);
		
		return panel;	
	}
	
	public JPanel wordPanel()
	{
		JPanel panel=new JPanel();
		panel.add(givenWord);
		panel.add(input);
		
		return panel;
	}
	
	public JPanel optionsPanel()
	{
		JPanel panel=new JPanel();
		JButton submit=new JButton("submit");
		JButton restart=new JButton("restart");
		
		
		
		submit.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				gameLogic.makeGuess(input.getText());
				refreshText();
			}
				});
		
		
		
		restart.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				gameLogic.restartGame();
				refreshText();
			}
				});
		
		
		
		panel.add(submit);
		panel.add(restart);
		
		return panel;
		
	}
	
}