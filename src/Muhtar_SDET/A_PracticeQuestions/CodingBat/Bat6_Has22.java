package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Bat6_Has22 {
    public static void main(String[] args) {

        System.out.println( has22(new int[] {2, 2, 1, 2}));

    }

    public static boolean has22(int[] array) {

        /*boolean result = false;

        for (int i = 0; i < array.length-1; i++) { // it is used to array.length-1 because to match for last index`s element

            if (array[i] == (array[i+1] ) ){
                result = true;
                break;

            }else {
                result = false;
            }

        }


        return result;*/ // second solution
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i + 1] == 2) {
                return true;
            }

        }
        return false;
    }
        
}


/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */