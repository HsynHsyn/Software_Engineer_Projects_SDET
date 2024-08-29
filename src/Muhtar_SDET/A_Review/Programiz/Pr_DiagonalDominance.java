package Muhtar_SDET.A_Review.Programiz;

import java.util.Arrays;

public class Pr_DiagonalDominance {

    public static void main(String[] args) {

        int[][] matrix = {{2, 4}, {5, 6}};
        System.out.println(checkDiagonalDominance(matrix));

    }

    public static String checkDiagonalDominance(int[][] matrix) {

        for (int i = 0, k = 0 ; i < matrix.length-1; i++, k++) {

            int sumMatrix = 0;
            int diagonal = matrix[i][i];
            for (int j = 0; j < matrix[i].length; j++) {

                sumMatrix += matrix[i][j];

            }
            sumMatrix = sumMatrix- diagonal;

            if (!(matrix[i][i] >= sumMatrix )){
                return "Matrix isn't diagonally dominant";

            }
   }

        return "Matrix is diagonally dominant";
    }
}
// https://app.programiz.pro/community-challenges/challenge/java-diagonal-domination/info