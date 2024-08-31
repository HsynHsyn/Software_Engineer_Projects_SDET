package Saturday_Reviews.week15.unchecked;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        System.out.println("First line");

        // just catch one fish
        try {
            //String str = null;
            String str = "java";
            System.out.println(str.length()); // 'NullPointerException'

            int[] nums = {4, 2, 34, 2};
            System.out.println(nums[10]); // Array index is out of bounds

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException ");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException ");

        } catch (Exception e) {
            System.out.println("Caught some other exception");
        }

        System.out.println("Last line");

    }
}
