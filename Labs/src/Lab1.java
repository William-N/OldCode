
public class Lab1 
{
	
	public static double downloadTime(double gbFileSize)
	{
		double convertToMB=gbFileSize*1000;
		double convertToMb=convertToMB*8;
		double seconds=convertToMb/40;
		
		return seconds;
	}
	
	public static double downloadTimeGB(double gbFileSize)
	{
		double convertToMB=gbFileSize*1000;
		double convertToMb=convertToMB*8;
		double seconds=convertToMb/40;
		
		return seconds;
	}
	
	public static double downloadTimeMB(double MBFileSize)
	{
		double convertToMb=MBFileSize*8;
		double seconds=convertToMb/40;
		
		return seconds;
	}

	public static void main(String[] args) 
	{
		System.out.println(downloadTimeGB(18.4));
		System.out.println(downloadTimeMB(17000.0));
	}

}
