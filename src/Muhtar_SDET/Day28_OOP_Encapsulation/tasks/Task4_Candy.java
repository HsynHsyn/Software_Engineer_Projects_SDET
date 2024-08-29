package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

public class Task4_Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Task4_Candy(String brand, int quantity, boolean hasPeanuts, double price) {
        setBrand(brand);
        setQuantity(quantity);
        setHasPeanuts(hasPeanuts);
        setPrice(price);

    }

    public String getBrand(){
        if (brand == null){
            return "Unknown";
        }
        return brand;
    }

    public void setBrand(String brand){
        if (brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand can not be blank or empty");
            System.exit(1);
        }
        this.brand = brand;
    }

    public double getPrice() {

        return price;
    }



    public void setPrice(double price) {
        if ( price < 0 ){
            System.err.println("The price of candy cannot be a negative value.");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if ( quantity < 0 || quantity == 0 ){
            System.err.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public String toString() {
        String priceString = (price == 0) ? "free" : String.format("$%.2f", price);
        return "Task4_Candy{" +
                "brand='" + getBrand() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + priceString +
                ", hasPeanuts=" + isHasPeanuts() +
                '}';
    }
}

/*
Create a custom class named Candy with the following specifications:

	Attributes:
		brand
		quantity
		price
		hasPeanuts

	Ensure encapsulation for all fields.
		Conditions:
			The price of candy cannot be set to a negative value.
			The quantity of candy cannot be set to zero or a negative value.

	Add a constructor that allows the user to set all fields during object creation.

	Actions:
		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.
 */