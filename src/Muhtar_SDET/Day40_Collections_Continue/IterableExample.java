package Muhtar_SDET.Day40_Collections_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,8,6,84,5,8,5,9,5,8,5,89,90));



       /* for (Integer each : list) { // gives an error
            if (each < 5 ){
                list.remove(each);
            }
        }
        System.out.println(list); */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5){
                list.remove(i);
            }

        }
        System.out.println(list);
    }
}
