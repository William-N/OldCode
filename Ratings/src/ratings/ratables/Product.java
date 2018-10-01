package ratings.ratables;

public class Product extends Ratable
{
	
	public String asin;
	
	public Product(String asin)
	{
		
		this.asin=asin;
		
	}
	
	public String getID()
	{
		
		return asin;
		
	}
	
	public String getLink()
	{
		
		return "https://www.amazon.com/dp/"+asin;
		
	}
	
	public String getDescription()
	{
		
		return asin;
		
	}
	
}
