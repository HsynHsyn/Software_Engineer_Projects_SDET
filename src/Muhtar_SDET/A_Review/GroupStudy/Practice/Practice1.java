package Muhtar_SDET.A_Review.GroupStudy.Practice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] scores = new int[5] ;

        //System.out.println(Arrays.toString(scores));
        //System.out.println(scores[0]);
        scores[0]= 34;
        scores[1]= 98;
        scores[2]= 78;
        scores[3]= 44;
        scores[4]= 77;

        //scores[6] = 101;

       // scores[5] = 100;
        // scores[-1]= 50;

       // System.out.println(Arrays.toString(scores));
        //System.out.println(scores[5]);

       // scores = new int[10] ;

        System.out.println(Arrays.toString(scores));

        System.out.println("------------------------------------------------------");
        int[] nums1 = new int[] {1,2,3,4,5};

        for (int i = 0; i < nums1.length -2 ; i+=3) { // length variable
            System.out.println(nums1[i+2]);

        }
        System.out.println("------------------------------------------------------");
        String[] days;
        days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        String[] a1 =  {"Umran", "Mehmet"};

        a1 = new String[]{"James", "Daniel"};

        System.out.println(Arrays.toString(a1));

    }
}
