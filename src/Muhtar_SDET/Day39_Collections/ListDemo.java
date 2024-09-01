package Muhtar_SDET.Day39_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //List<Integer> arrayList = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>(); // get() is faster
        arrayList.get(0);
       //List<Integer> LinkedList = new LinkedList<>();// parent -> child

        LinkedList<Integer> linkedList = new LinkedList<>();// Node base class(Doubly linked list) == Inserting and deleting the element is faster others same with arraylist
        linkedList.get(0);






    }
}
