package Preparing.Day17_JavaMemory_Garbage_Collection_Reading_User_Input;

public class BMW {
    String make; // if we use make = "BMW" it will be default
    String model;
    double price;

    public void showPrice() {

        switch(model){
            case "330i":
                price=40250;
                break;
            case "740i":
                price=85000;
                break;
            case "m3":
                price=65000;
                break;
            default:
                System.out.println(model + " is not available");
                price=0.0;
        }
        System.out.println("Price: " + price);
    }
}
