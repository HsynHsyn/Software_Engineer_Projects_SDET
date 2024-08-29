package Saturday_Reviews.week14.olympic;

public class Soccer extends OlympicSport {

    public Soccer(int participants) {
        super("Soccer", participants);
    }

    @Override
    public void compete() {
        super.compete();
        System.out.println("playing soccer");
    }

}