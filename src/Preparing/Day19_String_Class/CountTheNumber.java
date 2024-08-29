package Preparing.Day19_String_Class;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class CountTheNumber {

    public static void main(String[] args) {

        String str= "abcabqcabc";
        char myChar='a';
        int counter=0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == myChar) {
                counter++;
            }
        }
        System.out.println(" Count for "+ myChar+ " is "+ counter);

    }

    }
