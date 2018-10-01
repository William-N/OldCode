

public class PreLab2 
{
	public static double yInitialVelocity(double theta, double initialVelocity)
	{
		return initialVelocity*Math.sin(theta*Math.PI/180.0);
	}
	
	public static double xInitialVelocity(double theta, double initialVelocity)
	{
		return initialVelocity*Math.cos(Math.toRadians(theta));
	}
	
	public static double getX(double theta, double initiialVelocity, double time)
	{
		double x=xInitialVelocity(theta, initiialVelocity)*time;
		
		return x;
	}
	
	public static double getY(double theta, double initialVelocity, double time)
	{
		double g=9.81; //m/s^2
		double y=xInitialVelocity(theta, initialVelocity)*time-g*Math.pow(time, 2.0)/2;
		
		return y;
	}
	
	public static void main(String[] args) 
	{
		double theta=45.0;
		double v_0=100;
		
		System.out.println(xInitialVelocity(theta,v_0));
		System.out.println(yInitialVelocity(theta,v_0));
		System.out.println(getX(theta, v_0, 1.0)+ getY(theta, v_0, 1.0));
	}

}
