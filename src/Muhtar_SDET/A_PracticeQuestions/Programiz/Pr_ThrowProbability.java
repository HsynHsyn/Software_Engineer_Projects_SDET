package Muhtar_SDET.A_PracticeQuestions.CodingBat;

public class Pr_ThrowProbability {
    public static void main(String[] args) {

        System.out.println(calculateProbability(10,7));
    }

    public static double calculateProbability(int totalThrows, int successfulThrows) {

        double probability = successfulThrows / (double)totalThrows ;
        System.out.println(probability);

        return probability;
    }


}
