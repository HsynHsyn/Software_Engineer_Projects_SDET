package Muhtar_SDET.Day06_IfStatements_Intro;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 == 0;

        if (isEven){
            System.out.println("Even number");
        }if (!isEven){
            System.out.println("Odd number");
        }
    }
}
