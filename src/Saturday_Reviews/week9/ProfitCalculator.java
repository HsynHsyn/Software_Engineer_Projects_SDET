package Saturday_Reviews.week9;


import java.text.DecimalFormat;
import java.util.*;
/*
ProfitCalculator [Wrapper class, ArrayList, loop, Collections]

        ArrayList<Double> lastYear = new ArrayList<>(Arrays.asList(30.67, 16.34, 10.93, 5.01, 12.97, 11.73, 22.35, 33.9, 68.35));
        ArrayList<Double> currentYear = new ArrayList<>(Arrays.asList(32.24, 15.9, 11.57, 9.14, 10.42, 21.56, 14.16, 42.49, 54.5));

    You are giving two ArrayList of Double values that represent the profits from last year and the current year.
    Each position (index) between the two ArrayList are related, so index 0 are the profits from one department.
    For example in our data the 30.67 and 32.24 were the profits from one department but over the last year and
    current year.
    Calculate the different in profits over these two years and store them into a new ArrayList
        for example the first difference would be 32.24 and 30.67
    Format and parse the value to only be 2 decimal points

    Then find the following:
        - what the biggest profit was
        - what the biggest lost was
        - the average profit
 */
public class ProfitCalculator {
    public static void main(String[] args) {
        ArrayList<Double> lastYear =    new ArrayList<>(Arrays.asList(30.67, 16.34, 10.93, 5.01, 12.97, 11.73, 22.35, 33.9, 68.35));
        ArrayList<Double> currentYear = new ArrayList<>(Arrays.asList(32.24, 15.9,  11.57, 9.14,  10.42, 21.56, 14.16, 42.49, 54.5));
        //List to store profits calculations:
        List<Double> profit = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");

        //Loop and assign values:
        for (int i = 0; i < lastYear.size(); i++) {
            double diff = currentYear.get(i) - lastYear.get(i);
            profit.add(Double.parseDouble(df.format(diff)));
        }

        System.out.println("profit = " + profit);

        //find max profit:
        System.out.println("max = " + Collections.max(profit));

        //find min profit:
        double minProfit = Collections.min(profit);
        System.out.println("minProfit = " + minProfit);

        //Print department index of min profit:
        int deptIndex = profit.indexOf(minProfit);
        System.out.println(deptIndex +" made the lowest profit");

        //average profit:
        double sum = 0;
        for (double eachProfit : profit) {
            sum += eachProfit;
        }

        System.out.println("average = " + df.format(sum / profit.size()));

    }

    }
