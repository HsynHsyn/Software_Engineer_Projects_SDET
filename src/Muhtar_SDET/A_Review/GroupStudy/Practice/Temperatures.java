package Muhtar_SDET.A_Review.GroupStudy.Practice;

import java.util.Arrays;

public class Temperatures {
    public static void main(String[] args) {

        int[] array1 = new int[] {32, 34, 28, 29, 31, 33,36,89};

        int[] array2 = new int[6];

        System.out.println(Arrays.toString(recordTemperatures(array1,6 )));

        System.out.println(Arrays.toString(recordTemperatures(new int[] {32, 34, 28, 29, 31, 33},6 )));
    }

    public static int[] recordTemperatures(int[] temps, int size) {

        int min = temps[0];
        int max = temps[0];


//        for (int i = 0; i < temps.length; i++) {
//
//            if (temps[i] < min){
//                min = temps[i];
//            }
//
//        }

        for (int temp : temps) {

            if(temp < min){
                min = temp;
            }
            if (temp > max){
                max = temp;
            }

        }

        int[] array = {min,max};


        return array;
    }

}
