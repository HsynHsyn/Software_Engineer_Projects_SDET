package Preparing.Day25_Arrays_Cont;

public class Task5_ReturnArray {
    public static void main(String[] args) {

        double[] values;
        values =getArray();

        for(double num : values) {
            System.out.println(num);
        }

    }
    public static double[] getArray(){
        double[] array  ={1.2,3.6,6.7,8.9,9.9};
        return array;
    }
}
