package submission;

import java.util.HashMap;

public class StockHomies
{
	
	private String name;
	private HashMap<String, Integer> sharesOwned;
	
	public StockHomies(String name)
	{
		
		this.name=name;
		this.sharesOwned=new HashMap<String, Integer>();
	}
	
	
	
	public void buy(String ticker, int quantity)
	{
		
		if(!this.sharesOwned.containsKey(ticker))
		{
			this.sharesOwned.put(ticker, 0);
		}
		
		this.sharesOwned.put(ticker, this.sharesOwned.get(ticker)+quantity);
	}
	
	
	
	public void sell(String ticker, int quantity)
	{
		
		this.sharesOwned.put(ticker, this.sharesOwned.get(ticker)-quantity);
	}
	
	
	
	@Override
	public String toString()
	{
		
		String tempPrint=this.name+"\n";
		
		for(String key: this.sharesOwned.keySet())
		{
			tempPrint=tempPrint+key+","+this.sharesOwned.get(key)+"\n";
		}
		
		return tempPrint;
		
	}
	
}