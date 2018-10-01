import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet_wfnichol_0019
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and has return type 
     * HashMap of String to String. In this method, you may assume there is a file named 
     * "distribute.csv" with lines in the format 
     * "much(String),concede(String),reputation(S
     * tring),afterward(String),encouraging(Integer),plenty(String)" where each Integer column 
     * contains only well-formed integers. There is no header line in this file. This method will 
     * return a new HashMap that maps "much" to "concede" by putting one key-value pair into the 
     * HashMap for each line in "distribute.csv"
     */
    public static HashMap<String, String> q1()
    {
    	    	    	
    		try
    		{
    			HashMap<String, String> praiseTheSun= new HashMap<String, String>();
    			ArrayList<String>blah=new ArrayList<String>();
    			
    			String together="";
    			String fileName="distribute.csv";
    			String[] united= new String[6];
    			
    			for(String line: Files.readAllLines(Paths.get(fileName)))
    			{
    				blah.add(line);
    			}   
    			
    			for(int i=0; i<blah.size(); i++)
    				together=together+blah.get(i);
    			
    			united=together.split(",");
    			
    			for(int i=0;i<3;i++)
    			{
    				for(int it=3;i<6;i++)
    				{
    					praiseTheSun.put(united[i],united[it]);
    				}
    			}

    			
    			return praiseTheSun;
    		}
    		
    		catch (IOException ex)
    		{
    			ex.printStackTrace();;
    		}
    		
    		return null;
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes a String as a parameter and has 
     * return type int. The input String will be the name a csv file in the format 
     * "every,disturbing,key,ideal,empty,costly,slight,initial" where all values are well-formed 
     * integers. There is no header line in this file. This method will return the sum of the 
     * values in the "key" column as an int.
     */
    public static int q2(String fileName)
    {
    	
    		try
    		{
    			ArrayList<String> blah= new ArrayList<String>();
    			String boob="";
    			String[] poopy= new String[8];
    			
        		for(String line: Files.readAllLines(Paths.get(fileName)))
        		{	
        			blah.add(line);
        		}

        		for(int i=0; i<blah.size(); i++)
        			boob=boob+blah.get(i);
        		
        		poopy=boob.split(",");
        		
        		return poopy.length;
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}

    		return -1;
    }
    
    
    
    /**
     * q3: Write a public static method named q3 that takes no parameters and has return type 
     * void. This method will create new file named "equally.txt" that contains the phrases 
     * "ultimate jungle", "sound sheet", and "regional wrist" with each phrase on a separate line
     */
    public static void q3()
    {
    		try
    		{
    			String fileName="equally.txt";
    			String line1="ultimate jungle\n";
    			String line2="sound sheet\n";
    			String line3="regional wrist\n";
    			
    			Files.write(Paths.get(fileName), line1.getBytes());
    			Files.write(Paths.get(fileName), line2.getBytes(), StandardOpenOption.APPEND);
    			Files.write(Paths.get(fileName), line3.getBytes(), StandardOpenOption.APPEND);
    			
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    }
    
    
    
    /**
     * q4: Write a public static method named q4 that takes no parameters and has return type 
     * boolean. This method will attempt to open a file named "champion.txt" and returns true if 
     * the file exists and contains the String "wrong" as a sub-String on any line, and false if 
     * "wrong" is not found. This method will also return false if "champion.txt" does not exist
     */
    public static boolean q4()
    {
    		try
    		{
    			ArrayList<String> praiseTheSun= new ArrayList<String>();
    			String fileName="champion.txt";
    			
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
    				if(praiseTheSun.get(i).equals("wrong"))
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
     * q5: Write a public static method named q5 that takes no parameters and has return type 
     * void. In this method, you may assume there is a file named "properties.csv" with lines in 
     * the format "name,indigenous,classic,increasing" where "name" is a String and all other 
     * values are well-formed integers. There is no header line in this file. This method will 
     * create a new file named "output.csv" in the format "name,indigenous" containing only these 
     * two columns from "properties.csv" and only for lines with a name of "adolescent", 
     * "hunting", or "production"
     */
    public static void q5()
    {
    		try
    		{
    			String[] blah=new String[4];
    			String together="";
    			String drawFileName="properties.csv";
    			String newFileName="output.csv";
    			
    			for(String line: Files.readAllLines(Paths.get(drawFileName)))
    			{
    				together=together+line;
    			}
    			
    			blah=together.split(",");
    			
    			Files.write(Paths.get(newFileName), blah[0].getBytes());
    			Files.write(Paths.get(newFileName), blah[2].getBytes(), StandardOpenOption.APPEND);
    			Files.write(Paths.get(newFileName), blah[0].getBytes(), StandardOpenOption.APPEND);
    			Files.write(Paths.get(newFileName), blah[3].getBytes(), StandardOpenOption.APPEND);

    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    }
    
    
    
    public static void main(String[] args)
    {
        
        
    }
}
