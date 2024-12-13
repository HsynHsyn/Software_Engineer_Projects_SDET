package Muhtar_SDET.A_PracticeQuestions.Programiz;

public class Pr_MountainArray {
    public static void main(String[] args) {

        System.out.println(isMountainArray((new int[] {0,3,5,9,12}),5));
    }

    public static boolean isMountainArray(int[] arr, int size) {

        int max = arr[0];

        for (int each : arr) {

            if (each > max){
                max = each;
            }

        }

        for (int i = 0; i < arr.length-1; i++) {

            if (max == arr[i] && arr[i] > arr[i+1] ){

                return true;

            }

        }



        return false;
    }
}

//https://app.programiz.pro/community-challenges/challenge/java-mountain-array/info
//  look at other solution
/*
public static boolean isMountainArray(int[] arr, int size) {
        boolean higher = false, lower = false;
        for(int i = 0; i < size - 1; i++){
            if(arr[i] > arr[i+1])
                lower = true;
            else
                higher = true;
        }
        if(higher && lower)
            return true;
        return false;
    }
 */