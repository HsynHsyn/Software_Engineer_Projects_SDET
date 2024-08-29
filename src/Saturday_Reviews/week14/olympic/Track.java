package Saturday_Reviews.week14.olympic;

public class Track extends OlympicSport{
    public Track(int participants) {
        super("Track", participants);
    }

    @Override
    public void compete() {
        super.compete();
        System.out.println("running in track");
    }
}