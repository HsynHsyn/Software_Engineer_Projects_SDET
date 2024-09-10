package Muhtar_SDET.Day43_CollectionsAndMaps.playList;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object obj) {
        Song song =(Song)obj;
        return song.title.equals(this.title) && song.artist.equals(this.artist);
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}
