package Muhtar_SDET.Day43_CollectionsAndMaps.playList;

public class Spotify {
    public static void main(String[] args) {

        MusicPlaylist studyMusic = new MusicPlaylist("study Music");
        studyMusic.addSong("1 hour rain", "Nature");
        studyMusic.addSong("Piano Lofi", "ClassicalMusic");

        System.out.println(studyMusic);

        MusicPlaylist gymPlaylist = new MusicPlaylist("The Gym");
        gymPlaylist.addSong("Do not stop believing", "artist");
        gymPlaylist.addSong("Interstellar", "guys");

        System.out.println(gymPlaylist);
        gymPlaylist.removeSong("Do not stop believing", "artist");

        System.out.println(gymPlaylist);


    }


}
