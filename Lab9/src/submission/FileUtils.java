package submission;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils 
{
	
	public static void save(String fileName, String content)
	{
		
		try
		{
			
			Files.write(Paths.get(fileName), content.getBytes());
			
		}
		
		catch(IOException ex)
		{
			
			ex.printStackTrace();
			
		}
		
	}
	
	public static String load(String fileName)
	{
		
		String content="";
		
		try
		{
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				content=content+line+"\n";
				
			}	
			
		}
		
		catch(IOException ex)
		{
			
			ex.printStackTrace();
			
		}
		
		return content;
		
	}
	
}
