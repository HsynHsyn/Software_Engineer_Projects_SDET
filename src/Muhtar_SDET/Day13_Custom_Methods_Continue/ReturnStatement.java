package Muhtar_SDET.Day13_Custom_Methods_Continue;

public class ReturnStatement {
    public static void main(String[] args) {

        eligible (200);

    }
    public static void eligible(int age) {

        if (age < 0 || age > 150) {
            System.err.println("invalid age : " + age);
            return; //exits the method, this is not related to return method just terminated the method and there is no return type
        }
        if (age > 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");

        }
    }
}
