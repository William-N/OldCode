import java.util.HashMap;
import java.util.ArrayList;

public class PreLab4 
{
	
	public static String checkTemp(double temp)
	{
		if(temp<89.6 || temp>=105.8)
		{
			return "medical emergency";
		}
		if(temp<105.8 && temp>=100.4)
		{
			return "hyperthermic";
		}
		if(temp<100.4 && temp>=99.5)
		{
			return "hot";
		}
		if(temp<99.5 && temp>=97.7)
		{
			return "normal";
		}
		if(temp<97.7 && temp>=96.8)
		{
			return "cold";
		}
		if(temp<96.8 && temp>=89.6)
		{
			return "hypothermic";
		}
		else
			return "error";
	}
		
	public static void main(String[] args) 
	{
		
		HashMap<String, Integer> historicTemp=new HashMap<String, Integer>();
		ArrayList<Double> temperatures= new ArrayList<Double>();
		ArrayList<String> categoryTemp= new ArrayList<String>();
		
		historicTemp.put("medical emergency", 0);
		historicTemp.put("hyperthermic", 0);
		historicTemp.put("hot", 0);
		historicTemp.put("normal", 0);
		historicTemp.put("cold", 0);
		historicTemp.put("hypothermic", 0);
		
		temperatures.add(102.04);
		temperatures.add(101.68);
		temperatures.add(95.52);
		temperatures.add(101.0);
		temperatures.add(97.24);
		temperatures.add(100.87);
		temperatures.add(99.22);
		temperatures.add(99.35);
		temperatures.add(103.73);
		temperatures.add(101.28);
		temperatures.add(100.05);
		temperatures.add(102.7);
		temperatures.add(102.9);
		temperatures.add(94.37);
		temperatures.add(101.18);
		temperatures.add(100.83);
		temperatures.add(95.89);
		temperatures.add(99.37);
		temperatures.add(96.81);
		temperatures.add(99.65);
		temperatures.add(98.99);
		temperatures.add(102.41);
		temperatures.add(103.26);
		temperatures.add(97.37);
		temperatures.add(99.21);
		temperatures.add(99.95);
		temperatures.add(95.18);
		temperatures.add(94.8);
		temperatures.add(99.71);
		temperatures.add(95.7);
		temperatures.add(97.47);
		temperatures.add(97.16);
		temperatures.add(101.61);
		temperatures.add(100.73);
		temperatures.add(93.4);
		temperatures.add(98.34);
		
		for(int i=0; i<temperatures.size(); i++)
		{
			categoryTemp.add(checkTemp(temperatures.get(i)));
		}
		
		for(int i=0; i<categoryTemp.size(); i++)
		{
			String check=categoryTemp.get(i);
						
			for(String key: historicTemp.keySet())
			{
				if(check.equals(key))
				{
					int hold= historicTemp.get(key);
					hold=hold+1;
					historicTemp.put(key, hold);
				}

			}
			
		}
	
		System.out.println(historicTemp);
	}

}
