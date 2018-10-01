package maps.tiles;

import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;

import org.apache.http.client.fluent.Request;

import maps.cities.City;

public class Tile 
{
	
	
	private int zoom=6;
	private int x;
	private int y;
	private double latitude;
	private double longitude;
	private City city;
	
	public Tile(City city)
	{
		
		this.city=city;
		this.latitude=this.city.getLatitude();
		this.longitude=this.city.getLongitude();
		this.x=(int)Math.floor( ((this.longitude+180)/360)*Math.pow(2, this.zoom) );
		
		double sec = 1/Math.cos(Math.toRadians(this.latitude));
		double tan = Math.tan(Math.toRadians(this.latitude));
		
		this.y=(int)Math.floor((1-Math.log(tan+sec)/Math.PI)*Math.pow(2, zoom-1));
		
	}
	
	
	public Tile(double latitude, double longitude)
	{
		
		this.latitude=latitude;
		this.longitude=longitude;
		this.x=(int)Math.floor( ((this.longitude+180)/360)*Math.pow(2, this.zoom) );	//works
				
		double sec = 1/Math.cos(Math.toRadians(this.latitude));
		double tan = Math.tan(Math.toRadians(this.latitude));
		
		this.y=(int)Math.floor((1-Math.log(tan+sec)/Math.PI)*Math.pow(2, zoom-1));
		
	}
	
	
	public Tile(int x, int y)
	{
		
		this.x=x;
		this.y=y;
		
	}
	
	
	public static String getRequest(String url){
	    String response = "";

	    try{
	        response = Request.Get(url).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }

	    return response;
	}
	
	public String getTileURL()
	{
		
		return "http://a.tile.openstreetmap.org/"+zoom+"/"+this.x+"/"+this.y+".png";
		
	}
	
	
	public ImageIcon getImageIcon()
	{
		
		ImageIcon image=null;
		
		try
		{
			URL url=new URL(getTileURL());
			image=new ImageIcon(url);
			return image;
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		return null;
		
	}
	
	
	public int getX()
	{
		return this.x;
	}
	
	
	public int getY()
	{
		return this.y;
	}
	
	
	@Override
	public String toString()
	{
		
		return getTileURL();
		
	}
	
	
}
