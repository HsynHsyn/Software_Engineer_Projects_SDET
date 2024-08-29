package Muhtar_SDET.Day22_WrapperClasses_ArrayListIntro;

public class WrapperClassMethods {
    public static void main(String[] args) {

        // parse method     : returns primitive type, converts String to primitive values
        //valueOf method    : returns wrapper class objects, converts String to wrapper class values
        // int number = Integer.parseInt("123");
        // Integer number = Integer.valueOf("123");

        String str = "20";

        Integer num1 =  Integer.parseInt(str); // autoboxing //
        System.out.println(num1);
        int num =  Integer.parseInt(str); // both side are primitive int so neither autoboxing nor unboxing

        Integer num2= Integer.valueOf(str); // both side are primitive int so neither autoboxing nor unboxing

        System.out.println("----------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println("----------------------------------------");

        String x = "true";

        String x1 = "Maybe"; // it gives false just check true and false
        boolean r1 =  Boolean.parseBoolean(x); // parseBoolean method is case-sensitive but valueOf not
        Boolean r2 =  Boolean.valueOf(x);

        System.out.println("----------------------------------------");
        //isDigit(), isLetter(), isLowerCase(),isUpperCase(), isLetterOrDigit(),
        char ch = '1';
        char ch1 = 'A';

        boolean isDigit = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch1); // returns boolean

        boolean isLowerCaseLetter = Character.isLowerCase(ch1); // returns boolean

        boolean isUpperCaseLetter = Character.isUpperCase(ch1); // returns boolean

        boolean isSpecialChar = ! Character.isLetterOrDigit(ch1); // special character


        System.out.println(isDigit); // true

        System.out.println("----------------------------------------");

        String string = "a1b2c3d4e5"; // calculate sum of all the digit which in the string

        int sum = 0;
        for (char each : string.toCharArray()){ // toCharArray()  convert from string to Array , we cannot use Collections in there because it must be arraylist
            if (Character.isDigit(each)){
                sum += Integer.parseInt("" + each); // parseInt use string and  this (is "" + each) must be string, converted from string to int


            }
        }

        System.out.println("sum = " + sum);

    }

}
