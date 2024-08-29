package Muhtar_SDET.A_Review.Programiz;

public class Pr_ThreeConsecutiveCommonNumber {
    public static void main(String[] args) {

        System.out.println(hasThreeConsecutiveCommonNumbers((new int[]{1,2,2,2,3}),5));
    }

    public static boolean hasThreeConsecutiveCommonNumbers(int[] arr, int arrSize) {
        boolean result = true;
        if (arr.length<3){
            return false;
        }

        for (int i = 0; i < arrSize-3; i++) { // if j is added to i arrSize must be set
            result = true;
            for (int j = 0; j < 3; j++) {

                if (!(arr[i] == arr[i+j])){
                    result = false;
                }

            }

        }
        return result;
    }
}



// https://app.programiz.pro/community-challenges/challenge/java-three-consecutive-common-numbers/info