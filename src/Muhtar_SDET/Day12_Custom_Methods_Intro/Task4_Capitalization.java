package Muhtar_SDET.Day12_Custom_Methods_Intro;

public class Task4_Capitalization {
    public static void main(String[] args) {

        capitalization("cyDeO", "sCHooL");
    }

    public static void capitalization(String firstName,String lastName ){

        firstName = firstName.toLowerCase().replace(firstName.substring(0,1),firstName.substring(0,1).toUpperCase());
        lastName = lastName.toLowerCase().replace(lastName.substring(0,1),lastName.substring(0,1).toUpperCase());

        System.out.println("full name: " + firstName + " " + lastName);

    }


    }
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */