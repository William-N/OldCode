package maps.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import maps.MapGUI;
import maps.tiles.Tile;

public class TranslateListener implements MouseListener
{
	
	private MapGUI gui;
	private int x;
	private int y;
	
	public TranslateListener(MapGUI gui, int x, int y)
	{
		
		this.gui=gui;
		this.x=x;
		this.y=y;
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{

		gui.setReferenceTile(new Tile(this.x, this.y));
		gui.setMapPanel();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
