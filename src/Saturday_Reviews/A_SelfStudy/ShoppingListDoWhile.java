package Saturday_Reviews.A_SelfStudy;

import java.util.Scanner;

public class ShoppingListDoWhile {
    public static void main(String[] args) {
        String myList = "";
        String answer = "";
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter Item: ");
            String item = input.next();
            myList += " " +item;

            System.out.println("Do you have more items? Yes");
            answer = input.next();

        }while (answer.equalsIgnoreCase("yes"));

        System.out.println("mylist = " + myList);
    }
}
