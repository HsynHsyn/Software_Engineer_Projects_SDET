package Saturday_Reviews.week14.olympic;

public class Surfing extends OlympicSport {

    public Surfing(int participants) {
        super("Surfing", participants);
    }

    @Override
    public void compete() {
        super.compete();//parent version
        System.out.println("surfing the waves");
    }
}
