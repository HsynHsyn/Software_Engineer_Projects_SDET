package Saturday_Reviews.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Arraylist declarations:
        //1) Raw type. Not specifying data type. Not recommended
        ArrayList list1 = new ArrayList();
        list1.add(123);
        list1.add("hi");
        list1.add(33.4);
        list1.add('J');
        System.out.println("list1 = " + list1);

        //2) Specify data type. recommended
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list2.add(12);
        list2.add(55);
        list3.add(44);

        //3) Using List interface. Most common way.
        List<Integer> int1 = new ArrayList<>();
        List<String> strings = new ArrayList<>();  ///important
        strings.add("java");
        strings.add("ruby");
        System.out.println("strings = " + strings);

        //4) using var for the variable data type
        var days = new ArrayList<String>(); // var (keyword) java guesses datatype with var
        days.add("Monday");
        days.add("Tuesday");
        System.out.println("days = " + days);

        //ASSIGNING VALUES:
        //1) declare arraylist and use add method
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        System.out.println("colors = " + colors);

        //2) Arrays.asList() - declare and assign values in same statement
        ArrayList<String> colors2 = new ArrayList<>(Arrays.asList("white", "grey", "brown"));
        System.out.println("colors2 = " + colors2);

        colors2.addAll(Arrays.asList("pink", "blue"));
        System.out.println("colors2 = " + colors2);


        //3) List.of() - declare and assign Non-Modifiable arraylist// be careful about this , can not change
        List<String> topics = List.of("java","selenium","api","sql","mobile");
        //topics.add("playwright"); //.UnsupportedOperationException // gives an error
        System.out.println("topics = " + topics);

        //4) Array.asList() directly. Non-modifiable list , can not change
        List<String> daysList = Arrays.asList("Mon","Tue","Wed","Thur");
        daysList.add("Fri"); //.UnsupportedOperationException // gives an error
        System.out.println("daysList = " + daysList);
    }
}