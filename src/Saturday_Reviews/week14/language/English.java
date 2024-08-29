package Saturday_Reviews.week14.language;

public class English implements Language{
    @Override
    public void translate() {
        System.out.println("translating in english class");
    }

    @Override
    public void concreteMethod() {
        System.out.println("concreteMethod");
    }

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public String bye() {
        return "Bye";
    }
}
