package Saturday_Reviews.week10;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {


        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1,2,3,4,5));


        for (Integer i : integerList) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
            break;
        }

    }
}
