package Saturday_Reviews.week8;

public class test {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "kel";

        String result = "Two strings are not same length";
        if (str1.length() == str2.length()){
            for (int i = 0; i < str2.length(); i++) {
                if (str2.contains(""+str1.charAt(i)) && str1.contains(""+str2.charAt(i)) ){
                    result = "anagram";

                }else {
                    result = "not anagram";
                }

            }
        }
        System.out.println("result = " + result);
    }
}
