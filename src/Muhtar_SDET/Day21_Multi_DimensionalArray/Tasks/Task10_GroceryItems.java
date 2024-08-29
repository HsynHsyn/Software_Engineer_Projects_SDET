package Muhtar_SDET.Day21_Multi_DimensionalArray.Tasks;

import java.util.Arrays;

public class Task10_GroceryItems {
    public static void main(String[] args) {
        //10.1
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        String[][] reverseItems = new String[items.length][];  // setting reverseItems length

        //10.2
        for (int i = 0; i < items.length; i++) { // items arrays prints

            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();

        }
        //10.3
        for (int i = 0; i < items.length; i++) {
            reverseItems[i] = new String[items[i].length]; // It initializes each sub-array of the reverseItems
                                                            // array to have the same length as the corresponding sub-array in the items array
        }
        for (int i = 0; i < items.length; i++) {

            for (int j = items[i].length - 1, k = 0; j >= 0; j--, k++) {// k is new initialize

                reverseItems[i][k] = items[i][j];               // we assigned all value to reverseItems

                System.out.print(reverseItems[i][k] + "\t");
            }
            System.out.println();

        }
        System.out.println("****************************************");
        //10.4
        for (int i = items.length - 1; i >= 0; i--) { // changing items sub-array`s orders
            String[] eachGroup = items[i];
            //System.out.println(Arrays.toString(eachGroup));

            for (String each : eachGroup) { // printing every element of items array.
                System.out.print (each + "\t");
            }
            System.out.println();

        }
    }
}
/*
Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado
 */