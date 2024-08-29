/*
 Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39

Expected Output
25 != 39
25 < 39
25 <= 39
 */

package Preparing.Rewieving;

import java.util.Scanner;
public class NewTask01_CompareTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        int firstInt= sc.nextInt();
        int secondInt= sc.nextInt();


        if (firstInt!=secondInt) {
            System.out.println(firstInt +"!=" + secondInt);
        }if (firstInt<secondInt) {
            System.out.println(firstInt + "<" + secondInt);
        }if (firstInt<=secondInt){
            System.out.println(firstInt+ "<" + secondInt);
        }

    }

}
