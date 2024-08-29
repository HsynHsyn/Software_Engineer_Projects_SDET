package Muhtar_SDET.Day38_Exception_Handlings;

import Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.LocalDateIntro;
import Utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        System.out.println("Hello Cydeo");

        //Thread.sleep(3500);
        Library.sleep(3.5); // unhandled exception, checked exception

        System.out.println("How are you today?");

        System.out.println("----------------------------------------------");

        if (LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException(); // BreakTimeException is child class of RuntimeException

        }

       throw  new BreakTimeException("It is time to go home"); // need to create constructor
        //throw  new BreakTimeException();
    }
}
