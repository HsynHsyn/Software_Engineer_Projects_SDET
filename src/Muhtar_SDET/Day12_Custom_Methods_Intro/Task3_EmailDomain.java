package Muhtar_SDET.Day12_Custom_Methods_Intro;

public class Task3_EmailDomain {
    public static void main(String[] args) {
        emailDomain("Cydeo@gmail.com");
        emailDomain("Cydeo@hotmail.com");
    }
    public static void emailDomain(String email){

        email = email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain: " + email);


    }
}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */