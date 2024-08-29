package Preparing.Day20_String_Class_Cont;

import javax.swing.*;

public class Task2_TimeStamp {
    public static void main(String[] args) {
        String test= "10/10/2019 14:59:00";
        System.out.println(timeStamp(test));

    }

    public static String timeStamp(String time){
       time=time.replace("/", "").replace(":","").replace(" ","");
        return time;
    }
}
