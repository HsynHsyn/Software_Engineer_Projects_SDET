package Muhtar_SDET.Day43_CollectionsAndMaps.leaderBoard;

public class Game {
    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard();


        leaderboard.addPlayer("jBond", 700);
        leaderboard.addPlayer("Lela", 890);
        leaderboard.addPlayer("Nick", 400);
        leaderboard.addPlayer("Penny", 750);

        Leaderboard leaderboard1 = new Leaderboard();


        leaderboard1.addPlayer("Hakan", 700);
        leaderboard1.addPlayer("Halime", 890);
        leaderboard1.addPlayer("Huseyin", 400);
        leaderboard1.addPlayer("Telli", 750);



        Player player1= new Player("Hakan", 700);
        Player player2= new Player("Huseyin", 500);


        System.out.println(player1.compareTo(player2));
        System.out.println(leaderboard);


    }
}
