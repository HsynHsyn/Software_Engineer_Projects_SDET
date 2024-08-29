/*
Write a method that accepts 2 strings(str1,str2) and prints the position index of the str2
if str2 is existing in str1.If it does’t exist, print “not found”
checkedString(“Your order confirmation number is XYZ”, “confirmation”) ;
 */

package Preparing.Day20_String_Class_Cont;

public class Task1_CheckString {
    public static void main(String[] args) {

        checkString("Your order confirmation number is XYZ", "confirmation");


}
public static void checkString(String str1, String str2) {
    if(str1.contains(str2)) {
        System.out.println(str1.indexOf(str2));
    }else {
        System.out.println("Not found");
    }
    }
}
