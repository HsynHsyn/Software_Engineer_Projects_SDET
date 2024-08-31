package Saturday_Reviews.week15.throw_keyword;

public class TestWebSite {
    public static void main(String[] args) {
        try {
            Website etsy = new Website("www.etsy.com");
            Website cydeoLMS = new Website("hi");
            Website google = new Website("www.google.com");
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End");

    }
}
