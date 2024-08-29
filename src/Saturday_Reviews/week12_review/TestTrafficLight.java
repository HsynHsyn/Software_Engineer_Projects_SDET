package Saturday_Reviews.week12_review;


public class TestTrafficLight {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight trLight1 = new TrafficLight("Red");
        System.out.println("Color = " + trLight1.getColor());


        TrafficLight trLight2 = new TrafficLight("YELLOW");
        System.out.println("Color = " + trLight2.getColor());

        System.out.println("waiting 1 second");
        trLight2.setColor("red");

        System.out.println("Color = " + trLight2.getColor());

        trLight2.action(); //stop, go, slowdown or stop

        TrafficLight light = new TrafficLight("red");
        light.action();
        for (int i = 5; i >= 0; i--) {
            System.out.println("waiting ... " + i);
            Thread.sleep(1000);
        }
        light.setColor("Green");
        light.action();

    }
}
