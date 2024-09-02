package Muhtar_SDET.Day40_Collections_Continue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random
                                                        // does not accept null

        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        //queue1.addAll(Arrays.asList(null, null, null)); // gives error nullpointerexception

        System.out.println(queue1);
        int num1 = queue1.poll();  // ==> FIFO // first element is removed
        System.out.println(queue1);

        System.out.println("---------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order

        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue2);

        queue2.poll(); // FIFO

        System.out.println(queue2);



        Queue<Integer> queue3 = new LinkedList<>();

        System.out.println("---------------------------------------------------------");

        List<Integer> list = new LinkedList<>();





    }
}
