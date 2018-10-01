import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_wfnichol_0014
{
    
    
    /**
     * q1: Write a public static method named q1 that takes an ArrayList of type Integer and 
     * returns a double. This method returns the maximum result (do not return the original 
     * value) of taking the cosine of each value from the input
     */
    public static double q1(ArrayList<Integer> praiseTheSun)
    {
    		double returnValue=0;
    	
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			returnValue=returnValue+Math.cos(praiseTheSun.get(i));
    		}
    		
    		return returnValue;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an ArrayList of Doubles as a 
     * parameter and returns an int. This method returns the index of the first value in the 
     * input that is in the range (-2.34, 14.2) and returns -1 if the input contains no values in 
     * this range
     */
    public static int q2(ArrayList<Double> praiseTheSun)
    {
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			if(praiseTheSun.get(i)>=-2.34 && praiseTheSun.get(i)<=14.2)
    			{
    				return i;
    			}
    		}
    		
    		return -1;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes an ArrayList of Doubles as a 
     * parameters and returns a double. This method returns the value from the input ArrayList 
     * that is closest to 47.06
     */
    public static double q3(ArrayList<Double> praiseTheSun)
    {
		double returnValue=Math.abs(praiseTheSun.get(0)-47.06);
		double difference=0;
		int returnIndex=0;
		
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{    			
    			difference=Math.abs(praiseTheSun.get(i)-47.06);
    			
    			if(returnValue>=difference)
    			{
    				returnValue=difference;
    				returnIndex=i;
    			}
    				
    		}
    		return praiseTheSun.get(returnIndex);
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a HashMap of type String to String 
     * and returns a String. This method returns the String that comes first lexicographically 
     * (case sensitive) from the values of the input
     */
    public static String q4(HashMap<String, String> hashBrown)
    {
    		HashMap<Integer, String> alphabet= new HashMap<Integer, String>();
    		alphabet.put(0,"a");
    		alphabet.put(1, "b");
    		alphabet.put(2, "c");
    		alphabet.put(3, "d");
    		alphabet.put(4,"e");
    		alphabet.put(5,"f");
    		alphabet.put(6,"g");
    		alphabet.put(7,"h");
    		alphabet.put(8,"i");
    		alphabet.put(9,"j");
    		alphabet.put(10,"k");
    		alphabet.put(11,"l");
    		alphabet.put(12,"m");
    		alphabet.put(13,"n");
    		alphabet.put(14,"o");
    		alphabet.put(15,"p");
    		alphabet.put(16,"q");
    		alphabet.put(17,"r");
    		alphabet.put(18,"s");
    		alphabet.put(19,"t");
    		alphabet.put(20,"u");
    		alphabet.put(21,"v");
    		alphabet.put(22,"w");
    		alphabet.put(23,"x");
    		alphabet.put(24,"y");
    		alphabet.put(25,"z");

    		int start=25;
    		String returnString="";
    		
    		for(String key: hashBrown.keySet())
    		{
    			String currentString=hashBrown.get(key);
    			String firstLetter=currentString.substring(0,1);

    			for(int letters: alphabet.keySet())
    			{
    				if(alphabet.get(letters)==firstLetter && letters<start)
    				{
    					start=letters;
    					returnString=hashBrown.get(key);
    				}
    			}
    		}
    		
    		return returnString;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes an ArrayList of type Character and 
     * returns a char. This method returns the char that comes first lexicographically (case 
     * sensitive) from the values of the input
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
    	
		int lexicon=25;
		char returnChar = 'z';
		
    		for(int i=0; i<praiseTheSun.size(); i++)
    		{
    			for(int key: alphabet.keySet())
    			{
    				if(praiseTheSun.get(i)==alphabet.get(key) && key<lexicon)
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
                
    }
}
