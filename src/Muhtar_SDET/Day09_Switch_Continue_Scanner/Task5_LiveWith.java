package Muhtar_SDET.Day09_Switch_Continue_Scanner;

public class Task5_LiveWith {
    public static void main(String[] args) {

        int numberOfPeople = 5;

        String user = "";
        if (numberOfPeople <3){
            user = "Live with less than 3 people";

        } else if (numberOfPeople >= 3 && numberOfPeople<=6) {
            user = "Live with 3 - 6 people";

        }else {
            user ="Live with more than 6 people";
        }
        System.out.println("Users  " + user);


    }
}

/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */