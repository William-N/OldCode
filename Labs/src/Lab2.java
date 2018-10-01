
public class Lab2 
{

	public static double totalDistance(double theta, double vi)
	{
		double time=(2*vi*Math.sin(Math.toRadians(theta)))/(9.81);
		
		return (vi*time*Math.cos(Math.toRadians(theta)));
	}
	
	
	public static void main(String[] args) 
	{
		double theta=65;
		double vi=70;
		
		System.out.println(totalDistance(theta,vi));
	}

}
