package Muhtar_SDET.A_PracticeQuestions.Review;

import java.util.Scanner;

public class review5_oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
        int number = input.nextInt();

        while(true){
            if (number % 2 == 0) {
                System.out.println(number + " is a even number");
            }else {
                System.out.println(number + " is a odd number");
            }
            System.out.println("Would yo like to enter new number ? Yes/No");
            String answer = input.next().toLowerCase();

            while (! (answer.equals("yes") || answer.equals("no") )){
                System.out.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")){
                break;
            }
        }


    }
}
