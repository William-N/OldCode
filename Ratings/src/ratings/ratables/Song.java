package ratings.ratables;

public class Song extends Ratable
{
	
	private String videoID;
	private String videoArtist;
	private String videoTitle;
	
	public Song(String youTubeID, String artist, String title)
	{
		
		videoID=youTubeID;
		videoArtist=artist;
		videoTitle=title;
		
	}
	
	
	public String getID()
	{
	  return videoID;
	}
	  
	public String getLink()
	{
	  return "https://www.youtube.com/watch?v=" + videoID;
	}
 
	public String getDescription()
	{
	  return videoArtist + " - " + videoTitle;
	}
	
	
	
}