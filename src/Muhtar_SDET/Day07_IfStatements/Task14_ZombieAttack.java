package Muhtar_SDET.Day07_IfStatements;

public class Task14_ZombieAttack {
    public static void main(String[] args) {

        int inhabitants = 20;

        int day =0;
        while (inhabitants>0) {

            //int reminder = inhabitants %2;
            System.out.println("Day " + day + " [ " + inhabitants + " ]");
            inhabitants = inhabitants/2 ; //+ reminder;
        }
        System.out.println("---- EXTINCT ----");

    }
}

/*
    There is a zombie disease pandemic wiping out populations. Use a `loop` to keep track of the city's population.
    The starting population is given as the `inhabitants` value. Each day the city is losing half of its population.
    Write the program that will show the population day by day, until the city gets to zero.

        Ex:
          Input:
            6

          Output:
            Day 0 [6]
            Day 1 [3]
            Day 2 [1]
            ---- EXTINCT ----

        Ex:
          Input:
            20

          Output:
            Day 0 [20]
            Day 1 [10]
            Day 2 [5]
            Day 3 [2]
            Day 4 [1]
            ---- EXTINCT ---- */