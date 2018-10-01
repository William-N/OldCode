
public class TestingGrounds4 
{
	public static int q1(String blah) 
    {
    		blah=blah.replace("s","");
    		blah=blah.replace("c","");
    		blah=blah.replace("y","");
    		
    		int GucciGang=blah.length();
    	
    		return GucciGang;
    }
	
    public static double q2(double savvage, double kodakBlack)
    {
    		double result=Math.tan(savvage)+Math.sin(kodakBlack);
    		
    		return result;
    }
    
    public static double q3(double southpark, double familyguy)
    {
    		double theAnswer=Math.sin(southpark)-Math.abs(familyguy);
    		
    		return theAnswer;
    }
    
    public static String q4(String blah)
    {
    		blah=blah.toUpperCase();
    		
    		return blah;
    }
    
    public static String q5(String blah)
    {
    		blah=blah.toLowerCase();
    		blah=blah.replace("k","x");
    	
    		return blah;
    }

	public static void main(String[] args) 
	{
		System.out.println(q1("Cynthia"));
		System.out.println(q2(30,40));
		System.out.println(q3(45,-69));
		System.out.println(q4("tiny characters"));
		System.out.println(q5("Karl the Dank"));
	}

}
