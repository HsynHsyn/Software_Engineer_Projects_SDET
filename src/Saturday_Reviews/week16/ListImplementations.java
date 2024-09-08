package week16;

import java.util.*;

public class ListImplementations {
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        list1.add('A'); //DEFAULT_CAPACITY = 10;
        list1.add('A');
        list1.add('J');
        list1.add('W');
        System.out.println("size = " + list1.size());

        List<Integer> list2 = new ArrayList<>(1000);//Object[] data=new Object[1000];
        list2.add(343);
        list2.add(545);
        list2.add(34);
        list2.add(34773);
        for (int i = 5; i <= 1000 ; i++) {
            list2.add(i);
        }
        System.out.println("list2 size =" +list2.size());

        System.out.println("============================");

        List<String> list3 = new LinkedList<>();
        list3.add("hello");
        list3.add("java");
        list3.add(1,"git");
        System.out.println(list3);

        System.out.println(list3.get(0));

        System.out.println("============================");
        List<Integer> list4 = new Vector<>();
        list4.add(12);
        list4.add(54);
        list4.add(null);
        System.out.println("list4 = " + list4);

        System.out.println("============================");

        Stack<String> list5 = new Stack<>(); //LIFO
        list5.push("selenium");
        list5.push("java");
        list5.push("git");
        
        //get top of stack, without removing
        System.out.println(list5.peek());
        System.out.println("list5 = " + list5);

        //Get top of stack and also remove
        System.out.println(list5.pop());
        System.out.println("list5 = " + list5);
        list5.pop();
        list5.pop();
        System.out.println("list5 = " + list5);

    }
}
