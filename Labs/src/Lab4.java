import java.util.ArrayList;
import java.util.HashMap;


public class Lab4 
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
	
	public static HashMap<String, Integer> getTotalFrequencies(HashMap<String, ArrayList<Double>> allTemps)
	{
		HashMap<String, Integer> totalFrequencies= new HashMap<String, Integer>();
		
		totalFrequencies.put("medical emergency", 0);
		totalFrequencies.put("hyperthermic", 0);
		totalFrequencies.put("hot", 0);
		totalFrequencies.put("normal", 0);
		totalFrequencies.put("cold", 0);
		totalFrequencies.put("hypothermic", 0);
		
		for(String key: allTemps.keySet())
		{
			ArrayList<Double> person=allTemps.get(key);
			
			for(int i=0; i<person.size();i++)
			{
				String condition=checkTemp(person.get(i));

				for(String keyTemp: totalFrequencies.keySet())
				{
					if(keyTemp.equals(condition))
					{
						int hold=totalFrequencies.get(keyTemp)+1;
						totalFrequencies.put(keyTemp, hold);
					}
				}
			}
		}
		
		return totalFrequencies;
	}
	
	public static void main(String[] args) 
	{
		
		
		HashMap<String, ArrayList<Double>> allTemps = new HashMap<>();

		ArrayList<Double> temps0 = new ArrayList<>();
		temps0.add(99.93);
		temps0.add(96.56);
		temps0.add(95.57);
		temps0.add(100.81);
		temps0.add(101.71);
		temps0.add(101.27);
		temps0.add(100.73);
		temps0.add(99.81);
		temps0.add(98.65);
		allTemps.put("Sergey Alexandrovich Volkov", temps0);

		ArrayList<Double> temps1 = new ArrayList<>();
		temps1.add(101.81);
		temps1.add(95.37);
		temps1.add(94.92);
		temps1.add(97.67);
		temps1.add(99.67);
		temps1.add(98.01);
		temps1.add(103.06);
		temps1.add(97.63);
		temps1.add(100.3);
		temps1.add(97.21);
		allTemps.put("Thomas Pesquet", temps1);

		ArrayList<Double> temps2 = new ArrayList<>();
		temps2.add(95.97);
		temps2.add(93.62);
		temps2.add(99.87);
		temps2.add(96.29);
		temps2.add(102.72);
		temps2.add(95.2);
		temps2.add(93.94);
		temps2.add(101.84);
		allTemps.put("Wang Yaping", temps2);

		ArrayList<Double> temps3 = new ArrayList<>();
		temps3.add(101.41);
		temps3.add(93.8);
		temps3.add(93.57);
		temps3.add(96.87);
		temps3.add(96.95);
		temps3.add(96.68);
		temps3.add(96.49);
		temps3.add(97.49);
		temps3.add(101.95);
		allTemps.put("Andreas Mogensen", temps3);

		ArrayList<Double> temps4 = new ArrayList<>();
		temps4.add(100.41);
		temps4.add(95.46);
		temps4.add(99.62);
		temps4.add(95.05);
		temps4.add(96.29);
		temps4.add(95.63);
		temps4.add(98.73);
		allTemps.put("Randolph Bresnik", temps4);

		ArrayList<Double> temps5 = new ArrayList<>();
		temps5.add(100.49);
		temps5.add(100.27);
		temps5.add(100.05);
		temps5.add(98.85);
		temps5.add(99.0);
		temps5.add(94.74);
		temps5.add(97.68);
		temps5.add(102.04);
		allTemps.put("Alexander Gerst", temps5);
		
		System.out.println(getTotalFrequencies(allTemps));
		
	}

}
