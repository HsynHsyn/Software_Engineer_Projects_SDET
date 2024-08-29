package Muhtar_SDET.A_Review.CodingBat;

public class Pr_ColorDifferences {
    public static void main(String[] args) {

        System.out.println(calculateColorDifference(new int[] {255, 255, 255}, new int[] {0, 0, 0}));

    }

    public static double calculateColorDifference(int[] color1, int[] color2) {

        double sqrt =  Math.sqrt(Math.pow((color1[0]-color2[0]),2) + Math.pow((color1[1]-color2[1]),2) + Math.pow((color1[2]-color2[2]),2));

        return sqrt;
    }

}

/*
double cubedValue = Math.pow(number, 3);  // Küpünü alır
double powerValue = Math.pow(number, 4);  // 4. üssünü alır
Math.sqrt() karekok hesaplar
 */
