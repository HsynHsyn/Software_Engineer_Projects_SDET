package Muhtar_SDET.A_Review.CodingBat.string;

public class Bat3_catDog {
    public static void main(String[] args) {
        System.out.println(catDog("ca"));
    }
    public static boolean catDog(String str) {

        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i <= str.length()-3; i++) { // for (int i = 0; i < str.length()-2; i++)  it is run
            if (str.substring(i,i+3).equals("cat")){
                catCount ++;
            }
            if (str.substring(i,i+3).equals("dog")){
                dogCount ++;
            }

        }
        if (catCount==dogCount){
            return true;  // If both counts are equal, return true
        }

        return false;
    }


}

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */