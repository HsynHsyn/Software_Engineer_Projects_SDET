package Muhtar_SDET.Day43_CollectionsAndMaps.leaderBoard;

import java.util.Set;
import java.util.TreeSet;

public class Leaderboard {
    private Set<Player> leaderboard;

    public Leaderboard() {
        leaderboard = new TreeSet<>();
    }

    public void addPlayer(String username, int score) {
        leaderboard.add(new Player(username, score));
    }

    @Override
    public String toString() {
        String output = "LEADERBOARD:\n";
        for (Player player : leaderboard) {
            output += player.getUsername() + " - " + player.getScore() + "\n";
        }
        return output;
    }
}