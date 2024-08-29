package Saturday_Reviews.week14.language;

public class Spanish implements Language{
    @Override
    public void translate() {
        Language.super.translate();
    }

    @Override
    public void concreteMethod() {

    }

    @Override
    public String hello() {
        return "Hola";
    }

    @Override
    public String bye() {
        return "Adios";
    }
}
