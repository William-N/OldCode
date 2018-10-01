package maps.cities;

public class City implements Comparable<City>
{
	
	private int population;
	private String name;
	private String region;
	private String country;
	private double latitude;
	private double longitude;
	
	public City(int population, String name, String region, String country, double latitude, double longitude)
	{
		
		this.population=population;
		this.name=name;
		this.region=region;
		this.country=country;
		this.latitude=latitude;
		this.longitude=longitude;
		
	}
	
	public int getPopulation()
	{
		return this.population;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getRegion()
	{
		return this.region;
	}
	
	public String getCountry()
	{
		return this.country;
	}
	
	public double getLatitude()
	{
		return this.latitude;
	}
	
	public double getLongitude()
	{
		return this.longitude;
	}
	
	
	public int compareTo(City arg0)
	{
		
		if(this.getPopulation()>arg0.getPopulation())
		{
			
			return -1;
			
		}
		else if(this.getPopulation()<arg0.getPopulation())
		{
			
			return 1;
			
		}
		else
		{
			return 0;
		}
		
	}
	
	
	@Override
	public String toString()
	{
		
		return this.population+" - "+this.name+", "+this.region+", "+this.country;
		
	}
	
}
