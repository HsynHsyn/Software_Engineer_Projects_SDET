package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Pr_PronicNumber {

    public static void main(String[] args) {
        System.out.println(calculateDivisors(12));
    }

    public static int calculateDivisors(int num) {

        int count = 0;
        for (int i = 1 ; i <= num; i++) {

            if (num % i == 0){
                count ++;

            }

        }

        return count;
    }

}
/*
to calculate the number of divisors of a number

12 has 6 divisors: 1,2,3,4,6,12
 */