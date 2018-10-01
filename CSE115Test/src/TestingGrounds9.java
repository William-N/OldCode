
public class TestingGrounds9 
{
    public static String q1(String blah)
    {
    	
    		if (blah.indexOf("w")>=0)
    			{
    				return"found w";
    			}
    	
    		if (blah.length()==0)
    			{
    				return"empty";
    			}
    		if (blah.length()<3 && blah.length()!=0)
    			{
    				return"short";
    			}
    		if (blah.length()<6 && blah.length()>=3)
    			{
    				return"medium";
    			}
    		if (blah.length()>=6)
    			{
    				return"long";
    			}
    		return "error";
    }
    
    public static boolean q2(int little, int uzi)
    {
    		if (little<-10||uzi==9)
    			return true;
    		
    		return false;
    }
    
    public static boolean q3(int little, int uzi)
    {
    		if (little>-7&&uzi!=5)
    		{
    			return true;
    		}
    		
    		return false;
    }
    
    public static void q4()
    {
    		for(int i=14; i<132; i++)
    		{
    			System.out.println(i);
    		}
    }
    
    public static void q5()
    {
    		for(int i=-10; i<101; i++)
		{
			System.out.println(i);
		}
    }
    
	public static void main(String[] args) 
	{
		System.out.println(q1("Penis"));
		System.out.println(q2(-10,9));
		System.out.println(q3(9,4));
		q4();
		q5();
	}

}
