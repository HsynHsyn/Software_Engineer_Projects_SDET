package Muhtar_SDET.Day15_WhileLoop;

public class test1 {
    public static void main(String[] args) {

            for (int i = 1; i <= 100 ; i++) { // it is used for loop because we know the ending point

                if (i % 5 == 0 )  {   // it should give zero remainder when divide both 3 and 5 in this condition
                    System.out.print("RA ");
                } else if ( i % 3 == 0) {
                    System.out.print("FIN ");     // it should give zero remainder when divides 3
                }else if (i % 3 == 0 && i % 5 == 0 ) {
                    System.out.print("FINRA ");     //it should give zero remainder when divides 5
                }else {
                    System.out.print(i + " ");  // other numbers will print this line
                }

            }

            System.out.println();
  }

}
