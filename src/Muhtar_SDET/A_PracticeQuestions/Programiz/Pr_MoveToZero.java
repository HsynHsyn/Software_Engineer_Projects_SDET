package Muhtar_SDET.A_PracticeQuestions.Programiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pr_MoveToZero {
    public static void main(String[] args) {


        System.out.println(moveZerosToEnd(Arrays.asList(new Integer[] {1,0,2,0,3,0})));
    }

    public static List<Integer> moveZerosToEnd(List<Integer> nums) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int count = 0;
        for (Integer each : nums) {
            if (each != 0) {
                arrayList.add(each);
            }else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arrayList.add(0);
        }

        return arrayList;
    }

}
// https://app.programiz.pro/community-challenges/challenge/java-move-zeros-to-end/info