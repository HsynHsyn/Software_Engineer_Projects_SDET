package Saturday_Reviews.week10;
import java.util.*;
public class TestFoodObjects {
    public static void main(String[] args) {

        Food pizza = new Food("Pizza");
        System.out.println(pizza.name); // calls  pizza.name
        System.out.println("pizza = " + pizza);

        //Taco, 4
        Food taco = new Food("Taco",4);
        System.out.println("taco = " + taco);
        //add unit price to taco and get total
        taco.unitPrice = 4.33; // assigned a value to taco unitPrice
        System.out.println("taco total price = " + taco.calculatePrice()); // calls the method
        System.out.println("taco = " + taco);
        
        //apples, 3, 99 cents
        Food apples = new Food("apple", 3, 0.99); // other constructor
        System.out.println("apples = " + apples);
        apples.quantity = 7;

        System.out.println(apples.calculatePrice()); // calls the method
        System.out.println("apples = " + apples);

        ArrayList<Food> foodList = new ArrayList<>();
        // using public Food(String name, int quantity, double unitPrice) collector
        foodList.add(new Food("Apple", 10, 1.50)); // need to add Food object not element
        foodList.add(new Food("Banana", 20, 0.75));
        foodList.add(new Food("Carrot", 15, 0.60));
        foodList.add(new Food("Donut", 5, 2.25));
        foodList.add(new Food("Egg", 30, 0.10));
        foodList.add(new Food("Fish", 8, 3.99));
        foodList.add(new Food("avocado", 12, 2.50));
        foodList.add(new Food("Hamburger", 7, 5.00));
        foodList.add(new Food("Ice Cream", 4, 4.75));
        foodList.add(new Food("Juice", 9, 2.99));


        Food food1 = new Food("Apple", 10, 1.50); // need to add Food object not element
        Food food2 = new Food("Banana", 20, 0.75);
        Food food3 = new Food("Carrot", 15, 0.60);
        Food food4 = new Food("Donut", 5, 2.25);
        Food food5 = new Food("Egg", 30, 0.10);
        Food food6 = new Food("Fish", 8, 3.99);
        Food food7 = new Food("avocado", 12, 2.50);
        Food food8 = new Food("Hamburger", 7, 5.00);
        Food food9 = new Food("Ice Cream", 4, 4.75);
        Food food10 = new Food("Juice", 9, 2.99);


        Food[] newFoodList = {food1, food2, food3,food4,food4,food5,food6,food7, food7, food8,food9, food10};
        ArrayList<Food> newFoodList2 = new ArrayList<>(Arrays.asList(newFoodList)) ;

        ArrayList<Food> newFoodList3 = new ArrayList<>() ;
        newFoodList3.addAll(newFoodList2); // addAll is a collections type so we can not put array in it , array is not collection type
        System.out.println("------------------------------------------------------");
        System.out.println(newFoodList2.get(0).name);
        System.out.println("------------------------------------------------------");





        System.out.println(foodList.get(0).name);
        //print food that starts with letter A
        for(Food food : foodList) {
            if (food.name.toLowerCase().startsWith("a"))
                System.out.println("food = " + food);
        }
        
        //find all the Food objects that have a total price over 20 and print the name of the food
        for (Food food : foodList) {
            if (food.totalPrice > 20.0) {
                System.out.println("food.name = " + food.name);
            }
        }

    }
}
