package maps.cities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Cities 
{
	
	private ArrayList<City> cities;
	
	public Cities(String fileName)
	{
		//fileName= "Country,City,Region,Population,Latitude,Longitude",
		//				0		1	  2		   3			4		  5
		
		this.cities=new ArrayList<City>();
		
		try
		{
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				String[] lineValues=line.split(",");
				City currentCity=new City(Integer.parseInt(lineValues[3]), lineValues[1], lineValues[2], lineValues[0], Double.parseDouble(lineValues[4]), Double.parseDouble(lineValues[5]));
				cities.add(currentCity);
				
				
			}
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	
	public City getDefaultCity()
	{
		
		return this.cities.get(45756-1);
		
	}
	
	
	public ArrayList<City> searchByName(String request)
	{
		
		ArrayList<City> returnList=new ArrayList<City>();
		
		for(int i=0; i<this.cities.size(); i++)
		{
			
			if(this.cities.get(i).getName().contains(request))
			{
				
				returnList.add(this.cities.get(i));
				
			}
			
		}
		
		Collections.sort(returnList);
		return returnList;
		
	}	
	
}