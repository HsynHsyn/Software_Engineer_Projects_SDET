package Muhtar_SDET.Day17_ClassAndObject_Intro.Task2_Item;

public class Item {
    public String itemName;
    public double unitPrice;
    public int quantity;
    public double calculate;

    public void setInfo(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }


    public void calcCost(){
        calculate = unitPrice * quantity;
        System.out.println(calculate);
    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calculate +
                '}';
    }
}


