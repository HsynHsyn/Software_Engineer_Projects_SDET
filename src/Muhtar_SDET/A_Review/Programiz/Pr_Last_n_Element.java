package Muhtar_SDET.A_Review.Programiz;

import java.util.Arrays;

public class Pr_Last_n_Element {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getLastNElements(new int[]{1,2,3,4,5},3)));
    }

    public static int[] getLastNElements(int[] arr, int n) {


        int [] arr1 = new int[n];

        for (int i = 0; i < n; i++) {

            arr1[i] =  arr[arr.length-n +i];

        }

        return arr1;
    }
}
//https://app.programiz.pro/community-challenges/challenge/java-retrieve-last-n-elements/info
