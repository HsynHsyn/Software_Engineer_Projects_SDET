package Muhtar_SDET.Day43_CollectionsAndMaps.arrayDeque_CustomerSupport;

import java.util.ArrayDeque;
import java.util.Queue;

public class CustomerSupport {
    private Queue<Customer> supportQueue;

    public CustomerSupport() {
        supportQueue = new ArrayDeque<>();
    }

    public void call(String name, String productId){
        supportQueue.offer(new Customer(name, productId));
    }

    public void help() {
        if (supportQueue.isEmpty()) {
            System.out.println("No customer waiting");
        } else {
            System.out.println("Hello " + supportQueue.poll().getName() + ", " +
                    "how can I help you today?");
        }
    }
    public Queue<Customer> getSupportQueue() {
        return supportQueue;
    }


    @Override
    public String toString() {
        return "CustomerSupport{" +
                "supportQueue=" + supportQueue +
                '}';
    }


}


