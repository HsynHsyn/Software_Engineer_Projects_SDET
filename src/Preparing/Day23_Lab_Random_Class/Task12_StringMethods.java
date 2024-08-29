package Preparing.Day23_Lab_Random_Class;

public class Task12_StringMethods {
    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));

    }

    public static boolean catDog(String str) {

        int countDog =0;
        int countCat =0;

        for (int i = 0; i < str.length()-2; i++) {

           if ((str.substring(i, i + 3).equalsIgnoreCase("cat")) ) {

                countCat++;
           }else if (str.substring(i, i + 3).equalsIgnoreCase("dog") ) {
               countDog ++;
           }
        }
        System.out.println(countCat + "," + countDog);
        if (countDog == countCat) {
            return true;
        }else {
            return false;
        }

    }

}
/*
Return true if the string "cat" and "dog" appear the same number of times in the given
string.

catDog("catdog") → true

catDog("catcat") → false

catDog("1cat1cadodog") → true
 */