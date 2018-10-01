import java.util.HashMap;
import java.util.ArrayList;

public class PreLab3 
{
	
	public static double getPriceSingleItelType(HashMap<String, Double> priceList, String itemType, int quantity)
	{
		double itemPrice=priceList.get(itemType);
		return itemPrice*quantity;
	}
	
	public static double getPrice(HashMap<String, Double> priceList, ArrayList<String> basket)
	{
		double totalCost=0.0;
		
		for(String item: basket)
		{
			double itemPrice=priceList.get(item);
			totalCost=totalCost+itemPrice;
		}
		
		return totalCost;
	}
	
	public static HashMap<String, Double> getPriceList()
	{
		HashMap<String, Double> priceList= new HashMap<String, Double>();
		
		priceList.put("eggs", 1.79);
		priceList.put("butter", 3.19);
		priceList.put("cheese", 5.99);
		priceList.put("apple", 0.99);
		priceList.put("bananna", 0.39);
		priceList.put("strawberrier", 1.99);
		priceList.put("peppers", 1.99);
		priceList.put("tomato sauce", 0.5);
		priceList.put("chocolate chips", 2.29);
		
		return priceList;
	}

	public static void main(String[] args) 
	{
		
	}

}
