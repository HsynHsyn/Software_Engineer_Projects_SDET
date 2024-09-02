package Muhtar_SDET.Day40_Collections_Continue;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,8,6,84,5,8,5,9,5,8,5,89,90));


        // not able to remove
       /* for (Integer each : list) { // gives an error
            if (each < 5 ){
                list.remove(each);
            }
        }
        System.out.println(list); */

        // not able to remove
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5){
                list.remove(i);
            }

        }
        System.out.println(list);

        System.out.println("-------------------------------------------------------------");
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,5,8,6,84,5,8,5,9,5,8,5,89,90));

        System.out.println(list2);

       Iterator<Integer> it = list2.iterator();

       while (it.hasNext()){
          Integer each =  it.next();
          if (each < 5){
              it.remove();
          }
       }
        System.out.println(list2);

        System.out.println("-------------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,5,8,6,84,5,8,5,9,5,8,5,89,90));

        for (Iterator<Integer> i =list3.iterator(); i.hasNext(); ) {
            Integer each =  i.next();
            if (each < 5){
                i.remove();
            }
        }
        System.out.println("-------------------------------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,5,8,6,84,5,8,5,9,5,8,5,89,90));

        list4.removeIf(each -> each < 5 );

        System.out.println(list4);

        System.out.println("-------------------------------------------------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1,2,3,5,8,6,84,5,8,5,9,5,8,5,89,90));

        list5.removeIf(p-> p < 5);

        System.out.println(list5);

        System.out.println("-------------------------------------------------------------");

    }
}
