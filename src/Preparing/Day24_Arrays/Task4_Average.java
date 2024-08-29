package Preparing.Day24_Arrays;

public class Task4_Average {
    public static void main(String[] args) {

        int[] scores = {80,30,52,52,32,56,12,45,20,37,89,45,78,56,80};

        int sum =0;

        for (int i = 0; i < scores.length ; i++) {
            sum = sum + scores[i];

        }
        System.out.println("Sum is: " + sum);
        System.out.println("Total element in array is: " + scores.length);
        System.out.println("Average is : " + sum / scores.length);
    }
}
