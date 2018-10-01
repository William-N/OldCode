import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;


public class Lab6 
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
				//	lineData=line.split(",");
				//	data.put(lineData[0], new Double(lineData[1]));
				}
			}
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		return data;
	}
	
	public static HashMap<String, Double> readCSVFile(String fileName)
	{
		
		HashMap<String, Double> output=new HashMap<String, Double>();
		
		try
		{
			//String[] lineData=new String[2];
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				if(!line.equals("item_id,price"))
				{
					//lineData=line.split(",");
					//output.put(lineData[0], new Double(lineData[1]));
				}
			}
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		return output;
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
	
	public static double totalPercentageChange(String inflationDataFile, String purchasePriceBaseFile, String baseDate, String purchasePriceTargetFile, String targetDate)
	{
		HashMap<String, Double> target=readCSVFile(purchasePriceTargetFile);
		HashMap<String, Double> base=readCSVFile(purchasePriceBaseFile);	
		
		double baseCost=0.0;
		double targetCost=0.0;
		
		for(String key: target.keySet())
		{
			targetCost=targetCost+target.get(key);
		}
		
		for(String key: base.keySet())
		{
			baseCost=baseCost+base.get(key);
		}
		
		return percentageChange(inflationDataFile, baseCost, baseDate, targetCost, targetDate);
		
	}
	
	
	
	public static void main(String[] args) 
	{

		
		String target="src/targetDate_data.csv";
		String base="src/baseDate_data.csv";
		String baseDate="1966-10-01";
		String targetDate="1999-08-01";
		String inflationFile="src/CPIAUCSL.csv";
		
		System.out.println(totalPercentageChange(inflationFile, base, baseDate, target, targetDate));
	}

}
