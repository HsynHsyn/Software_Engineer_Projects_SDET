package Muhtar_SDET.Day17_ClassAndObject_Intro.Task3_Address;

public class AddressClients {
    public static void main(String[] args) {

        Address address1 = new Address();

        address1.setInfo(7925,"Jones Branch Dr","McLean","VA", 22012 );

        System.out.println(address1);
        address1.showAddress();
    }
}
