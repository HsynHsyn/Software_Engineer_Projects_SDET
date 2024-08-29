package Muhtar_SDET.Day13_Custom_Methods_Continue;

public class test {
    public static void main(String[] args) {

        capitalization("cyDeO", "sCHooL");

    }

    public static void capitalization(String firstName, String lastName){

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = (""+lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);
    }
}