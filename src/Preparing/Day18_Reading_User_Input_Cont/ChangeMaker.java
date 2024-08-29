/* Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of change
- quarter : 25 cents // 87 cents: 3 quarters 1dimes 0 nickles 2 pennies
-dimes: 10 cents
-nickles: 5 cents
pennies: 1 cent
 */

package Preparing.Day18_Reading_User_Input_Cont;

import java.util.Scanner;

public class ChangeMaker {

    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter a number from 1-99 :");
        int user_amount= keyboard.nextInt();

        if(user_amount>1 && user_amount<100){
            changeMaker(user_amount);
        }else {
            System.out.println("Invalid Data");
        }

        changeMaker(user_amount);
    }

    public static void changeMaker(int amount){

        int originalAmount=amount;

        int quarters=amount/25;
        amount=amount%25;

        int dimes=amount/10;
        amount=amount%10;

        int nickles=amount/5;
        amount=amount%5;
        int pennies=amount;

        System.out.println(originalAmount+ " cents in coins can be given as ");
        System.out.println(quarters+ " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles+ " nickles");
        System.out.println(pennies+ " pennies");


    }


    }
