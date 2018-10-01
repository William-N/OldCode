
public class TestingGrounds5 
{
	
    public static String q1(String blah)
    {
    		blah=blah.toUpperCase();
    		blah=blah.replace("P", "H");
    		
    		return blah;
    }
    
    public static String q2(String blah)
    {
    		blah=blah.toUpperCase();
    		blah=blah.replace("E","W");
    		
    		return blah;
    }
    
    public static double q3(double hipHop, double rock)
    {
    		double result=Math.sin(hipHop)-Math.sin(rock);
    		
    		return result;
    }
    
    public static int q4(String blah)
    {
    		int counter, counter0, counter1, counter2;
    	
    		blah=blah.toLowerCase();
    		counter0=blah.length();
    		counter1=blah.replace("c","").length();
    		counter2=blah.replace("f","").length();
    		counter1=counter0-counter1;
    		counter2=counter0-counter2;
    		counter=counter1+counter2;
    		
    		return counter;
    }
    
    public static int q5(String blah)
    {
    		int counter=0;
    	
    		blah=blah.replace("c","");
    		blah=blah.replace("e","");
    		blah=blah.replace("v","");
    		
    		counter=blah.length();
    		
    		return counter;
    		
    }
	
	public static void main(String[] args) 
	{
		System.out.println(q1("Pennis"));
		System.out.println(q2("Eilliam"));
		System.out.println(q3(30,50));
		System.out.println(q4("Fucking Cunt"));
		System.out.println(q5("cev666"));

	}

}
