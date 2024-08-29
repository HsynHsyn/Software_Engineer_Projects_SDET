package Preparing.Day16_Class_Objects;

public class Task_Contact {
    // Fields
    String name;
    double phone_number;
    String email;

    public String getName() {

        return ("This is my name: ");
    }

    public double getPhone_number() {
        return phone_number;

    }

    public String getEmail() {
        return ("This is my email: ");
    }

    public static void main(String[] args) {

        Task_Contact myContact = new Task_Contact();
        myContact.name="hakan";
        myContact.phone_number= 42798;
        myContact.email = "hakan@gmsil.com";

        myContact.getName();
        System.out.println(myContact.getName() + myContact.name);
        System.out.println(myContact.getName() + myContact.phone_number);


    }




}




