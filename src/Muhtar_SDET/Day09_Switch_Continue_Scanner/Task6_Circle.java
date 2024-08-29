package Muhtar_SDET.Day09_Switch_Continue_Scanner;

import java.util.Scanner;
import java.util.logging.SocketHandler;
import java. lang. Math. *;

public class Task6_Circle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Please enter the radius of circle = ");
        double rds = input.nextInt();

        double areaOfCircle =Math.PI * rds * rds;
        double perimeterOfCircle = 2 * Math.PI * rds;

        System.out.println("perimeter = " + perimeterOfCircle);
        System.out.println("area = " + areaOfCircle);


    }
}
/*
Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */