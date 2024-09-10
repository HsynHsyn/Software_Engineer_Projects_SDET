package Muhtar_SDET.Day43_CollectionsAndMaps.playList;

import java.util.LinkedList;
import java.util.List;

public class MusicPlaylist {
    private String name;
    private List<Song> playlist; // we can add LinkedList also

    public MusicPlaylist(String name) {
        this.name = name;
        this.playlist = new LinkedList<>();
    }

    public void addSong(String title, String artist){
        playlist.add(new Song(title, artist));
    }

    public void removeSong(String title, String artist){
        playlist.removeIf(p->p.equals(new Song(title, artist)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getPlaylist() {
        return playlist;
    }


    @Override
    public String toString() {
        return name + "\n" + playlist;
    }
}
