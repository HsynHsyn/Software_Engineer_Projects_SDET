package Preparing.Day24_Arrays;

public class Task6_Car2 {
    public static void main(String[] args) {

        String[] carBrands = {"Toyota", "Nissan","BMW","Mercedes","Honda", "Porsche","Ferrari"};

        String result = "";
        for (int i = 0; i < carBrands.length ; i++) {

            if (carBrands[i].equals("Honda")) {
                result = "I found your car Honda in this array";
                break;
            }else {
                result = "I could not find your car Honda in this array";

            }
        }
        System.out.println(result);

    }
}
/*
Create a car array that holds 6 car names inside
Check if your array has the car name “Honda”
If it is , print “ I found your car Honda in this array”
If it is not, print “ I could not find your car Honda in this array”
 */