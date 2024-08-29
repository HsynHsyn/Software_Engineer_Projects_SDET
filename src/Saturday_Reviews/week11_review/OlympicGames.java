package Saturday_Reviews.week11_review;

import java.util.ArrayList;

public class OlympicGames {
    public static ArrayList<MedalResult> medalResultList = new ArrayList<>();
    public static int totalMedals;

    static {
        medalResultList.add(new MedalResult("China", 16, 11, 9));
        medalResultList.add(new MedalResult("France", 12, 14, 15));
        medalResultList.add(new MedalResult("USA", 11, 12, 13));
        medalResultList.add(new MedalResult("Italy", 10, 11, 9));
        medalResultList.add(new MedalResult("Germany", 8, 10, 9));
        medalResultList.add(new MedalResult("Australia", 7, 5, 8));
        medalResultList.add(new MedalResult("South Korea", 6, 6, 6));
        medalResultList.add(new MedalResult("Japan", 5, 5, 7));
        medalResultList.add(new MedalResult("Netherlands", 4, 6, 4));
        medalResultList.add(new MedalResult("Great Britain", 4, 4, 4));
        medalResultList.add(new MedalResult("Canada", 4, 3, 4));
        medalResultList.add(new MedalResult("Brazil", 1, 4, 4));
        medalResultList.add(new MedalResult("Israel", 1, 4, 1));
        medalResultList.add(new MedalResult("Hungary", 3, 2, 2));
        medalResultList.add(new MedalResult("Ireland", 3, 0, 2));
        medalResultList.add(new MedalResult("New Zealand", 2, 4, 1));
        medalResultList.add(new MedalResult("Croatia", 2, 1, 1));
        medalResultList.add(new MedalResult("Belgium", 2, 0, 2));
        medalResultList.add(new MedalResult("Hong Kong", 2, 0, 2));
        medalResultList.add(new MedalResult("Azerbaijan", 2, 0, 0));
        medalResultList.add(new MedalResult("Sweden", 1, 2, 2));
        medalResultList.add(new MedalResult("Georgia", 1, 2, 0));
        medalResultList.add(new MedalResult("Switzerland", 1, 1, 4));
        medalResultList.add(new MedalResult("Spain", 1, 1, 3));
        medalResultList.add(new MedalResult("Kazakhstan", 1, 1, 2));
        medalResultList.add(new MedalResult("South Africa", 1, 1, 2));
        medalResultList.add(new MedalResult("Ukraine", 1, 1, 1));
        medalResultList.add(new MedalResult("Uzbekistan", 1, 0, 2));
        medalResultList.add(new MedalResult("Czech Republic", 1, 0, 1));
        medalResultList.add(new MedalResult("Guatemala", 1, 0, 1));
        medalResultList.add(new MedalResult("Argentina", 1, 0, 0));
        medalResultList.add(new MedalResult("Ecuador", 1, 0, 0));
        medalResultList.add(new MedalResult("Philippines", 1, 0, 0));
        medalResultList.add(new MedalResult("Serbia", 1, 0, 0));
        medalResultList.add(new MedalResult("Slovenia", 1, 0, 0));
        medalResultList.add(new MedalResult("Uganda", 1, 0, 0));
        medalResultList.add(new MedalResult("Mexico", 0, 2, 1));
        medalResultList.add(new MedalResult("North Korea", 0, 2, 0));
        medalResultList.add(new MedalResult("Greece", 0, 1, 3));
        medalResultList.add(new MedalResult("Poland", 0, 1, 3));
        medalResultList.add(new MedalResult("Kosovo", 0, 1, 1));
        medalResultList.add(new MedalResult("Turkey", 0, 1, 1));
        medalResultList.add(new MedalResult("Denmark", 0, 1, 0));
        medalResultList.add(new MedalResult("Ethiopia", 0, 1, 0));
        medalResultList.add(new MedalResult("Fiji", 0, 1, 0));
        medalResultList.add(new MedalResult("Mongolia", 0, 1, 0));
        medalResultList.add(new MedalResult("Tunisia", 0, 1, 0));
        medalResultList.add(new MedalResult("India", 0, 0, 3));
        medalResultList.add(new MedalResult("Chinese Taipei", 0, 0, 2));
        medalResultList.add(new MedalResult("Moldova", 0, 0, 2));
        medalResultList.add(new MedalResult("Tajikistan", 0, 0, 2));
        medalResultList.add(new MedalResult("Austria", 0, 0, 1));
        medalResultList.add(new MedalResult("Egypt", 0, 0, 1));
        medalResultList.add(new MedalResult("Jamaica", 0, 0, 1));
        medalResultList.add(new MedalResult("Lithuania", 0, 0, 1));
        medalResultList.add(new MedalResult("Portugal", 0, 0, 1));
        medalResultList.add(new MedalResult("Slovakia", 0, 0, 1));

        for (MedalResult eachResult : medalResultList) { // finding total medals
            totalMedals += eachResult.total;
        }
    }



    public static void searchByCountry(String country) {
        for(MedalResult result : medalResultList) {
            if (result.country.equalsIgnoreCase(country)) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void searchByTotalMedals(int total) { // finding which country gain total medals
        for(MedalResult each : medalResultList) {
            if (each.total >= total) {
                System.out.println(each);
            }
        }
    }

    public static void addMedalResult(String country, int gold, int silver, int bronze) {
        //search country and add all medals. then update totalMedals as well
        for(MedalResult result1 : medalResultList) {
            if (result1.country.equalsIgnoreCase(country)) {
                result1.gold += gold;
                result1.silver += silver;
                result1.bronze += bronze;

                totalMedals += gold + silver + bronze; // it should be used like this because totalMedals is static and we should update.
//                                                        // it pulls everything from static block
                System.out.println("result1 = " + result1);
                break;

//              result1 =  new MedalResult(result1.country, result1.gold + gold,result1.silver + silver, result1.bronze + bronze); // this way is not best practice because it creates new object

            }
        }

    }

}