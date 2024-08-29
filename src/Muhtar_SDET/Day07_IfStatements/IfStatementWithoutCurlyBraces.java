package Muhtar_SDET.Day07_IfStatements;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {
        int age = 32;

        if (age < 5) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        System.out.println("------------------------------");

        if (age < 5) System.out.println("Eligible"); // if Statement needs to carry one statement
        else System.out.println("Not Eligible");

        System.out.println("------------------------------");

        int itemNum = 1;

        if (itemNum==1) {                 // there are two statements and we have to use curly braces
            System.out.println("Eggs");
            System.out.println("Orange");
        }else if (itemNum==2){
            System.out.println("Milk");
            System.out.println("Onion");
        }else{
            System.out.println("Apple");
            System.out.println("Cherry");
        }




    }
}
