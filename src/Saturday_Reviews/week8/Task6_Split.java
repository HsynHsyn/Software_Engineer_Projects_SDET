package Saturday_Reviews.week8;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Task6_Split {
    public static void main(String[] args) {

        String result = "About 3,940,000,000 results (0.39 seconds)";
        String [] resultArr = result.split(" ");
        System.out.println(Arrays.toString(resultArr));
        System.out.println("Number of words : " + resultArr.length);
        int[] nums2 = {35, 12, 78, 24, 50};

        // reverse
        nums2 = ArraysUtility.reverse(nums2);
        System.out.println(Arrays.toString(ArraysUtility.reverse(resultArr)));

        }
    }

