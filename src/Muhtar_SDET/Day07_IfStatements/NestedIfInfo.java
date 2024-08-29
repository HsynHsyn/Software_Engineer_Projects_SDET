package Muhtar_SDET.Day07_IfStatements;

public class NestedIfInfo {
    public static void main(String[] args) {

        int score = -300;

        if (score >= 0 && score <= 100){ // pre-condition, if the score is valid
            if (score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else { // if the score is not valid
            System.out.println("Invalid Score");
        }
        System.out.println("----------------------------------");

        int age = 32;   // 1 ~ 150


        if (age >= 1 && age <= 150){
            if (age >= 21){
                System.out.println("Eligible");
            }else {
                System.out.println("Not eligible");
            }
        }else{
            System.out.println("Invalid age");
        }

        System.out.println("----------------------------------");



    }
}
