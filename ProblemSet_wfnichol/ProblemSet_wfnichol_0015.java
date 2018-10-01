import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class ProblemSet_wfnichol_0015
{
    
    
    /**
     * q1: Write a public static method named q1 that takes a HashMap of type String to String 
     * and returns a String. This method returns the *key mapping to* the minimum ascii among the 
     * values of the input
     */
    public static String q1(HashMap<String, String> hashBrown)
    {
    		String returnString="";
    		
    		ArrayList<String> praiseTheSun= new ArrayList<String>();
    		
    		for(String key: hashBrown.keySet())
    		{
    			praiseTheSun.add(hashBrown.get(key));
    		}
    		Collections.sort(praiseTheSun);
    		returnString=praiseTheSun.get(0);
    		
    		return returnString;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a HashMap of type String to String 
     * and returns a char. This method returns the char with the minimum ascii value from any 
     * String among the values of the input
     */
    public static char q2(HashMap<String, String> hashBrown)
    {
    		ArrayList<Character> praiseTheSun= new ArrayList<Character>();
    		ArrayList<String> earlyConverts= new ArrayList<String>();

    		for(String key: hashBrown.keySet())
    		{
    			earlyConverts.add(key);
    			earlyConverts.add(hashBrown.get(key));
    		}
    		
    		for(int i=0; i<earlyConverts.size(); i++)
    		{
    			String tempString=earlyConverts.get(i);
    			
    			for(int iteration=0; iteration<tempString.length(); iteration++)
    			{
    				char addTime=tempString.charAt(iteration);    				
    				praiseTheSun.add(addTime);
    			}
    		}
    		
    		Collections.sort(praiseTheSun);
    		
    		return praiseTheSun.get(0);
    		
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an ArrayList of type Double and 
     * returns a double. This method returns the minimum result (do not return the original 
     * value) of taking the tangent of each value from the input while considering only negative 
     * numbers from the inputs
     */
    public static double q3(ArrayList<Double> praiseTheSun)
    {
    		double returnTangent=Double.MAX_VALUE;
    	
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			if(praiseTheSun.get(i)<0)
    			{
    				double tangent=Math.tan(praiseTheSun.get(i));
    				
    				if(tangent<returnTangent)
    					returnTangent=tangent;
    			}
    		}
    		
    		return returnTangent;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes an ArrayList of Doubles as a 
     * parameters and returns a double. This method returns the value from the input ArrayList 
     * that is closest to 29.03
     */
    public static double q4(ArrayList<Double> praiseTheSun)
    {
    		double beFound=29.03;
    		double found=0;
    		double returnDistance=Double.MAX_VALUE;
    		
    		
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			double testV=praiseTheSun.get(i);
    			double difference=beFound-testV;
    			double distance=Math.abs(difference);
    			
    			if(distance<returnDistance)
    			{
    				returnDistance=distance;
    				found=praiseTheSun.get(i);
    			}
    		}
    		
    		return found;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of type Character and 
     * returns a char. This method returns the char that comes last alphabetically, ignoring 
     * case, from the values of the input
     */
    public static char q5(ArrayList<Character> praiseTheSun)
    {
    		HashMap<Integer, Character> alphabet= new HashMap<Integer, Character>();
		alphabet.put(0,'a');
		alphabet.put(1, 'b');
		alphabet.put(2, 'c');
		alphabet.put(3, 'd');
		alphabet.put(4,'e');
		alphabet.put(5,'f');
		alphabet.put(6,'g');
		alphabet.put(7,'h');
		alphabet.put(8,'i');
		alphabet.put(9,'j');
		alphabet.put(10,'k');
		alphabet.put(11,'l');
		alphabet.put(12,'m');
		alphabet.put(13,'n');
		alphabet.put(14,'o');
		alphabet.put(15,'p');
		alphabet.put(16,'q');
		alphabet.put(17,'r');
		alphabet.put(18,'s');
		alphabet.put(19,'t');
		alphabet.put(20,'u');
		alphabet.put(21,'v');
		alphabet.put(22,'w');
		alphabet.put(23,'x');
		alphabet.put(24,'y');
		alphabet.put(25,'z');
    	
		int lexicon=0;
		char returnChar = 'a';
		
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			for(int key: alphabet.keySet())
    			{    
    				String substitutionJitsu=""+praiseTheSun.get(i);
    				substitutionJitsu=substitutionJitsu.toLowerCase();
    				
    				char aLog=substitutionJitsu.charAt(0);
    				
    				if(aLog==alphabet.get(key) && key>lexicon)
    				{
    					lexicon=key;
    					returnChar=praiseTheSun.get(i);
    				}
    			}
    		}
    		
    		return returnChar;
    }
    
    public static void main(String[] args)
    {
	    	ArrayList<Double> list = new ArrayList<Double>();
	    	list.add(-1.38);
	    	list.add(-2.56);
	    	list.add(-1.5);
	    	
	    	System.out.println(q3(list));
    	
    }
}
