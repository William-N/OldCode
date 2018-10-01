import java.util.HashMap;

public class PreLab3point2 
{
	public static double cost(HashMap<String, Double> priceList, HashMap<String, Integer> cart)
	{
		double returnCost=0.0;
		
		for(String key: cart.keySet())
		{
			for(String aKey: priceList.keySet())
			{
				if(key.equals(aKey))
				{
					returnCost=returnCost+cart.get(key)*priceList.get(aKey);
				}
			}
		}
		
		return returnCost;
	}
	
	
	
	public static void main(String[] args) 
	{
		HashMap<String, Double> priceList= new HashMap<String, Double>();
		priceList.put("eggs",1.79);
		priceList.put("orange juice",2.5);
		priceList.put("yogurt",1.99);
		priceList.put("bread",2.49);
		priceList.put("butter",2.39);
		priceList.put("peppers",1.49);
		priceList.put("chips",2.95);
		priceList.put("chocolate chips",2.39);
		priceList.put("popcorn",1.99);
		priceList.put("tomato sauce",0.99);
		priceList.put("frozen pizza",5.49);
		priceList.put("milk",2.09);
		priceList.put("bananas",0.49);
		priceList.put("hot dog",1.29);
		priceList.put("relish",0.99);
		priceList.put("frozen dinner",2.5);
		priceList.put("cereal",3.25);
		priceList.put("tuna fish",0.99);
		priceList.put("coffee",2.0);
		priceList.put("pasta",0.99);
		priceList.put("strawberries",3.5);
		priceList.put("apples",1.29);
		priceList.put("sugar",1.99);
		priceList.put("ketchup",2.89);

		HashMap<String, Integer> cart= new HashMap<String, Integer>();
		
		cart.put("eggs", 1);
		cart.put("orange juice", 3);
		cart.put("yogurt", 5);
		cart.put("bread", 2);
		cart.put("butter", 6);
		cart.put("peppers", 3);
		cart.put("chips", 3);
		cart.put("chocolate chips", 2);
		cart.put("popcorn", 6);
		cart.put("tomato sauce", 5);
		cart.put("frozen pizza", 5);
		cart.put("milk", 1);
		cart.put("bananas", 4);
		cart.put("hot dog", 6);
		cart.put("relish", 7);
		cart.put("frozen dinner", 4);
		cart.put("cereal", 4);
		cart.put("coffee", 3);
		cart.put("pasta", 3);
		cart.put("strawberries", 6);
		cart.put("sugar", 3);
		cart.put("ketchup", 6);
		
		System.out.println(cost(priceList, cart));
		
	}

}
