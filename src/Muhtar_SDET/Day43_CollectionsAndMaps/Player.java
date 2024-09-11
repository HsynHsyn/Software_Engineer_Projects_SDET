package Muhtar_SDET.Day43_CollectionsAndMaps.leaderBoard;

public class Player implements Comparable<Player> {
    // Comparable<T> is generic
    /*
    T tipi: Comparable<T> arayüzü, generic bir yapıdır. Yani, T tipi karşılaştırılacak
    sınıfın tipini belirtir.     Örneğin, Comparable<Player> demek, bu sınıfın başka
    Player nesneleriyle karşılaştırılacağını ifade eder.
    compareTo() metodu: Bu arayüzü uygulayan sınıf, compareTo() metodunu override
    (geçersiz kılma) ederek, iki nesnenin nasıl karşılaştırılacağını tanımlar.
     */
    private final String username;
    private final int score;

    public Player(String username, int score) {
        this.username = username;
        this.score = score;
    }

    @Override // it is overridden from Comparable
    public int compareTo(Player otherPlayer) {
        return Integer.compare(otherPlayer.getScore(), this.score);
    }

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }
}
