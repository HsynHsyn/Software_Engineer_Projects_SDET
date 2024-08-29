package Saturday_Reviews.week11_review;

public class MedalResult {
    public String country;
    public int gold;
    public int silver;
    public int bronze;
    public int total;
    //MedalResult m = new MedalResult("France", 12,14,15);
    public MedalResult(String country, int gold, int silver, int bronze) {
        this.country = country;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.total = gold+silver+bronze;
    }

    @Override
    public String toString() {
        return "\nMedalResult{" +
                "country='" + country + '\'' +
                ", gold=" + gold +
                ", silver=" + silver +
                ", bronze=" + bronze +
                ", total=" + total +
                '}';
    }
}
