package java_Coding_Interview_Questions;

public class  Q2_ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reversedMethod(-35));


    }
    public static int reversedMethod(int number){

        String sayiString = String.valueOf(number);
        String reversed = "-";

        for (int i = sayiString.length()-1; i >0 ; i--) {
            reversed += sayiString.charAt(i);

        }

        int num = Integer.parseInt(reversed);
        return num;
    }

}
