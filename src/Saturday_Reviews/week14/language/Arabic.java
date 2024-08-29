package Saturday_Reviews.week14.language;

public class Arabic implements Language{
    @Override
    public void translate() {
        Language.super.translate();
    }

    @Override
    public void concreteMethod() {

    }

    @Override
    public String hello() {
        return "Salam";
    }

    @Override
    public String bye() {
        return "As salam";
    }
}
