package Muhtar_SDET.Day19_ArraysIntro;

import java.text.DecimalFormat;

public class DecimalFormatt {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.000");

        double n1 = 10.00546;

        System.out.println(df.format(n1));


    }
}
