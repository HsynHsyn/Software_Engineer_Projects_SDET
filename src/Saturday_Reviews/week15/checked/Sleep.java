package Saturday_Reviews.week15.checked;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        //handling
        //HANDLE:
        Thread.sleep(-2000);
        try {
            System.out.println("Start");
            Thread.sleep(2000);
            System.out.println("Finish");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("END");
        sleepFor(1000);

    }
    // DECLARE using Throws keyword:
    public static void sleepFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }
}