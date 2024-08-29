package Muhtar_SDET.Day30_OOP_Inheritance_Continue.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "Large", "Black", 10000);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 11000);

        Nokia nokia = new Nokia("Brick", "Small", "Silver", 5000);


        iphone.call(911);
        samsung.call(911);
        samsung.call(911);

        iphone.text(1234567890);
        samsung.text(1234567890);
        nokia.text(1234567890);

        System.out.println("-------------------------");

        iphone.faceTime(1234567890);
        samsung.freeze();
        nokia.selfDefense();
        //iphone.selfDefense(); // gives an error
        System.out.println("-------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }
}
