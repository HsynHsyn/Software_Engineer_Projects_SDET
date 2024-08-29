package Java_Labs.TheWeek5;

import java.util.Scanner;

public class Task1_Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java Hotel");
        System.out.println("How many days will you stay: ");
        int numberOfDay = input.nextInt();

        System.out.println("How many people are in your party: ");
        int peopleInParty = input.nextInt();

        input.nextLine();

//        System.out.println("Which type room would you like to stay: ");
//        String roomType = input.nextLine().toLowerCase();

        int price = 0;
        String roomType ="";
        if (peopleInParty == 1) {
            price = numberOfDay * 100;
            roomType = "single room";
        } else if (peopleInParty == 2) {
            price = numberOfDay * 125;
            roomType = "double room";
        } else if ((peopleInParty == 3 && peopleInParty == 4)){
            price = numberOfDay * 50;
            roomType = "large room";
        }else if ( (peopleInParty == 5 && peopleInParty == 6)) {
            price = numberOfDay * 1000;
            roomType = "suite";
        }else {
            System.out.println("sorry " + peopleInParty + " is not a valid group size");
        }
        System.out.println("Your room type is " + roomType +"\n" + "Your bill is " + price);

        /*
        //second solution
        switch (peopleInParty) {
            case 1 :
                roomType = "single room";
                price = numberOfDay * 100;
                break;
            case 2 :
                roomType = "double room";
                price = numberOfDay * 125;
                break;
            case 3,4 :
                roomType = "larger room";
                price = peopleInParty* numberOfDay * 50;
                break;
            case 5,6 :
                roomType = "suite";
                price =  numberOfDay *1000;
                break;
            default:
                System.out.println("sorry " + peopleInParty + " is not a valid group size"); */
        }

    }


/*
Task 1
Hotel [scanner, conditional, operators]

    Create a program that will allow you to check into a hotel. When checking in some information will be gathered and used to determine the information about the room and price

    Go through the following flow:

        Welcome to the Java Hotel
        How many days will you stay
        -> read number of days from console
        How many people are in your party
        -> read number of people from console

    In addition, declare these variables:
        price, room type

    Use the information gathered to assign a room to the guests and print the information

    Data:

        people 1 | single room | price: number of days staying * 100
        people 2 | double room | price: number of days staying * 125
        people 3 or 4 | large room | price: number of days staying * number of people * 50
        people 5 or 6 | suite | price: number of days staying * 1000

        any other number of people is invalid and should output:
            sorry $number_of_people is not a valid group size

 */