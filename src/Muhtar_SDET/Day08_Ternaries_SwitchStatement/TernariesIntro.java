package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class TernariesIntro {
    public static void main(String[] args) {

        int score = 85;

        String result = "";

        if (score >=60){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);
        System.out.println("------------------------------");

        // we use ternary when the if and else simple
        String result2 = (score >=60) ? "Passed" : "Failed" ;
        System.out.println("result2 = " + result2);

        System.out.println("------------------------------");

        int age =34;
        String r;

        if (age >= 21){
            r ="Eligible";
        }else {
            r = "Not Eligible";
        }

        String result3 = (age >= 21) ? "Eligible" : "Not Eligible";
        System.out.println("result3 = " + result3);

    }
}
