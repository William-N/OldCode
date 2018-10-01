package ratings;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.http.client.fluent.Request;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

import ratings.ratables.Product;
import ratings.ratables.Ratable;
import ratings.ratables.Song;

public class DataSources 
{
	
	public static ArrayList<Song> readSongCSVFile(String fileName)
	{
		
		ArrayList<Song> songRatings = new ArrayList<Song>();
		String watchList = "";
		
		try
		{
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				String[] lineValues = new String[4];
				lineValues = line.split(",");
				
				if(!watchList.contains(lineValues[0]))
				{
					watchList = watchList + "," + lineValues[0];
					
					Song putSong = new Song(lineValues[0], lineValues[1], lineValues[2]);
					putSong.addRating(Double.parseDouble(lineValues[3]));
					
					songRatings.add(putSong);
				}
				else
				{
					for (int i = 0; i < songRatings.size(); i++)
					{
						if(songRatings.get(i).getID().equals(lineValues[0]))
						{
							songRatings.get(i).addRating(Double.parseDouble(lineValues[3]));
						}
					}
				}
			}

			
		}
		
		catch(IOException e)
		{
			
			e.printStackTrace();
		}
		
		return songRatings;
		
	}
	
	
	
	
	public static ArrayList<Ratable> readSongsAsRatables(String fileName)
	{
		
		ArrayList<Ratable> ratableRatings=new ArrayList<Ratable>();
		ArrayList<Song> songRatings=readSongCSVFile(fileName);
		
		for(int i=0; i<songRatings.size(); i++)
		{
			ratableRatings.add(songRatings.get(i));
		}
		
		return ratableRatings;
		
	}
	
	
	
	
	public static ArrayList<Ratable> readProductCSVFile(String fileName)
	{
		
		ArrayList<Ratable> productRatings=new ArrayList<Ratable>();
		String watchList="";
		
		try
		{
			
			for(String line: Files.readAllLines(Paths.get(fileName)))
			{
				
				String[] lineValues=new String[5]; //"asin,reviewerName,rating,review"
				lineValues=line.split(",");
				
				if(!watchList.contains(lineValues[0]))
				{
					
					watchList=watchList+","+lineValues[0];
					
					Product putProduct=new Product(lineValues[0]);
					putProduct.addRating(Double.parseDouble(lineValues[2]));
					
					productRatings.add(putProduct);
					
				}
				
				else
				{
					
					for(int i=0; i<productRatings.size(); i++)
					{
						if(productRatings.get(i).getID().equals(lineValues[0]))
						{
							
							productRatings.get(i).addRating(Double.parseDouble(lineValues[2]));
							
						}
					}
					
				}
				
			}
			
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	
		return productRatings;
		
	}
	
	
	
	
	public static ArrayList<Ratable> getSongsFromAPI()
	{
		
		String urlString="https://fury.cse.buffalo.edu/api/musicRatings/getAllSongs";
		JsonValue value=null;
		JsonArray data=new JsonArray();
		String jsonString="";
		ArrayList<Ratable> returnListofSongs=new ArrayList<Ratable>();
		
		jsonString=getRequest(urlString);
		
		value=Json.parse(jsonString);
		data=value.asArray();
		
				
		for(int i=0; i<data.size(); i++)
		{
		
			JsonObject currentJson=data.get(i).asObject();
			String youTubeID=currentJson.get("youtubeID").asString();
			String artist=currentJson.get("artist").asString();
			String title=currentJson.get("title").asString();
			JsonArray ratingsList=currentJson.get("ratings").asArray();
			
			Song toPut=new Song(youTubeID, artist, title);
			
			for(int j=0; j<ratingsList.size(); j++)
			{
				
				toPut.addRating(ratingsList.get(j).asDouble());
				
			}
			
			returnListofSongs.add(toPut);
			
		}
		
		return returnListofSongs;
		
	}
	
	public static String getRequest(String url){
	    String response = "";

	    try{
	        response = Request.Get(url).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }

	    return response;
	}
	
}
