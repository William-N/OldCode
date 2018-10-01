package maps;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import maps.cities.Cities;
import maps.cities.City;
import maps.control.CitySelectListener;
import maps.control.SearchListener;
import maps.control.TranslateListener;
import maps.tiles.Tile;
import maps.tiles.TileUtils;

public class MapGUI 
{
	
	private Cities cities;
	private JTextField searchBar;
	private JComboBox<City> searchResults;
	private JButton selection;
	private JPanel searchPanel;
	private JPanel mapPanel;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label21;
	private JLabel label22;
	private JLabel label23;
	private JLabel label31;
	private JLabel label32;
	private JLabel label33;
	private int x;
	private int y;
	
	public MapGUI(Cities cities)
	{
		
		this.cities=cities;
		
		this.label11=new JLabel();
		this.label12=new JLabel();
		this.label13=new JLabel();
		this.label21=new JLabel();
		this.label22=new JLabel();
		this.label23=new JLabel();
		this.label31=new JLabel();
		this.label32=new JLabel();
		this.label33=new JLabel();
		
		setReferenceTile(TileUtils.getTile(cities.getDefaultCity()));
		
		this.x=TileUtils.getTile(cities.getDefaultCity()).getX();
		this.y=TileUtils.getTile(cities.getDefaultCity()).getY();
		
	}
	
	
	public JPanel getSearchPanel()
	{
		
		this.searchPanel=new JPanel();
		this.searchBar=new JTextField(10);
		this.searchResults=new JComboBox<City>();
		this.selection=new JButton("Search");
		this.searchBar.addKeyListener(new SearchListener(this, this.cities));
		this.selection.addActionListener(new CitySelectListener(this));
		
		this.searchPanel.add(this.searchBar);
		this.searchPanel.add(this.searchResults);
		this.searchPanel.add(this.selection);
		
		return this.searchPanel;
		
	}
	
	
	public JPanel getMapPanel()
	{
		
		this.mapPanel=new JPanel();
		this.mapPanel.setLayout(new GridLayout(3,3));
		
		this.mapPanel.add(label11).addMouseListener(new TranslateListener(this, this.x-1, this.y-1));
		this.mapPanel.add(label12).addMouseListener(new TranslateListener(this, this.x, this.y-1));
		this.mapPanel.add(label13).addMouseListener(new TranslateListener(this, this.x+1, this.y-1));
		this.mapPanel.add(label21).addMouseListener(new TranslateListener(this, this.x-1, this.y));
		this.mapPanel.add(label22).addMouseListener(new TranslateListener(this, this.x, this.y));
		this.mapPanel.add(label23).addMouseListener(new TranslateListener(this, this.x+1, this.y));
		this.mapPanel.add(label31).addMouseListener(new TranslateListener(this, this.x-1, this.y+1));
		this.mapPanel.add(label32).addMouseListener(new TranslateListener(this, this.x, this.y+1));
		this.mapPanel.add(label33).addMouseListener(new TranslateListener(this, this.x+1, this.y+1));
		
		return this.mapPanel;
		
	}
	
	
	public void setMapPanel()
	{
		
		this.mapPanel.setLayout(new GridLayout(3,3));
		
		this.mapPanel.add(label11);
		this.mapPanel.add(label12);
		this.mapPanel.add(label13);
		this.mapPanel.add(label21);
		this.mapPanel.add(label22);
		this.mapPanel.add(label23);
		this.mapPanel.add(label31);
		this.mapPanel.add(label32);
		this.mapPanel.add(label33);
		
	}
	
	
	public Cities getCities()
	{
		
		return this.cities;
		
	}
	
	
	public void setReferenceTile(Tile tile)
	{

		ArrayList<Tile> mapTiles=TileUtils.getTileMap(tile);
		
		this.label11.setIcon(mapTiles.get(0).getImageIcon());
		this.label12.setIcon(mapTiles.get(1).getImageIcon());
		this.label13.setIcon(mapTiles.get(2).getImageIcon());
		this.label21.setIcon(mapTiles.get(3).getImageIcon());
		this.label22.setIcon(mapTiles.get(4).getImageIcon());
		this.label23.setIcon(mapTiles.get(5).getImageIcon());
		this.label31.setIcon(mapTiles.get(6).getImageIcon());
		this.label32.setIcon(mapTiles.get(7).getImageIcon());
		this.label33.setIcon(mapTiles.get(8).getImageIcon());
		
		this.x=mapTiles.get(4).getX();
		this.y=mapTiles.get(4).getY();
		
		
		
	}
	
	
	public JComboBox<City> getSearchResults()
	{
		
		return this.searchResults;
		
	}
	
	public JTextField getSearchBar()
	{
		
		return this.searchBar;
		
	}
	
}