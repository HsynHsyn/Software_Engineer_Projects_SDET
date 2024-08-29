package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro.Tasks;

public class Task2_Carpet  {

    public int width,length;
    public double unitPrice;
    public boolean isPersian;

    public Task2_Carpet(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalCost = (width * length) * unitPrice;
        if (isPersian){
            totalCost += 200;
        }
       return totalCost;
    }

    public String toString() {
        return "Task2_Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=" + calcCost() +
                '}';
    }
}

/*
Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */