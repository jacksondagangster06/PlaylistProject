import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    ArrayList<Song> dopamine;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist()
      {
      dopamine = new ArrayList<Song>();
      }
      
      public void addSong(String name, String artist, String dur, boolean liked)
      {
        Song track = new Song(name, artist, dur, liked);
        dopamine.add(track);
      }

      public ArrayList<Song> likedSongs()
      {
        ArrayList<Song> goodSongs = new ArrayList<Song>();
        for(int i = 0; i < dopamine.size(); i++)
        {
            if(dopamine.get(i).isLiked())
            {
                goodSongs.add(dopamine.get(i));
            }
        }
        return goodSongs;
      }

      public void like(String name)
      {
        for(int i = 0; i < dopamine.size(); i++)
        {
            if(dopamine.get(i).isLiked() == false && dopamine.get(i).getName().equals(name))
            {
                dopamine.get(i).like();
            }
        }
      } 

      public void removeSong(String name)
      {
        for(int i = 0; i < dopamine.size(); i++)
        {
            if(dopamine.get(i).getName().equals(name))
            {
                dopamine.remove(i);
            }
        }
      }

      public double totalDuration()
      {
        double sum = 0;
        for(int i = 0; i < dopamine.size(); i++)
        {
            sum += dopamine.get(i).calcDuration();
        }
        return sum;
      }
      
      



      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song X
       * 'liking' a song X
       * Removing a specific song X
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs X
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
}
