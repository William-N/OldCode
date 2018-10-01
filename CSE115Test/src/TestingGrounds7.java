import java.util.HashMap;
import java.util.ArrayList;

public class TestingGrounds7 
{

    public static  HashMap<Integer, Integer> q1()
    {
    		HashMap<Integer, Integer> twoIntValues= new HashMap<Integer, Integer>();
    		
    		twoIntValues.put(96,16);
    		twoIntValues.put(64, -12);
    		
    		return twoIntValues;
    }
    
    public static ArrayList<Integer> q2()
    {
    		ArrayList<Integer> praiseTheSun= new ArrayList<Integer>();
    		
    		praiseTheSun.add(6);
    		praiseTheSun.add(10);
    		praiseTheSun.add(12);
		praiseTheSun.add(15);
    		
    		return praiseTheSun;
    }
    
    public static ArrayList<Double> q3()
    {
    		ArrayList<Double> praiseTheSun= new ArrayList<Double>();
    		
    		praiseTheSun.add(11.81);
    		praiseTheSun.add(-1.93);
    		praiseTheSun.add(10.24);
    		praiseTheSun.add(-3.26);
    		
    		return praiseTheSun;
    }
    
    public static HashMap<String, Integer> q4()
    {
    		HashMap<String, Integer> HashBrowns= new HashMap<String, Integer>();
    		
    		HashBrowns.put("fabric", 34);
    		HashBrowns.put("approach", 42);
    		HashBrowns.put("regulator", -1);
    		HashBrowns.put("patent", 40);
    		
    		return HashBrowns;
    }
    
    public static ArrayList<Integer> q5()
    {
    		ArrayList<Integer> praiseTheSun= new ArrayList<Integer>();
    		
    		praiseTheSun.add(7);
    		praiseTheSun.add(4);
    		
    		return praiseTheSun;
    }
	
	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> test=q1();
		System.out.println(test);
		
		ArrayList<Integer> testTies=q2();
		System.out.println(testTies);
		
		ArrayList<Double> anArrayOfBlah=q3();
		System.out.println(anArrayOfBlah);
		
		HashMap<String, Integer> aHashMapOfBlah=q4();
		System.out.println(aHashMapOfBlah);
		
		ArrayList<Integer> praiseTheSun=q5();
		System.out.println(praiseTheSun);
	}

}
