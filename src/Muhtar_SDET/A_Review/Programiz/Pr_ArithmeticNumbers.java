package Muhtar_SDET.A_Review.CodingBat;

public class Pr_ArithmeticNumbers {
    public static void main(String[] args) {

        System.out.println(checkArithmetic(new int[]{1,3,5,7,9}));

    }

    public static String checkArithmetic(int[] arr) {


        String result = "Array isn't arithmetic";
        for (int i = 1; i < arr.length-1; i++) {

            if ((arr[i] - arr[i-1]) == (arr[i+1] - arr[i])){

                result =  "Array is arithmetic";
            }

        }

        return result;
    }
}
