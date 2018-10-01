import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_wfnichol_0020
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and has return type 
     * void. This method will create new file named "choice.txt" that contains the phrases "here 
     * elite", "no lunch", "chicken package", and "willing pension" with each phrase on a 
     * separate line
     */
    public static void q1()
    {
    		try
    		{
    			String fileName="choice.txt";
    			String line1="here elite\n";
    			String line2="no lunch\n";
    			String line3="chicken package\n";
    			String line4="willing pension";
    			
    			String test=line1+line2+line3+line4;
    			
    			Files.write(Paths.get(fileName), test.getBytes());
    		//	Files.write(Paths.get(fileName), line1.getBytes());
    		//	Files.write(Paths.get(fileName), line2.getBytes(),StandardOpenOption.APPEND);
    		//	Files.write(Paths.get(fileName), line3.getBytes(),StandardOpenOption.APPEND);
    		//	Files.write(Paths.get(fileName), line4.getBytes(),StandardOpenOption.APPEND);
    			
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes no parameters and has return type 
     * boolean. This method will attempt to open a file named "scratch.txt" and returns true if 
     * the file exists and contains the String "crucial" as a sub-String on any line, and false 
     * if "crucial" is not found. This method will also return false if "scratch.txt" does not 
     * exist
     */
    public static boolean q2()
    {
    		try
    		{
        		ArrayList<String> praiseTheSun= new ArrayList<String>();
    			String fileName="scratch.txt";
    			
    			for(String line: Files.readAllLines(Paths.get(fileName)))
    			{
    				for(int from=0; from<line.length(); from++)
    				{
    					for(int to=from+1; to<=line.length(); to++)
    					{
    						praiseTheSun.add(line.substring(from,to));
    					}
    				}
    			}
    			for(int i=0; i<praiseTheSun.size(); i++)
    			{
    				if(praiseTheSun.get(i).equals("crucial"))
    				{
    					return true;
    				}
    			}
    			
    			return false;
    		}
    		
    		catch(IOException ex)
    		{
    			return false;
    		}
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and has return type 
     * HashMap of Integer to Integer. In this method, you may assume there is a file named 
     * "comprehensive.csv" with lines in the format 
     * "gut(String),barely(String),gang(String),larg
     * ely(Integer),no(Integer),murder(Integer),bat(String)" where each Integer column contains 
     * only well-formed integers. There is no header line in this file. This method will return a 
     * new HashMap that maps "no" to "murder" by putting one key-value pair into the HashMap for 
     * each line in "comprehensive.csv"
     */
    public static HashMap<Integer, Integer> q3()
    {
    		try
    		{
    			
    			HashMap<Integer, Integer> hashBrown=new HashMap<Integer, Integer>();
    			String fileName="comprehensive.csv";
    			String[] blah=new String[7];
    			
    			for(String line: Files.readAllLines(Paths.get(fileName)))
    			{
    				blah=line.split(",");
    				hashBrown.put(Integer.parseInt(blah[4]), Integer.parseInt(blah[5]));
    			}
    			
    			return hashBrown;
    			
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    		return null;
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes a String as a parameter and has 
     * return type int. The input String will be the name a csv file in the format 
     * "dark,burning,one,through,liver" where all values are well-formed integers. There is no 
     * header line in this file. This method will return the sum of the values in the "liver" 
     * column as an int.
     */
    public static int q4(String blah)
    {
    		try
    		{
    			String[] ohYeah= new String[5];
    			String temp="";
    			int returnInt=0;
    			
    			for(String line: Files.readAllLines(Paths.get(blah)))
    			{
    				temp=temp+line;
    			}
    			
    			ohYeah=temp.split(",");
    			
    			returnInt=Integer.parseInt(ohYeah[4]);
    			return returnInt;
    			
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    		return -1;
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and has return type 
     * void. In this method, you may assume there is a file named "properties.csv" with lines in 
     * the format "name,tight,substantial,full" where "name" is a String and all other values are 
     * well-formed integers. There is no header line in this file. This method will create a new 
     * file named "output.csv" in the format "name,full" containing only these two columns from 
     * "properties.csv" and only for lines with a name of "commander", "zone", or "custody"
     */
    public static void q5()
    {
    	
    		try
    		{
    			
    			HashMap<String, Integer> hashBrown=new HashMap<String, Integer>();
    			String[] ohYeah=new String[4];
    			String temp="";
        		String drawFileName="properties.csv";
        		String spitFileName="output.csv";
        		
        		for(String line: Files.readAllLines(Paths.get(drawFileName)))
        		{
        			ohYeah=line.split(",");
        			
        			if(ohYeah[0].equals("commander")||ohYeah[0].equals("zone")||ohYeah[0].equals("custody"))
        			{
            			for(int i=1; i<ohYeah.length; i++)
            			{
            				hashBrown.put(ohYeah[0], Integer.parseInt(ohYeah[i]));
            			}
        			}
        			

        		}
        		
        		for(String key: hashBrown.keySet())
        		{
        			temp=temp+key+hashBrown.get(key)+"\n";
        			
        		}
        		
        		Files.write(Paths.get(spitFileName), temp.getBytes());
        		
    			
    		}

    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    		
    }
    
    
    
    public static void main(String[] args)
    {
        q1();
        q2();
        q3();
        q4("penis.txt");
        q5();
    }
}
