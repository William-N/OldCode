import java.util.HashMap;
import java.util.ArrayList;

public class Lab3 
{
	
	public static double totalCostOfRemainingInventory(HashMap<String, Double> priceList, HashMap<String, Integer> inventory, ArrayList<HashMap<String, Integer>> orders)
	{
		double returnCost=0.0;
		
		for(int i=0; i<orders.size();i++)
		{
			HashMap<String,Integer> cart=orders.get(i);
			
			for(String key: cart.keySet())
			{
				for(String inventoryKey: inventory.keySet())
				{
					if(key.equals(inventoryKey))
					{						
						int changeV=inventory.get(inventoryKey)-cart.get(key);
						inventory.put(inventoryKey, changeV);
					}
				}
			}
		}
		
		for(String key: priceList.keySet())
		{
			for(String inventoryKey: inventory.keySet())
			{
				if(key.equals(inventoryKey))
				{
					returnCost=returnCost+(priceList.get(key)*inventory.get(inventoryKey));
				}
			}
		}
		
		return returnCost;
	}
	
	public static double expensesOrRevenue(HashMap<String, Double> priceList, HashMap<String, Integer> cart)
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
		
		/*HashMap<String, Double> expensesList= new HashMap<String, Double>();
		*	expensesList.put("eggs",1.2);
		*	expensesList.put("orange juice",1.0);
		*	expensesList.put("yogurt",1.0);
		*	expensesList.put("bread",1.15);
		*	expensesList.put("butter",1.95);
		*	expensesList.put("peppers",0.99);
		*	expensesList.put("chips",0.9);
		*	expensesList.put("chocolate chips",1.79);
		*	expensesList.put("popcorn",0.99);
			expensesList.put("tomato sauce",0.4);
		.	expensesList.put("frozen pizza",2.6);
		.	expensesList.put("milk",1.89);
		.	expensesList.put("bananas",0.39);
			expensesList.put("hot dog",0.79);
			expensesList.put("relish",0.49);
			expensesList.put("frozen dinner",1.5);
			expensesList.put("cereal",1.55);
			expensesList.put("tuna fish",0.49);
			expensesList.put("coffee",0.6);
			expensesList.put("pasta",0.5);
			expensesList.put("strawberries",1.99);
			expensesList.put("apples",0.99);
			expensesList.put("sugar",1.5);
		*n	expensesList.put("ketchup",0.98);     							*/
		
		HashMap<String, Integer> inventory= new HashMap<String, Integer>();
		inventory.put("eggs",41);
		inventory.put("orange juice",18);
		inventory.put("yogurt",17);
		inventory.put("bread",25);
		inventory.put("butter",23);
		inventory.put("peppers",22);
		inventory.put("chips",32);
		inventory.put("chocolate chips",28);
		inventory.put("popcorn",46);
		inventory.put("tomato sauce",49);
		inventory.put("frozen pizza",19);
		inventory.put("milk",27);
		inventory.put("bananas",22);
		inventory.put("hot dog",37);
		inventory.put("relish",19);
		inventory.put("frozen dinner",34);
		inventory.put("cereal",44);
		inventory.put("tuna fish",23);
		inventory.put("coffee",33);
		inventory.put("pasta",23);
		inventory.put("strawberries",42);
		inventory.put("apples",35);
		inventory.put("sugar",44);
		inventory.put("ketchup",35);
		
		ArrayList<HashMap<String, Integer>> allOrders = new ArrayList<>();
		HashMap<String, Integer> cart0 = new HashMap<>();
		cart0.put("bread", 2);
		cart0.put("coffee", 3);
		cart0.put("apples", 2);
		allOrders.add(cart0);
		HashMap<String, Integer> cart1 = new HashMap<>();
		cart1.put("yogurt", 5);
		cart1.put("strawberries", 4);
		cart1.put("relish", 3);
		allOrders.add(cart1);
		
		System.out.println(totalCostOfRemainingInventory(priceList, inventory, allOrders));
		
		
	}

}
