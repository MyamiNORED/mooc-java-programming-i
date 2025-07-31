
public class Song {

    private String artist;
     private String name;
    private int durationInSeconds;

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

   

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }
        Song comparedSong = (Song) compared;

        // if the values of the object variables are the same, the objects are equal
         if (0 ==  this.artist.compareTo(comparedSong.getArtist()) && 0 == this.name.compareTo(comparedSong.getName()) && this.durationInSeconds == comparedSong.getDurationInSeconds() )
                 {
                     return true;
                 }
 

        // otherwise the objects are not equal
        return false;
    }

}
