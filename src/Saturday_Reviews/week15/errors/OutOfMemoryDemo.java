package Saturday_Reviews.week15.errors;

import java.util.ArrayList;

// below code will create OutOfMemoryDemo error, java heap size is full
public class OutOfMemoryDemo {
    public static void main(String[] args) {
        int counter = 0;
        ArrayList<String> list = new ArrayList<>();
        while (true){
            list.add("java");
            System.out.println(counter++);
        }
    }
}
