package Muhtar_SDET.Day12_Custom_Methods_Intro;

public class CustomMethodIntroWithParameter {
    public static void main(String[] args) {

        oddOrEven(5);
        System.out.println("-----------------------------------");

        oddOrEven(10000);

    }
    // the method takes an arguments , and verifies if the number is odd number or even number
    public static void oddOrEven(int number){
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }
    }

    // create a method the can check if a person is eligible to buy alcohol (age)

}
