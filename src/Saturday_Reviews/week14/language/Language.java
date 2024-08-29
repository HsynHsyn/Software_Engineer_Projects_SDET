package Saturday_Reviews.week14.language;

public interface Language {

    // all variables are public static final
    public static final String DEFAULT_ENCODING = "UTF-8";

    // have to call by interface class name
    //static methods
    public static void description(){

        System.out.println("Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. " +
                "There is often rules or syntax for how the words come together");
    };

    public default void translate(){
        System.out.println("translating....");
    }

    void concreteMethod(); // default abstract


    public abstract String hello();
    public abstract String bye();




}
