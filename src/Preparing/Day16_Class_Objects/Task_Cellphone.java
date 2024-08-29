package Preparing.Day16_Class_Objects;

public class Task_Cellphone {
    // Fields
    String brand;
    String screenSize;
    String color;
    int price;

    //Methods, do not type "static".
    public void getBrand() {
        System.out.println("The Phone brand."+brand);
    }

    public void getScreenSize() {
        System.out.println("The Phone screen size."+screenSize);
    }
    public void getColor() {

        System.out.println("The Phone color."+color);
    }

    public void getPrice() {

        System.out.println("The Phone price."+price);
    }

    // Creating an object
    public static void main(String[] args) {
            // Creating an instance of the Car class
            Task_Cellphone myPhone= new Task_Cellphone();
            myPhone.brand= "apple";
            myPhone.screenSize= "10 inches";
            myPhone.color="grey";
            myPhone.price= 1000;

            myPhone.getBrand();
            myPhone.getScreenSize();
            myPhone.getColor();
            myPhone.getPrice();

            System.out.println("Phone Brand: " + myPhone.brand);
            System.out.println("Phone Screen: " + myPhone.screenSize);
            System.out.println("Phone color: " +  myPhone.color);
            System.out.println("Phone prize: " + myPhone.price);



        }


}
