package Saturday_Reviews.week9;

import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // try

    }

    public static String checkListEquality(List<Integer> list1, List<Integer> list2) {
        if (list1.equals(list2)) {
            return "Lists are equal";
        }else {
            return "Lists are not equal";
        }
        /*
        if (list1.equals(list2)) {
            return "Lists are equal";
        }
        return "Lists are not equal";

        return list1.equals(list2) ? "Lists are equal" : "Lists are not equal";
         */
    }

    public static int addFirstAndLast(List<Integer> list) {
        if (list.isEmpty()) return 0;

        int sum = list.get(0) + list.get(list.size()-1);
        return sum;


    }
}
