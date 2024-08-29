package Muhtar_SDET.A_Review.Programiz;

public class Pr_HitTheJackpot {
    public static void main(String[] args) {

        System.out.println(hitTheJackpot(new int[]{5,5,5,5}, 4));


    }

    public static boolean hitTheJackpot(int[] arr, int arrSize) {

        for (int each : arr) {

            if (!(each == arr[0])){
                return false;
            }

        }

        return true;
    }

}
