package Muhtar_SDET.Day20_ArraysContinue_ForEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        for (int each : numbers){
            if (each % 2 != 0){
                System.out.println(each);
            }
        }
        System.out.println("-----------------------");

        int[] nums = {1000,222,3,400,525,6785,227,28,953,1520,11};

        int max = numbers[0];
        int min = numbers[0];

        for (int each : nums) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("-----------------------");

        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {10,20,30,40,50,60,70,80,90,100,110,120};

        int[] a3 = new int[a1.length + a2.length];
        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }
        for (int each : a2) {
            a3[k++] = each;
        }
        System.out.println(Arrays.toString(a3));

        System.out.println("-----------------------");
        String[] names = {"Hakan Ozdemir", "Huseyin Oz", "Halime Ozdem"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ") + 1));

        }




    }
}
