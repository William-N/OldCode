package maps.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import maps.MapGUI;
import maps.cities.Cities;
import maps.cities.City;

public class SearchListener implements KeyListener
{
	
	
	private MapGUI gui;
	private Cities cities;
	
	public SearchListener(MapGUI gui, Cities cities)
	{
		
		this.gui=gui;
		this.cities=cities;
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent arg0) 
	{

		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{

		gui.getSearchResults().removeAllItems();
		
		ArrayList<City> data=cities.searchByName(gui.getSearchBar().getText());
		
		for(int i=0; i<data.size(); i++)
		{
			
			gui.getSearchResults().addItem(data.get(i));
			
		}
				
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{

		
		
	}
	
	
	
}
