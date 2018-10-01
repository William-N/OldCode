
public class TestingGrounds6 
{
    public static int q1(String blah)
    {
    		blah=blah.toLowerCase();
    		int counter0=blah.length();
    		int counter1=counter0-blah.replace("n","").length();
    		int counter2=counter0-blah.replace("v","").length();
    		int poop=counter1+counter2;
    		return poop;
    }
    
    public static double q2(int x1, int y1)
    {
    		int x2=20, y2=13;
    		
    		double distance=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    		
    		return distance;
    }
    
    public static String q3(String blah)
    {
    		blah=blah.toLowerCase();
    		blah=blah.replace("l","g");
    		
    		return blah;
    }
    
    public static double q4(double penis, double vagina)
    {
    		double result=Math.sin(penis)/Math.sqrt(vagina);
    		
    		return result;
    }
    
    public static int q5(String blah)
    {
    		int result=0;
    	
    		blah=blah.replace("x","");
    		blah=blah.replace("o","");
    		blah=blah.replace("n","");
    		result=blah.length();
    		
    		return result;
    }
	
	public static void main(String[] args) 
	{
		System.out.println(q1("nv"));
		System.out.println(q2(13,14));
		System.out.println(q3("Lit be..."));
	}

}
