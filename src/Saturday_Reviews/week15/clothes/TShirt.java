package Saturday_Reviews.week15.clothes;

public class TShirt extends Clothes implements HasHood{

    @Override
    public void wear() {

        System.out.println("Wearing a Tshirt");
    }

    @Override
    public void putOnHood() {
        System.out.println("Wearing a Hood");

    }
}
