package ratings.comparators;

import java.util.Comparator;

import ratings.RatingsAnalyzer;
import ratings.ratables.Ratable;

public class BayesianAverageComparator implements Comparator<Ratable>
{

	private int extraReviews;
	private double valueOfReviews;
	
	public BayesianAverageComparator(int extraReviews, double valueOfReviews)
	{
		
		this.extraReviews=extraReviews;
		this.valueOfReviews=valueOfReviews;
		
	}
	
	@Override
	public int compare(Ratable arg0, Ratable arg1) 
	{
		
		if(RatingsAnalyzer.bayesianAverage(arg0.getRatings(), extraReviews, valueOfReviews)>RatingsAnalyzer.bayesianAverage(arg1.getRatings(), extraReviews, valueOfReviews))
		{
			
			return -1;
			
		}
		
		else
		{
			
			return 1;
			
		}
		
	}

	
	
}
