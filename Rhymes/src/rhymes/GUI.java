package rhymes;

import rhymes.AnswerListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI 
{
	
	private GameModel logic;
	private JLabel currentWord;
	private JLabel score;
	private JButton word1;
	private JButton word2;
	private JButton word3;
	private JButton word4;
	
	public GUI(GameModel logic)
	{
		
		
		this.logic=logic;
		
		this.currentWord=new JLabel();
		this.score=new JLabel();
		this.word1=new JButton();
		this.word2=new JButton();
		this.word3=new JButton();
		this.word4=new JButton();
		
		AnswerListener blah=new AnswerListener(this.word1, this.logic, this);
		AnswerListener blah1=new AnswerListener(this.word2, this.logic, this);
		AnswerListener blah2=new AnswerListener(this.word3, this.logic, this);
		AnswerListener blah3=new AnswerListener(this.word4, this.logic, this);

		this.word1.addMouseListener(blah);
		this.word2.addMouseListener(blah1);
		this.word3.addMouseListener(blah2);
		this.word4.addMouseListener(blah3);
		
								
		this.currentWord.setText(logic.getGivenWord());
		this.score.setText("Score: "+logic.getScore());
		this.word1.setText(logic.getChoices().get(0));
		this.word2.setText(logic.getChoices().get(1));
		this.word3.setText(logic.getChoices().get(2));
		this.word4.setText(logic.getChoices().get(3));
				
	}
	
	
	public JPanel getWordPanel()
	{
		
		JPanel panel=new JPanel();
		
		panel.add(this.currentWord);
		
		return panel;
		
	}
	
	
	public JPanel getChoicesPanel()
	{
		
		JPanel panel=new JPanel();
		
		panel.add(this.word1);
		panel.add(this.word2);
		panel.add(this.word3);
		panel.add(this.word4);
		
		return panel;
		
	}
	
	
	public JPanel getScorePanel()
	{
		
		JPanel panel=new JPanel();
		
		panel.add(this.score);
		
		return panel;
		
	}
	
	
	public void update()
	{
		
		this.currentWord.setText(logic.getGivenWord());
		this.score.setText("Score: "+logic.getScore());
		this.word1.setText(logic.getChoices().get(0));
		this.word2.setText(logic.getChoices().get(1));
		this.word3.setText(logic.getChoices().get(2));
		this.word4.setText(logic.getChoices().get(3));
		
	}
	
}
