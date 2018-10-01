import java.util.HashMap;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class TestingGrounds18 
{
    
    
    /**
     * q1: Write a public static method named q1 that takes no parameters and has return type 
     * HashMap of String to String. In this method, you may assume there is a file named 
     * "sustainable.csv" with lines in the format 
     * "line(String),expand(Integer),support(Strin
     * ,unfortunately(String),closest(String),exclusively(String)" where each Integer column 
     * contains only well-formed integers. There is no header line in this file. This method will 
     * return a new HashMap that maps "line" to "unfortunately" by putting one key-value pair 
     * into the HashMap for each line in "sustainable.csv"
     */
    public static HashMap<String, String> q1()
    {
    	    	    	
    		try
    		{
    			HashMap<String, String> praiseTheSun= new HashMap<String, String>();
    			ArrayList<String>blah=new ArrayList<String>();
    			
    			String together="";
    			String fileName="sustainalbe.csv";
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
     * q2: Write a public static method named q2 that takes no parameters and has return type 
     * boolean. This method will attempt to open a file named "through.txt" and returns true if 
     * the file exists and contains the String "testimony" as a sub-String on any line, and false 
     * if "testimony" is not found. This method will also return false if "through.txt" does not 
     * exist
     */
    public static boolean q2()
    {
    		ArrayList<String> praiseTheSun= new ArrayList<String>();
    	
    		try
    		{
    			String fileName="through.txt";
    			
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
    				if(praiseTheSun.get(i).equals("testimony"))
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
     * boolean. This method will attempt to open a file named "comprehensive.txt" and returns 
     * true if the file exists and contains the String "thin" as a sub-String on any line, and 
     * false if "thin" is not found. This method will also return false if "comprehensive.txt" 
     * does not exist
     */
    public static boolean q3()
    {
    	
		ArrayList<String> praiseTheSun= new ArrayList<String>();
    	
    		try
    		{
    			String fileName="comprehensive.txt";
    			
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
    				if(praiseTheSun.get(i).equals("thin"))
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
     * q4: Write a public static method named q4 that takes no parameters and has return type 
     * void. This method will create new file named "pain.txt" that contains the phrases 
     * "convinced jurisdiction", "positive mystery", "financial episode", and "capable fill" with 
     * each phrase on a separate line
     */
    public static void q4()
    {
    		try
    		{
    			String fileName="pain.txt";
    			
    			String textToWrite[]= new String[4];
    			textToWrite[0]="convinced jurisdiction\n";
    			textToWrite[1]="positive mystery\n";
    			textToWrite[2]="financial episode\n";
    			textToWrite[3]="capable fill\n";
    			
    			Files.write(Paths.get(fileName), textToWrite[0].getBytes());
    			Files.write(Paths.get(fileName), textToWrite[1].getBytes(),StandardOpenOption.APPEND);
    			Files.write(Paths.get(fileName), textToWrite[2].getBytes(),StandardOpenOption.APPEND);
    			Files.write(Paths.get(fileName), textToWrite[3].getBytes(),StandardOpenOption.APPEND);
    		}
    		
    		catch(IOException ex)
    		{
    			ex.printStackTrace();
    		}
    }
    
    
    
    /**
     * q5: Write a public static method named q5 that takes no parameters and has return type 
     * void. This method will create new file named "great.txt" that contains the phrases 
     * "foreign empire", "primary wheel", and "suspicious tie" with each phrase on a separate 
     * line
     */
    public static void q5()
    {
    		
    		try
    		{
        		String fileName="great.txt";
        		
        		String [] textToWrite= new String[3];
        		textToWrite[0]="foreign empire\n";
        		textToWrite[1]="primary wheel\n";
        		textToWrite[2]="suspicious tie\n";
        		
        		Files.write(Paths.get(fileName), textToWrite[0].getBytes());
        		Files.write(Paths.get(fileName), textToWrite[1].getBytes(),StandardOpenOption.APPEND);
        		Files.write(Paths.get(fileName), textToWrite[2].getBytes(),StandardOpenOption.APPEND);

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
    		q4();
    		q5();
    }
}
