package week09;
/*
   primitive -> Wrapper classes
        byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        char -> Character
        boolean -> Boolean

Convert primitive to object
 */
public class WrapperClasses {
    public static void main(String[] args) {
        //Max, min
        System.out.println("Max int = " +Integer.MAX_VALUE);
        System.out.println("Min int = " + Integer.MIN_VALUE);

        //Converting from String to integer
        String price = "$18.99";
        price = price.replace("$","");
        double priceOfItem = Double.parseDouble(price);
        if (priceOfItem > 0) {
            System.out.println("Price verification Passed");
        } else {
            System.out.println("Price verification failed");
        }

        //verify reviews is more than 23k
        String reviews = "23,914";
        reviews = reviews.replace(",","");
        //convert from String to integer
        int reviewsCount = Integer.parseInt(reviews);
        System.out.println("reviewsCount = " + reviewsCount);
        if (reviewsCount > 23000) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //Autoboxing, from primitive to Wrapper object
        int a = 10;
        Integer b = a;
        
        //Unboxing, from wrapper class object to primitive
        Integer c = 55;
        int d = c;
        //max, min
        int i = Integer.max(10, 50);
        System.out.println("i = " + i);

        char ch = 'a';
        System.out.println("isLetter = "+ Character.isLetter(ch));
        System.out.println("isUppercase Letter = "+ Character.isUpperCase(ch));
        char n = '4';
        System.out.println("isDigit = " + Character.isDigit(n));

        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println(Character.isLetterOrDigit(n));
    }
}
