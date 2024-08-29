package Saturday_Reviews.week10;

public class Food {
    //name, quantity, unit price, total price
    public String name;
    public int quantity;
    public double unitPrice;
    public double totalPrice;

    //- create a constructor that creates a Food object with the name:
    // Food food = new Food("bread");
    public Food(String name) {
        this.name = name;
    }

    //constructor that creates a Food object with the name and quantity
    //// Food food = new Food("bread", 5);
    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //constructor that creates a Food object with the name, quantity, and unit price
    // Food food = new Food("bread", 5, 4.50);
    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity); // calls previous constructor
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    //calculatePrice() method. calculates and assigns totalPrice
    public double calculatePrice() {
        totalPrice = quantity * unitPrice;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=$" + unitPrice +
                ", totalPrice=$" + totalPrice +
                '}';
    }
}
/*
`Food [class, object, constructor, array]
    create a class called Food
        define these instance variables
            name, quantity, unit price, total price

       constructors
            - create a constructor that creates a Food object with the name
            - create a constructor that creates a Food object with the name and quantity
            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

       methods:
            - calculatePrice(): multiply the quantity by unit price and assign the value to the total price
            - toString()
                return all the Food information

    Create a separate class to create and test the Food objects
        try making an array of Food objects
        find all the Food objects that start with 'a' and print the Food object
        find all the Food objects that have a total price over 20 and print the name of the food`
 */














