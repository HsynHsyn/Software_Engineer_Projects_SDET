package Saturday_Reviews.week14.language;

public class TestLanguage {
    public static void main(String[] args) {

        English english = new English();
        Spanish spanish = new Spanish();
        Arabic arabic = new Arabic();

        System.out.println(english.hello());
        System.out.println(english.bye());

        System.out.println(spanish.hello());

        System.out.println(arabic.bye());
        System.out.println("--------------------------------------");

        Language language = new English();
        System.out.println(language.hello());
        System.out.println(language.bye());

        System.out.println("--------------------------------------");
        Language language1 = new Spanish();
        System.out.println(language1.hello());
        System.out.println(language1.bye());

        System.out.println("--------------------------------------");
        Language language2 = new Arabic();
        System.out.println(language2.hello());
        System.out.println(language2.bye());
        Language.description();// static method


    }
}
