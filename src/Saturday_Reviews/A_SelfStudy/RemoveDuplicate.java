package Saturday_Reviews.A_SelfStudy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str1 = "abchhdsssdgabc";
        String unique = "";
        for (int i = 0; i < str1.length(); i++) {

            char each = str1.charAt(i);

            if (!unique.contains(""+each) ) {
                unique += each;
            }

        }
        System.out.println(unique);

    }
}
