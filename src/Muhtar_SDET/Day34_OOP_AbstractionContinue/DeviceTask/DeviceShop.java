package Muhtar_SDET.Day34_OOP_AbstractionContinue.DeviceTask;

import Muhtar_SDET.Day32_FinalKeyword.personTask.Person;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "Iphone 16", 1000, "Silver Grey", true,true, 01234567);

        System.out.println(iphone);

        Samsung samsung = new Samsung("Samsung", "S21", 900, "White", false,true, 0000000);

        System.out.println(samsung);
        samsung.downloadApp();

        System.out.println(samsung instanceof Device); // instanceof

        System.out.println("---------------------------------------------------------------------------");

        PersonalComputer personalComputer = new PersonalComputer("Apple", "Iphone 16", 1000.0, "Silver Grey", true,true, (short) 250, (short) 500);

        System.out.println(personalComputer);
        personalComputer.checkMemory();



    }
}
