package ratings.ratables;

import java.util.ArrayList;

public abstract class Ratable 
{
	
	protected ArrayList<Double> ratingList;
	
	public Ratable()
	{
		
		ratingList=new ArrayList<Double>();
		
	}
	
	public abstract String getID();
	public abstract String getLink();
	public abstract String getDescription();
	
	public void addRating(double rating)
	{
		ratingList.add(rating);
	}
	
	public ArrayList<Double> getRatings()
	{
		return ratingList;
	}
	
}
