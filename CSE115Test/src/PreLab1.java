public class PreLab1
{
	public static double costPerMonth(double gbPerMonth) 		//Method designed to calculate cost per month of data plan.
	{
		double cost=gbPerMonth*10;
		
		return cost;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(costPerMonth(4.3));
	}

}
