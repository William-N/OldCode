import java.util.HashMap;
import java.util.ArrayList;

public class TestingGrounds10 
{
	public static String q1(String blah)
    {
    	
    		if (blah.indexOf("u")>=0)
    			{
    				return"found u";
    			}
    	
    		if (blah.length()==0)
    			{
    				return"empty";
    			}
    		if (blah.length()<3 && blah.length()!=0)
    			{
    				return"short";
    			}
    		if (blah.length()<12 && blah.length()>=3)
    			{
    				return"medium";
    			}
    		if (blah.length()>=12)
    			{
    				return"long";
    			}
    		return "error";
    }
	
	public static void q2()
	{
		for(int i=0; i<98; i++)
			{
				System.out.println(i);
			}
	}
	
	public static HashMap<Integer, Double> q3()
	{
		HashMap<Integer, Double> hashBrown= new HashMap<Integer, Double>();
		
		for(int i=9; i<56; i++)
			{
				double cubeRoot = Math.cbrt(i);
				
				hashBrown.put(i, cubeRoot);
			}
		return hashBrown;
	}
	
	public static boolean q4(int little, int uzi)
	{
		if(little<26&&uzi==5)
			return true;
		
		return false;
	}
	
	public static ArrayList<Double> q5(ArrayList<Double> praiseTheSun)
	{
		int size=praiseTheSun.size();
		
		System.out.println(praiseTheSun);
		
		for(int i=0; i<size; i++)
			{
				if (Math.sqrt(i)-0.64<4)
				{
					praiseTheSun.remove(i);
					size--;
				}
			}
		return praiseTheSun;
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Double> praiseTheSun= new ArrayList<Double>();
		
		for(int i=0; i<19; i++)
		{
			double convert=Math.random();
			double fullConvert=(double) convert;
			
			praiseTheSun.add(fullConvert);
		}
		
		System.out.println(q5(praiseTheSun));
	}

}
