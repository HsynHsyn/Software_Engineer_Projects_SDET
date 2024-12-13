package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Pr_LowestCommonMultiple {
    public static void main(String[] args) {

        System.out.println(findLCM(4,5));

    }
    public static int findLCM(int num1, int num2) {

        int smallest = 0;

        if (smallest % num1 == 0 && smallest % num2 ==0 ){
            smallest = num1 * num2 ;
        }

        return smallest;
    }
}
