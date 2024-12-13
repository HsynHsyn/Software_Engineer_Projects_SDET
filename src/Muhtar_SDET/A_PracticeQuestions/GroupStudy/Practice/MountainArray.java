package Muhtar_SDET.A_PracticeQuestions.GroupStudy.Practice;

public class MountainArray {
    public static void main(String[] args) {

        System.out.println(isMountainArray((new int[] {0,3,4, 3, 7, 15,5,9,12}),5));
    }

    public static boolean isMountainArray(int[] arr, int size){


     int max = arr[0];
        /*Arrays.sort(arr);
        int max1 = arr[arr.length-1];
        int min1 = arr[0];
        System.out.println(max1);*/

        for (int each : arr) {

            if (each > max){
                max = each;
            }

        }

        for (int i = 0; i < arr.length-1; i++) {

            if (max == arr[i] && arr[i] > arr[i + 1]) {
                return true;
            }

        }

        return false;

    }

}
