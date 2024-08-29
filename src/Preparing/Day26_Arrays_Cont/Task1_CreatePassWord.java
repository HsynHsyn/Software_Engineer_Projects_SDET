package Preparing.Day26_Arrays_Cont;

public class Task1_CreatePassWord {
    public static void main(String[] args) {
        String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
        String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

        String[] info1Array= info1.split("password :");
        String[] info2Array= info2.split("password :");
       // String[] info3Array= info2.split("This info is used for creation password : ");  // another split solution
        //String pass3 = info3Array[1].split(". Please")[0];
        //System.out.println("pass3 " + pass3);

        System.out.println(info1Array[1]); // xxxCD132Gxxx . Please do not share with anyone

        String pass1 = info1Array[1].split(". Please")[0];
        String pass2 = info2Array[1].split(". Please")[0];

        pass1 = pass1.substring(4,10);
        pass1 = pass2.substring(4,10);

        System.out.println(pass1.trim() + pass2.trim());

        /* second solution
        String newStr = "";
        String newStr1 = "";
        for (int i = 0; i < info1Array.length; i++) {
            if (info1Array[i].equalsIgnoreCase("xxxCD132Gxxx")){
                newStr= info1Array[i].substring(3,9);
            }
            if (info2Array[i].equalsIgnoreCase("xxx00ABC!xxx")){
                newStr1= info2Array[i].substring(3,9);
            }

        }
        String last = newStr + newStr1;
        System.out.println(last);*/

    }
}
/*
String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with
anyone";
String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with
anyone";
Create a password based on given info.
Output: CD132G00ABC!
 */