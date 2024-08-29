package Preparing.Day20_String_Class_Cont;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class String_indexOf2 {
    public static void main(String[] args) {
        // index of with 2 values
        String list ="html-selenium--angular-jenkins-grid";
        int firstDash= list.indexOf("-"); // also we can use "-"
        System.out.println(firstDash);

        int secondDash= list.indexOf("-",5); // uses overloading method
        System.out.println(secondDash);

        int thirdDash= list.indexOf("-", secondDash+1); // goes from left to right index
        System.out.println(thirdDash);

        System.out.println("*********************************");
        System.out.println(list.length());
        int lastDash=list.lastIndexOf("-");
        System.out.println(lastDash);

        int lastDash1=list.lastIndexOf("i");// goes from right to left index
        System.out.println(lastDash1);
        System.out.println("*********************************");

        int x = list.indexOf("-");
        System.out.println(x);

        int lastDash2=list.lastIndexOf("g",32);
        System.out.println(lastDash2);





    }
}
