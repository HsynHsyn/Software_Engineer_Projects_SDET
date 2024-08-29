package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro;

public class TestIphoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12", 1000, "Black" );
        System.out.println(iphone.color);
        System.out.println(iphone.price);
        System.out.println(iphone.model);
        iphone.printPhoneInfo();


        /* // it is not to legal way to call the static members by objects
        System.out.println(iphone.brand);
        System.out.println(iphone.OS);
        iphone.printOperatingSystem();*/

        // it legal way is to call the static members by Classname Iphone
        System.out.println(Iphone.isExpensiveToFix);


    }
}
