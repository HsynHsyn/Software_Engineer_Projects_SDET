package Muhtar_SDET.Day30_OOP_Inheritance_Continue.state;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("VA","Democrat", "Repuclic","Hakan",4000000);
        California california = new California("CA","Democrat", "Repuclic","Huseyin",6000000);
        Texas texas = new Texas("TX","Democrat", "Repuclic","Halime",10000000);
        Florida florida = new Florida("FL","Democrat", "Repuclic","Halime",20000000);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);

        System.out.println(virginia.getName());
        System.out.println(texas.getGovernor());
        System.out.println(california.getAbbreviation());
        System.out.println(florida.getSenator());


        texas.setPoliticalParty("aga");
        System.out.println(texas);

        System.out.println(florida.getAbbreviation());



    }
}
