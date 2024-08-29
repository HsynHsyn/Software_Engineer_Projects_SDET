package Saturday_Reviews.week11_review.string;

public class T03SpongeCase {
    public static void main(String[] args) {
        System.out.println(toSpongeCase("hello"));
    }

    public static String toSpongeCase(String input) {

        String result = "";

        for (int i = 0; i < input.length(); i++) {

           if (i % 2 != 0){
              result +=  input.toUpperCase().charAt(i);
           }else {
               result +=  input.charAt(i);
           }

        }

        return result;
    }
}

/* another solution
public class T03SpongeCase {

    public static void main(String[] args) {
        System.out.println(toSpongeCase("JAVA is FUN"));
        System.out.println(toSpongeCase("hello"));
        System.out.println(toSpongeCase("ab1c"));
        System.out.println(toSpongeCase("W"));
        System.out.println(toSpongeCase("Hi"));
    }

    public static String toSpongeCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                result += Character.toLowerCase(input.charAt(i));
            }else{
                result += Character.toUpperCase(input.charAt(i));
            }
        }

        return result;
    }
 */ //another solution this is best practice

/*
In Sponge case, every alternate character is capitalized,
including spaces and numbers, as they also take positions for conversion.

toSpongeCase("java is fun") => "jAvA iS FuN"
toSpongeCase("hello") => "hElLo"
toSpongeCase("ab1c") => "aB1C"
toSpongeCase("w") => "w"
 */