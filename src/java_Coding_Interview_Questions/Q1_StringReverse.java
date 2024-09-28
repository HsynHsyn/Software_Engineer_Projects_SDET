package java_Coding_Interview_Questions;

public class Q1_StringReverse {
    public static void main(String[] args) {
        System.out.println(reversed("Hakan"));
    }

    public static String reversed(String str){
        String reversedString = "";

        for (int i = str.length()-1; i>=0; i--){
            reversedString += str.charAt(i);

        }


        return reversedString;
    }
}
