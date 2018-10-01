package ratings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ratings.ratables.Ratable;
import ratings.ratables.Song;

public class RatingsAnalyzer 
{
	
	public static double bayesianAverage(ArrayList<Double> ratings, int ratingsToAdd, double valuesToAdd)
	{
		
		double score=0.0;
		double bayesianAdjustment=0.0;
		
		for(int i=0; i<ratings.size(); i++)
			score=score+ratings.get(i);
		
		bayesianAdjustment=ratingsToAdd*valuesToAdd;
		score=score+bayesianAdjustment;
		
		return score/ (ratings.size()+ratingsToAdd);
		
	}
	
	
	
	
	public static Song bestSong(ArrayList<Song> songRatings, int extraReviews, double ValueOfReviews)
	{
		
		double highestAverage=0.0;
		int index=0;
		
		for(int i=0; i<songRatings.size(); i++)
		{
			
			double findingAverage=bayesianAverage(songRatings.get(i).getRatings(), extraReviews, ValueOfReviews);
			
			if(highestAverage<findingAverage)
			{
				highestAverage=findingAverage;
				index=i;
			}
		}
		
		return songRatings.get(index);
	}
	
	
	
	
	public static Ratable bestRatable(ArrayList<Ratable> ratableRatings, int extraReviews, double ValueOfReviews)
	{
		
		double highestAverage=0.0;
		int index=0;
		
		for(int i=0; i<ratableRatings.size(); i++)
		{
			
			double findingAverage=bayesianAverage(ratableRatings.get(i).getRatings(), extraReviews, ValueOfReviews);
			
			if(highestAverage<findingAverage)
			{
				
				highestAverage=findingAverage;
				index=i;
				
			}
			
		}
		
		return ratableRatings.get(index);
		
	}
	
	
	
	
	public static ArrayList<Ratable> getTopK(ArrayList<Ratable> reviewLists, int k, Comparator<Ratable> compare)
	{
		
		ArrayList<Ratable> returnList=new ArrayList<Ratable>();
		Collections.sort(reviewLists, compare);
		
		for(int i=0; i<k; i++)
		{
			
			returnList.add(reviewLists.get(i));
			
		}
		
		return returnList;
		
	}
	
}
