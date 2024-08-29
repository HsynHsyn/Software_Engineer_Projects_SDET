package Saturday_Reviews.week9;

import java.util.*; //import all classes in util package

public class LoopingArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("red","black","grey","blue","purple"));
        System.out.println("colors size = " + colors.size() );

        System.out.println("First color = " + colors.get(0));
        System.out.println("Last color = " + colors.get(4));
        System.out.println("Last color = " + colors.get(colors.size()-1));

        //1) for loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(i +" -> " + colors.get(i));
        }

        //2) for each loop:
        for (String eachColor : colors) {
            System.out.println("eachColor = " + eachColor);
            //colors.remove(eachColor);//ConcurrentModificationException.
        }

        //3) while loop with iterator
        Iterator<String> it = colors.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            //it.remove();
        }

        /*IQ: For each loop vs Iterator:
              - In For each loop, we cannot modify(modify) arraylist
              - in Iterator, we can modify arraylist(remove, add etc)
        */
    }
}
