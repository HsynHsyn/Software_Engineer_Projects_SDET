package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.Tasks;

public class Task1_Pizza {

    public String size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;


    public Task1_Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

    public double calcCost(){ // all instances initialized so no need to add parameter to calcCost() method
        double totalCost = 0;
        switch (size.toLowerCase()){
            case "small" -> totalCost = 10 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2 ;
            case "medium" -> totalCost = 12 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2 ;
            case "large" -> totalCost = 14 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2 ;
        }

        return totalCost;

    }

    public String toString() {

        return "Task1_Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total Cost = " + calcCost() + // if there is any parameter in the method , it must add as a parameter
                '}';
    }
}

/*
Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */