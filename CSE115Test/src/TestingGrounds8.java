import java.util.HashMap;
import java.util.ArrayList;

public class TestingGrounds8 
{
    public static HashMap<String, Double> q1()
    {
    		HashMap<String, Double> hashBrown= new HashMap<String, Double>();
    		
    		hashBrown.put("package", 0.72);
    		hashBrown.put("threat", 14.19);
    		hashBrown.put("recruit", 10.51);
    		
    		return hashBrown;
    }


    public static int q2(ArrayList<Integer> praiseTheSun)
    {
    		int tourette=0;
    		
    		tourette=praiseTheSun.get(0);
    		tourette=tourette+praiseTheSun.get(17);
    		tourette=tourette+praiseTheSun.get(6);
    		tourette=tourette+praiseTheSun.get(10);
    		tourette=tourette+praiseTheSun.get(14);
    		
    		return tourette;
    }
    
    public static ArrayList<String> q3()
    {
    		ArrayList<String> praiseTheSun= new ArrayList<String>();
    		
    		praiseTheSun.add("few");
    		praiseTheSun.add("booth");
    		praiseTheSun.add("dose");
    		praiseTheSun.add("theory");
    		praiseTheSun.add("warmth");
    		
    		return praiseTheSun;
    }
    
    public static String q4(HashMap<String, String> HashBrown)
    {    		
    		String blah="long ";
    		blah=blah.concat("favor ");
    		blah=blah.concat("roof ");
    		blah=blah.concat("oxygen ");
    		
    		for (String key: HashBrown.keySet())
    		{
    			blah=blah.concat(HashBrown.get(key));    			
    		}
    		
    		return blah;
    }
    
    public static int q5(ArrayList<Integer> praiseTheSun)
    {	
		int tourette0=praiseTheSun.get(1);
		int tourette1=praiseTheSun.get(19);
		int tourette2=praiseTheSun.get(12);
		int tourette=tourette0+tourette1+tourette2;

		return tourette;
    }
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> praiseTheSun= new ArrayList<Integer>();
		ArrayList<Integer> praiseTheMoon= new ArrayList<Integer>();
			
		for(int i=0; i<19; i++)
			{
				long convert=Math.round(Math.random());
				int fullConvert=(int) convert;
				
				praiseTheSun.add(fullConvert);
			}
		
		for(int i=0; i<22; i++)
		{
			long convert=Math.round(Math.random());
			int fullConvert=(int) convert;
			
			praiseTheMoon.add(fullConvert);
		}
		
		HashMap<String, String> hashBrown= new HashMap<String, String>();
		
		hashBrown.put("blah", "Kodak BLack ");
		hashBrown.put("blaa", "Gringo ");
			
		System.out.println(q1());
		System.out.println(q2(praiseTheSun));
		System.out.println(q3());
		System.out.println(q4(hashBrown));
		System.out.println(q5(praiseTheMoon));
	}

}
