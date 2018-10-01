package maps.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import maps.MapGUI;
import maps.cities.City;
import maps.tiles.Tile;

public class CitySelectListener implements ActionListener
{
	
	private MapGUI gui;
	
	public CitySelectListener(MapGUI gui)
	{
		
		this.gui=gui;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		//BUG: AutoLab claims code doesn't change panels properly;
		//	   not all cities and their respective panels are selected
		//	   after a while, panel just collapses.
		
		//TODO: Test if wrapper class manipulates data.
		City current=(City)gui.getSearchResults().getSelectedItem();
		Tile currentTile=new Tile(current.getLatitude(), current.getLongitude());
		
		
		System.out.println(current.getLongitude());
		System.out.println(current.getLatitude());
		System.out.println(currentTile.getX());
		System.out.println(currentTile.getY());
		System.out.println(current);
		
		gui.setReferenceTile(currentTile);
		gui.setMapPanel();
		
		System.out.println();
		
	}
	
	
	
	
	
}
