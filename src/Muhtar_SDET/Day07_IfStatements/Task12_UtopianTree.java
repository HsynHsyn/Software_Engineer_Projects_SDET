package Muhtar_SDET.Day07_IfStatements;

public class Task12_UtopianTree {
    public static void main(String[] args) {

        int year = 10;
        int growth = 0;

        for (int i = 1; i <= 10; i++) {
            if (i <= 3){
                growth +=1;

            }else {
                growth +=2 ;
            }

        }
        System.out.println("year is : " + year + " growth is : " + growth);
    }
}

/*
    Use a `loop` to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years,
     and then afterward it grows by 2 cm every year.

    Show the growth of the tree each year up to year 10. See the example flow below.

     Use the format:
     year x - growth x cm
     tree size: x cm

     where the 'x' values are different values of year, the growth amount, and the total tree size up to that year

     Example Flow:
     year 1 - growth 1 cm
     tree size: 1 cm

     year 2 - growth 1 cm
     tree size: 2 cm

     year 3  - growth 1 cm
     tree size: 3 cm

     year 4 - growth 2 cm
     tree size: 5 cm

     year 5 - growth 2 cm
     tree size: 7 cm

     ... until you reach year 10 */