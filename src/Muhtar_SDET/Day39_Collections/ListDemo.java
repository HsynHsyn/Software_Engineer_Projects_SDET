package Muhtar_SDET.Day39_Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        //List<Integer> arrayList = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>(); // get() is faster
        //arrayList.get(0);
       //List<Integer> LinkedList = new LinkedList<>();// parent -> child

        LinkedList<Integer> linkedList = new LinkedList<>();// Node base class(Doubly linked list) == Inserting and deleting the element is faster others same with arraylist
       // linkedList.get(0);

        System.out.println("--------------------------------------------");

        // vector class is synchronized
        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);


        vector.get(0);
        System.out.println("----------------get----------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack.get(0));

        System.out.println(stack);
        // pop() brings last element and remove last element at the same time
        stack.pop();
        stack.pop();
        System.out.println("test " + stack);

        // this continuous to remove
        int lastSecondElement = stack.pop();
        System.out.println(lastSecondElement);
        System.out.println(stack);










    }
}
