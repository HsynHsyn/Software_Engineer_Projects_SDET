package Preparing.Day25_Arrays_Cont;

import java.util.Scanner;

public class Task6_RainFall {
    public static void main(String[] args) {

        double[] monthRainFall= new double[12]; // Create a monthRainFall arrays which has double 12 values

        String[] months= new String[12]; // Create a months arrays which has 12 string values

        Scanner input = new Scanner(System.in); // Get the input from user

        for (int i = 0; i < months.length; i++) {  // Getting the values until arrays length
            System.out.println("Please enter all months name: ");
            months[i] = input.next();  // Getting the months names as a string and assigned to months arrays

        }

        double maxRain=-1; // it is assigned the -1 values because it must be greater than -1
        double minRain=Double.MAX_VALUE; // when we find rhe min value it is assigned max value of datatype

        for (int i = 0; i < monthRainFall.length ; i++) {
            System.out.println("Please enter month rainfall value : ");

            if (input.nextDouble()<0){ // if value less than 0 user should check their values
                System.out.println("Please enter the value equal or greater than 0");
            }else{
                System.out.println("Please enter month" + (i+1) + " rainfall value : "); // (i+1) means is to give month index
                monthRainFall[i] = input.nextDouble(); // we assigned to values for array
            }

            if (monthRainFall[i] > maxRain) { // checking the value which should be greater than maxRain value
                maxRain =monthRainFall[i];
            }
            if (monthRainFall[i] < minRain  ) { // checking the value which should be less than minRain value
                minRain = monthRainFall[i];
            }
        }

        for (int i = 0; i < monthRainFall.length; i++) { // printing both months name and rainfall values
            System.out.println(months[i] + " : " + monthRainFall[i]);

        }
        // print asking outputs
        System.out.println("The sum of all the rain is : " + totalRainFall(monthRainFall));
        System.out.println("The average rainfall was: " + averageRainFall(monthRainFall));
        System.out.println("The max rain is: " + maxRain);
        System.out.println("The min rain is: " + minRain);

    }

    private static double averageRainFall(double[] monthRainFall) { // finding average value of rainfall values
        double averageRainFall =totalRainFall(monthRainFall) / monthRainFall.length;
        return averageRainFall;
    }

    public static double totalRainFall(double[] monthRainFall) { // finding total rainfall value
        double totalRain = 0;
        for (int  i = 0; i < monthRainFall.length; i++) {
            totalRain += monthRainFall[i];

        }
        return totalRain;
    }

}
/*
Write a RainFall class that stores the total rainfall for each of 12 months into an array of
doubles. The program should have methods that return the following:
- total rainfall for the year
- the average monthly rainfall
- the month with the most rain
- the month with the least rain
Input Validation: Do not accept negative numbers
for the monthly rainfall figures.
 */