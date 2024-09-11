package Muhtar_SDET.Day43_CollectionsAndMaps.arrayDeque_CustomerSupport;

public class Support {
    public static void main(String[] args) {

        CustomerSupport team =  new CustomerSupport();
        System.out.println(team);

        team.call("James", "REJ*824");
        team.call("Kelly", "LEP*001");
        team.call("Jane", "REJ*823");

        System.out.println(team);

        System.out.println(team.getSupportQueue().peek()); // get head of the element
        team.help();
        System.out.println(team);

        System.out.println("---------------------------------------------------");

        team.call("Molly", "DE91254");
        team.help();
        System.out.println(team);

    }
}
