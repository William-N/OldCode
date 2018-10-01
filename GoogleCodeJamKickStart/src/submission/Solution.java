package submission;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Solution 
{
	
	public static void method() throws IOException
	{
		ArrayList<Integer> citiesOfInterest = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> rangeBuses = new ArrayList<ArrayList<Integer>>();
		//HashMap<Integer, Integer> rangeBuses = new HashMap<Integer, Integer>();
		boolean testCaseFlag = true;
		boolean numberBusesFlag = true;
		boolean rangeBusesFlag = true;
		boolean numberCitiesFlag = true;
		boolean citiesOfInterestFlag = true;
		int testCase = 0;
		int numberBuses = 0;
		int numberCities = 0;
		
		for(String line: Files.readAllLines(Paths.get("")))
		{
			if(line.isEmpty())
			{
				citiesOfInterestFlag = false;
				testCaseFlag = true;
				break;
			}
			
			//start of new testing dataset
			if(testCaseFlag == true)
			{
				testCase = Integer.parseInt(line);
				testCaseFlag = false;
				numberBusesFlag = true;
				break;
			}
			
			if(numberBusesFlag == true)
			{
				numberBuses = Integer.parseInt(line);
				numberBusesFlag = false;
				break;
			}
			
			if(rangeBusesFlag == true)
			{
				String[] destinations = line.split(" ");
				int destination1 = 0;
				int destination2 = 0;
				int counter = 1;
				
				for(String city : destinations)
				{
					if(counter == 3)
					{
						ArrayList<Integer> destinationForBus = new ArrayList<Integer>();
						destinationForBus.add(destination1);
						destinationForBus.add(destination2);
						rangeBuses.add(destinationForBus);
						counter = 1;
					}
					
					if(counter == 1)
					{
						destination1 = Integer.parseInt(city);
					}
					
					if(counter == 2)
					{
						destination2 = Integer.parseInt(city);
					}
					
					++counter;
				}
				
				rangeBusesFlag = false;
				break;
			}
			
			if(numberCitiesFlag == true)
			{
				numberCities = Integer.parseInt(line);
				numberCitiesFlag = false;
				break;
			}
			
			//FOR ALL OTHER CASES, LINES ARE CITIES OF INTEREST
			if(citiesOfInterestFlag == true)
			{
				citiesOfInterest.add(Integer.parseInt(line));
			}
		}
	}
	
	public static void main(String[] args)
	{
		
	}
	
	public static void outputData(ArrayList<Integer> citiesOfInterest, ArrayList<ArrayList<Integer>> rangeBuses, int testCase, int numberBuses, int numberCities)
	{
		for(int i=0; i<numberBuses; ++i)
		{
			ArrayList<Integer> currentRangeList = rangeBuses.get(numberBuses);
			
			int counter = 1;
			int value1 = 0;
			int value2 = 0;
			
			for(int range : currentRangeList)
			{
				if(counter == 1)
				{
					value1 = range;
				}
				
				if(counter == 2)
				{
					value2 = range;
				}
				
				++counter;
			}
		}
	}
}
