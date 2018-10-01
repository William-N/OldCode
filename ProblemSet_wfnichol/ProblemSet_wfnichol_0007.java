import java.util.HashMap;
import java.util.ArrayList;

public class ProblemSet_wfnichol_0007
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and returns a new 
     * HashMap with keys of type Integer mapped to values of type Integer containing the 
     * key-value pairs {96:16, 64:-12}
     */
    public static  HashMap<Integer, Integer> q1()
    {
    		HashMap<Integer, Integer> twoIntValues= new HashMap<Integer, Integer>();
    		
    		twoIntValues.put(96,16);
    		twoIntValues.put(64, -12);
    		
    		return twoIntValues;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Integers as a 
     * parameter and returns an int. The returned int should be the sum of the values int the 
     * input ArrayList at indices 6, 10, 12, and 15. You can assume the input ArrayList has size 
     * large enough to avoid an index out of bounds exception at these indices
     */
    public static ArrayList<Integer> q2()
    {
    		ArrayList<Integer> praiseTheSun= new ArrayList<Integer>();
    		
    		praiseTheSun.add(6);
    		praiseTheSun.add(10);
    		praiseTheSun.add(12);
		praiseTheSun.add(15);
    		
    		return praiseTheSun;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and returns an 
     * ArrayList of type Double containing the values 11.81, -1.93, 10.24, and -3.26. The order 
     * of these values must be maintained
     */
    public static ArrayList<Double> q3()
    {
    		ArrayList<Double> praiseTheSun= new ArrayList<Double>();
    		
    		praiseTheSun.add(11.81);
    		praiseTheSun.add(-1.93);
    		praiseTheSun.add(10.24);
    		praiseTheSun.add(-3.26);
    		
    		return praiseTheSun;
    }
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and returns a new 
     * HashMap with keys of type String mapped to values of type Integer containing the key-value 
     * pairs {"fabric":34, "approach":42, "regulator":-1, "patent":40}
     */
    public static HashMap<String, Integer> q4()
    {
    		HashMap<String, Integer> HashBrowns= new HashMap<String, Integer>();
    		
    		HashBrowns.put("fabric", 34);
    		HashBrowns.put("approach", 42);
    		HashBrowns.put("regulator", -1);
    		HashBrowns.put("patent", 40);
    		
    		return HashBrowns;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and returns an 
     * ArrayList of type Integer containing the values 7, and 4. The order of these values must 
     * be maintained
     */
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
