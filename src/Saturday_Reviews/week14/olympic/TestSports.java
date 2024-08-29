package Saturday_Reviews.week14.olympic;

public class TestSports {
    public static void main(String[] args) {

        OlympicSport olympicSport = new OlympicSport("surf", 100);
        olympicSport.compete();
        System.out.println(olympicSport.getClass());
        System.out.println(olympicSport.getParticipants());
        System.out.println(olympicSport);

        System.out.println("-----------------------------------");

        Surfing surfing = new Surfing(50);
        surfing.compete();
        surfing.getParticipants();
        System.out.println(surfing);

        System.out.println("----------------------------------");

        OlympicSport surfing2 = new Surfing(34);
        System.out.println(surfing2);
        surfing2.compete();

        System.out.println("----------------------------------");

        OlympicSport surfing3 = new Surfing(34);
        surfing3.compete();

        System.out.println("----------------------------------");

        OlympicSport soccer = new Soccer(78);
        soccer.compete();

        System.out.println("----------------------------------");

        System.out.println(soccer.YEAR_OF_FIRST_OLYMPICS);
        System.out.println(surfing3.YEAR_OF_FIRST_OLYMPICS);

    }
}
