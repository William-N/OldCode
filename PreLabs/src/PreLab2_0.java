
public class PreLab2_0
{	
	public static double yPosition(double vi, double theta, double time)
	{
		return (vi*time*Math.sin(Math.toRadians(theta)))-(((9.81)*Math.pow(time, 2))/2);
	}
	
	
	public static void main(String[] args) 
	{
		double vi=370.0;
		double theta=80.0;
		double time=19.6;
		
		System.out.println(yPosition(vi, theta, time));
		
	}

}
