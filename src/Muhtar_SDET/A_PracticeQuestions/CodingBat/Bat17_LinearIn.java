package Muhtar_SDET.A_PracticeQuestions.CodingBat;

import java.util.ArrayList;

public class Bat17_LinearIn {

    public static void main(String[] args) {
        System.out.println(linearIn((new int[] {1, 1, 1, 2, 4}),new int[]{2, 4}));
    }
    public static boolean linearIn(int[] outer, int[] inner) {

       ArrayList<Integer> outerList = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();

        for (int each : outer) {
            outerList.add(each);
        }

        for (int each : inner) {
            innerList.add(each);
        }

        for (int i = 0; i < inner.length; i++) {
            if (!outerList.contains(innerList.get(i))){
                return false;

            }

        }

        return true;
    }

}
/*
Given two arrays of ints sorted in increasing order, outer and inner,
return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays,
taking advantage of the fact that both arrays are already in sorted order.


linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */