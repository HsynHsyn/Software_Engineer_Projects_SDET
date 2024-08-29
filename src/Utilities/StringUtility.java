package Utilities;

public class StringUtility {
    public static void main(String[] args) {

        String str = "Java";
        String reverse = ""; //
        for (int i = str.length() - 1; i >= 0; i--) { // i : index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // to get each characters of the string starting from last index to index zero
        }
        System.out.println(reverse);

        String name = "Hakan Ozdemir";

        reverse(name);
    }

    public static String reverse(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String RemoveDuplicate(String str) {

        String unique = "";
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!unique.contains("" + each)) {
                unique += each;
            }

        }
        return unique;
    }

    public static String frequency(String str) {

        String unique = "";
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!unique.contains("" + each)) {
                unique += each;
            }

        }
        return unique;
    } // I will add code

}
