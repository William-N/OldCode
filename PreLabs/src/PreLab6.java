import java.io.IOException; 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
//import java.util.ArrayList;

public class PreLab6 
{

	public static HashMap<String, Double> getIndecies(String fileName)
	{
		HashMap<String, Double> data= new HashMap<String, Double>();
		
		try
		{
			//String[] lineData=new String[2];
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				if(!line.equals("DATE,CPIAUCSL"))
				{
					//lineData=line.split(",");
					//data.put(lineData[0], new Double(lineData[1]));
				}
			}
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		return data;
	}
	
	
	public static double adjustPrice(String fileName,double amount, String baseData, String targetData)
	{
		HashMap<String, Double> indecies=getIndecies(fileName);
		
		double baseIndex=indecies.get(baseData);
		double targetIndex=indecies.get(targetData);
		double ratio=targetIndex/baseIndex;
		
		return ratio*amount;
		
	}
	
	
	public static double percentageChange(String fileName,double baseCost, String baseData, double targetCost, String targetData)
	{
		double adjustedPrice=adjustPrice(fileName, baseCost,baseData, targetData);
		double ratioChange=(targetCost-adjustedPrice)/adjustedPrice;
		
		
		
		return ratioChange*100;
	}
	
	public static double adjustListPrices(String fileName, HashMap<String, Double> amount, String baseData, String targetData)
	{
		
		double returnPrice=0.0;
		
		for(String key: amount.keySet())
		{
			returnPrice=returnPrice+adjustPrice(fileName, amount.get(key), baseData, targetData);
		}
		
		return returnPrice;
	}
	
	
	public static void main(String[] args) 
	{
		String fileName="src/its_da_list.csv";
		HashMap<String, Double> input=new HashMap<String, Double>();
		
		try
		{
			//String[] lineData=new String[2];
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				if(!line.equals("item_id,price"))
				{
					//lineData=line.split(",");
					//input.put(lineData[0], new Double(lineData[1]));
				}
			}
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println(adjustListPrices( "src/CPIAUCSL.csv", input, "1966-09-01", "2000-05-01"));
		
	}

}
