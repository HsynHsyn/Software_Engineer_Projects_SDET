package Muhtar_SDET.Day28_OOP_Encapsulation.tasks;

public class Task3_Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Task3_Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);

    }

    public String getName() {
        return name;
    }
/*
The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
 */
    public void setName(String name) {

        if (!Character.isLetter(name.charAt(0))){
            System.err.println("Invalid item name");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid item name");
            System.exit(1);
        }


        for (int i = 0; i < name.length(); i++) {

            if (!Character.isLetterOrDigit(name.charAt(i)) && !((""+name.charAt(i)).equals(" "))){
                System.err.println("Invalid item name");
                System.exit(1);
            }
        }

        this.name = name;

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            System.err.println("Unit price can not be negative ");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("Quantity price can not be negative ");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calCost(){

        double totalCost = unitPrice * quantity;
        return totalCost;

    }

    public String toString() {
        return "Task3_Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", totalCost=" + calCost() +
                '}';
    }
}
/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */