package rhymes;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class AnswerListener implements MouseListener
{
	
	private JButton button;
	private GameModel logic;
	private GUI gui;
	
	public AnswerListener(JButton button, GameModel logic, GUI gui)
	{
		
		this.button=button;
		this.logic=logic;
		this.gui=gui;
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		this.button.setForeground(Color.BLUE);
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		this.button.setForeground(Color.black);
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		this.button.setForeground(Color.white);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		this.button.setForeground(Color.blue);
		this.logic.makeChoice(button.getText());
		this.gui.update();
	}
	
	
	
}
