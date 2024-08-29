package Preparing.Day23_Lab_Random_Class;

public class Task14_StringMethods {
    public static void main(String[] args) {

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("ly"));
        System.out.println(endsLy("oddy"));

    }

    public static boolean endsLy(String str) {

        if (str.substring(str.length()-2).equals("ly") ){
            return true;
        }else {
            return false;
        }


    }
}
/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true

endsLy("y") → false

endsLy("oddy") → false
 */