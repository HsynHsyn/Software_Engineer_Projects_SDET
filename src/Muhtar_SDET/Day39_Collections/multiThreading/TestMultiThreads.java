package Muhtar_SDET.Day39_Collections.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);

        // both of them run at the same time, noun as multi threading
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
