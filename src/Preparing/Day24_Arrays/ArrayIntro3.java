package Preparing.Day24_Arrays;

public class ArrayIntro3 {
    public static void main(String[] args) {

        //int [] myList = new int[5];
        // int [] myList ;
        //myList = new int[6];
        int[] myList = {1,25,503,8};

        System.out.println(myList[0]);
        System.out.println(myList[1]);
        System.out.println(myList[2]);
        System.out.println(myList[3]);

        System.out.println(myList.length); // 4

        System.out.println("----------------------");

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);

        }

    }
}
