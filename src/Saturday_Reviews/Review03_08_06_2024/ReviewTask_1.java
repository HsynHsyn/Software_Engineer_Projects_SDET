package Saturday_Reviews.Review03_08_06_2024;

public class ReviewTask_1 {
    public static void main(String[] args) {

        String food = "Burger, fries, drink";
        double item1Price, item2Price, item3Price;
                item1Price = 50;
                item2Price = 20;
                item3Price = 30;
        double total = item1Price+ item2Price + item3Price;

        System.out.println("Items you ordered = " + food);
        System.out.println("your total is $" + total );

        double tip1,tip2,tip3;
                tip1 = item1Price*10/100;
                tip2 = item1Price*18/100;
                tip3 = item1Price*25/100;

        System.out.println("tip1 is $" + tip1);
        System.out.println("tip2 is $" + tip2);
        System.out.println("tip3 is $" + tip3);





    }
}

/*
TipOptions [variables, operators, concatenation]

    Declare and assign the following variables
        String food (list of all the food items),
        double item1Price, item2Price, item3Price
        total (amount you owe) includes all item prices

    show the receipt of all the items and total cost of the bill
    then display 3 tip options and how much they would cost.
    show the tip for 10%, 18% and 25%
 */