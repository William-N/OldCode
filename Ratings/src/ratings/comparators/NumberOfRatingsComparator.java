package ratings.comparators;

import java.util.Comparator;

import ratings.ratables.Ratable;

public class NumberOfRatingsComparator implements Comparator<Ratable>
{

	@Override
	public int compare(Ratable arg0, Ratable arg1) 
	{
		
		if(arg0.getRatings().size()>arg1.getRatings().size())
		{
			
			return -1;
			
		}
		
		else
		{
			
			return 1;  
			
		}
		
	}
	
	
	
}
