package Saturday_Reviews.week8;

import java.util.Arrays;

public class Task5_Reverse {

        public static void main(String[] args) {

                int[] nums2 = {35, 12, 78, 24, 50};
                int[] rev = new int[nums2.length];

                int i = nums2.length-1;
                for (int num : nums2) {
                       num = nums2[i];
                        i--;
                        System.out.print(num + " ");

                }
                // second approach
                System.out.println("________________________");
                for (int j = 0; j <nums2.length ; j++) {

                        rev[j] = nums2[nums2.length - 1 - j];

                }
                System.out.println(Arrays.toString(rev));
                // third approach
            System.out.println("________________________");

            /*public static int[] reverse(int[] nums) {
                for (int i = 0, j = nums.length -1; i < nums.length/2; i++, j--) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                return nums;*/
            }


        }




