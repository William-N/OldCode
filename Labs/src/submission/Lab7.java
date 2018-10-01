package submission;

import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lab7 
{	
	
	public static HashMap<String, StockHomies> processTrades(String fileName)
	{
		
		HashMap<String, StockHomies> sharesOwned= new HashMap<String, StockHomies>();
		
		try
		{
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				String[] splits=line.split(",");
				String name=splits[0];
				String buyOrSell=splits[1];
				//int quantity=new Integer(splits[2]);
				//String ticker=splits[3];
								
				if(!sharesOwned.containsKey(name))
				{
					sharesOwned.put(name, new StockHomies(name));
				}
				if(buyOrSell.equals("buy"))
				{
				//	sharesOwned.get(name).buy(ticker, quantity);
				}
				else if(buyOrSell.equals("sell"))
				{
				//	sharesOwned.get(name).sell(ticker, quantity);
				}
				else
					System.out.println("ERROR");
			}
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		
		return sharesOwned;
	}
	
	
	
/*	public static String autoLabQuestion(String fileName, String )
	{
		
		HashMap<String, StockHomies> sharesOwned=processTrades(fileName);
		
		for(String name: sharesOwned.keySet())
		{
			
		}
		
	}
*/	
	
	public static void main(String[] args)
	{
		
		String fileName= "src/submission/input.csv";
		
		System.out.println(processTrades(fileName));
		
	}
	
}
