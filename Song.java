/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    private String songName;
    private double songDur;
    private boolean liked;
    private String artist;
    //Fields-- what information do we want each Song to store?
    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String songName, String artist, double songDur, boolean liked)
    {
        this.songName = songName;
        this.songDur = 0;
        this.liked = false;
        this.artist = artist;
    }
     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
          return songName;  
    }
    public String getArtist()
    {
        return artist;
    }
    public double songDur()
    {
        return songDur;
    }
    public boolean isLiked()
    {
        return liked;
    }
    public void like()
    {
        liked = true;
    }
    public void unlike()
    {
        liked = false;
    }
}