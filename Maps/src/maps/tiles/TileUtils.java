package maps.tiles;

import java.util.ArrayList;

import maps.cities.City;

public class TileUtils 
{
	
	public static Tile getTile(City city)
	{
		
		return new Tile(city);
		
	}
	
	
	public static ArrayList<Tile> getTileMap(Tile tile)
	{
		
		int x=tile.getX();
		int y=tile.getY();

		ArrayList<Tile> mapTiles=new ArrayList<Tile>();
		
		mapTiles.add(new Tile(x-1,y-1));
		mapTiles.add(new Tile(x,y-1));
		mapTiles.add(new Tile(x+1,y-1));
		mapTiles.add(new Tile(x-1,y));
		mapTiles.add(tile);
		mapTiles.add(new Tile(x+1,y));
		mapTiles.add(new Tile(x-1,y+1));
		mapTiles.add(new Tile(x,y+1));
		mapTiles.add(new Tile(x+1,y+1));
		
		return mapTiles;
		
	}
	
	
}
