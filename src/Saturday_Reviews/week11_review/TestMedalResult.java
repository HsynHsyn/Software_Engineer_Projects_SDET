package Saturday_Reviews.week11_review;

import java.util.ArrayList;

public class TestMedalResult {
    public static void main(String[] args) {
        MedalResult USA = new MedalResult("United States", 11, 20, 20);
        System.out.println("USA = " + USA);

        MedalResult sweden = new MedalResult("Sweden", 1, 1, 2);
        System.out.println("sweden = " + sweden);

        System.out.println(OlympicGames.medalResultList);

        MedalResult mr1 = new MedalResult("Austria", 0, 0 , 1);
        System.out.println(mr1.total);

        MedalResult mr2 = new MedalResult("Canada", 3, 4, 7);
        System.out.println(mr2);
        System.out.println("Canada total = " + mr2.total);

        ArrayList<MedalResult> list = new ArrayList<>();
        System.out.println("list = " + list);
        list.add(mr1);
        list.add(mr2);
        list.add(new MedalResult("Germany", 4, 3, 2));
        System.out.println("list = " + list);

        OlympicGames games  = new OlympicGames();
        System.out.println("-------------------------------");
       games.addMedalResult("Germany", 100, 100, 100);
        System.out.println(OlympicGames.totalMedals);


    }
    }
